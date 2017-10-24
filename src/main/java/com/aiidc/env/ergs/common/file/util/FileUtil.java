/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.file.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.aiidc.env.ergs.common.file.FileTarget;

/**
 * @author wuwenjun
 *
 */
public class FileUtil {

	private static final Logger LOG = LoggerFactory.getLogger(FileUtil.class);

	/**
	 * 根据文件名获取ContentDisposition，避免中文乱码
	 * 
	 * @param request
	 * @param fileName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String getContentDisposition(HttpServletRequest request, String fileName) {
		String finalName = "";
		try {
			// 默认采用URLEncoder编码 ，适用于IE浏览器
			String disposition = URLEncoder.encode(fileName, FileConstant.UTF_8);
			boolean flag = true;
			// 如果为firefox浏览器
			if (request.getHeader(FileConstant.USER_AGENT).toLowerCase().indexOf(FileConstant.FIREFOX) > 0) {
				// 采用ISO编码的中文输出，适用于firefox、chrome、safari浏览器
				disposition = new String(fileName.getBytes(FileConstant.UTF_8), FileConstant.ISO_8859_1);
			} else if (request.getHeader(FileConstant.USER_AGENT).toLowerCase().indexOf(FileConstant.OPERA) > 0) {// 如果为opera浏览器
				// 采用filename*方式,适用于opera浏览器
				finalName = "filename*=UTF-8''" + disposition;
				flag = false;
			} else if (request.getHeader(FileConstant.USER_AGENT).toLowerCase().indexOf(FileConstant.APPLEWEBKIT) > 0) {// 如果为chrome浏览器
				disposition = new String(fileName.getBytes(FileConstant.UTF_8), FileConstant.ISO_8859_1);
			} else if (request.getHeader(FileConstant.USER_AGENT).toLowerCase().indexOf(FileConstant.SAFARI) > 0) {// 如果为safari浏览器
				disposition = new String(fileName.getBytes(FileConstant.UTF_8), FileConstant.ISO_8859_1);
			}
			if (flag) {
				finalName = "filename = \"" + disposition + "\"";
			}
		} catch (UnsupportedEncodingException e) {
			LOG.error("字符转换出错：" + e.getMessage());
		}
		return finalName;
	}

	/**
	 * 返回下载文件
	 * 
	 * @param response
	 * @param request
	 * @param file
	 *            文件
	 * @param name
	 *            文件名称
	 */
	public static boolean returnFile(HttpServletResponse response, HttpServletRequest request, File file, String name) {
		try {
			if (file != null && file.exists() && file.isFile()) {
				// 设置下载文件名
				response.setContentType("application/octet-stream;charset=UTF-8");
				response.addHeader("Content-Disposition", "attachment; " + getContentDisposition(request, name));
				response.setContentLength((int) file.length());
				FileInputStream inputStream = new FileInputStream(file);
				OutputStream outputStream = response.getOutputStream();
				byte[] buffer = new byte[2048];
				int count = 0;
				while ((count = inputStream.read(buffer)) > 0) {
					outputStream.write(buffer, 0, count);
					outputStream.flush();
				}
				inputStream.close();
			} else {
				LOG.error(name + "文件未找到");
				return false;
			}
		} catch (FileNotFoundException e) {
			LOG.error(name + "文件未找到：" + e.getMessage());
		} catch (IOException e) {
			LOG.error(name + "文件读写异常：" + e.getMessage());
			return false;
		}
		return true;
	}

	public static boolean returnBigFile(HttpServletResponse response, HttpServletRequest request, File file,
			String name) {
		if (file != null && file.exists() && file.isFile()) {
			BufferedInputStream bis = null;
			try {
				long p = 0L;
				long toLength = 0L;
				long contentLength = 0L;
				int rangeSwitch = 0; // 0,从头开始的全文下载；1,从某字节开始的下载（bytes=27000-）；2,从某字节开始到某字节结束的下载（bytes=27000-39000）
				long fileLength;
				String rangBytes = "";
				fileLength = file.length();

				// get file content
				InputStream ins = new FileInputStream(file);
				bis = new BufferedInputStream(ins);

				// tell the client to allow accept-ranges
				response.reset();
				response.setHeader("Accept-Ranges", "bytes");

				// client requests a file block download start byte
				String range = request.getHeader("Range");
				if (range != null && range.trim().length() > 0 && !"null".equals(range)) {
					response.setStatus(javax.servlet.http.HttpServletResponse.SC_PARTIAL_CONTENT);
					rangBytes = range.replaceAll("bytes=", "");
					if (rangBytes.endsWith("-")) { // bytes=270000-
						rangeSwitch = 1;
						p = Long.parseLong(rangBytes.substring(0, rangBytes.indexOf("-")));
						contentLength = fileLength - p; // 客户端请求的是270000之后的字节（包括bytes下标索引为270000的字节）
					} else { // bytes=270000-320000
						rangeSwitch = 2;
						String temp1 = rangBytes.substring(0, rangBytes.indexOf("-"));
						String temp2 = rangBytes.substring(rangBytes.indexOf("-") + 1, rangBytes.length());
						p = Long.parseLong(temp1);
						toLength = Long.parseLong(temp2);
						contentLength = toLength - p + 1; // 客户端请求的是
															// 270000-320000
															// 之间的字节
					}
				} else {
					contentLength = fileLength;
				}
				// 如果设设置了Content-Length，则客户端会自动进行多线程下载。如果不希望支持多线程，则不要设置这个参数。
				// Content-Length: [文件的总大小] - [客户端请求的下载的文件块的开始字节]
				response.setHeader("Content-Length", new Long(contentLength).toString());

				// 断点开始
				// 响应的格式是:
				// Content-Range: bytes [文件块的开始字节]-[文件的总大小 - 1]/[文件的总大小]
				if (rangeSwitch == 1) {
					String contentRange = new StringBuffer("bytes ").append(new Long(p).toString()).append("-")
							.append(new Long(fileLength - 1).toString()).append("/")
							.append(new Long(fileLength).toString()).toString();
					response.setHeader("Content-Range", contentRange);
					bis.skip(p);
				} else if (rangeSwitch == 2) {
					String contentRange = range.replace("=", " ") + "/" + new Long(fileLength).toString();
					response.setHeader("Content-Range", contentRange);
					bis.skip(p);
				} else {
					String contentRange = new StringBuffer("bytes ").append("0-").append(fileLength - 1).append("/")
							.append(fileLength).toString();
					response.setHeader("Content-Range", contentRange);
				}
				response.setContentType("application/octet-stream;charset=UTF-8");
				response.addHeader("Content-Disposition", "attachment; " + getContentDisposition(request, name));
				OutputStream out = response.getOutputStream();
				int n = 0;
				long readLength = 0;
				int bsize = 1024;
				byte[] bytes = new byte[bsize];
				if (rangeSwitch == 2) {
					// 针对 bytes=27000-39000 的请求，从27000开始写数据
					while (readLength <= contentLength - bsize) {
						n = bis.read(bytes);
						readLength += n;
						out.write(bytes, 0, n);
					}
					if (readLength <= contentLength) {
						n = bis.read(bytes, 0, (int) (contentLength - readLength));
						out.write(bytes, 0, n);
					}
				} else {
					while ((n = bis.read(bytes)) != -1) {
						out.write(bytes, 0, n);
					}
				}
				out.flush();
				out.close();
				bis.close();
				return true;
			} catch (IOException ie) {
				LOG.error(name + "文件读写异常：" + ie.getMessage());
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * 文件转byte
	 * 
	 * @param f
	 * @return
	 */
	public static byte[] getBytesFromFile(File f) {
		if (f == null) {
			return null;
		}
		try {
			FileInputStream stream = new FileInputStream(f);
			ByteArrayOutputStream out = new ByteArrayOutputStream(1000);
			byte[] b = new byte[1000];
			int n;
			while ((n = stream.read(b)) != -1) {
				out.write(b, 0, n);
			}
			stream.close();
			out.close();
			return out.toByteArray();
		} catch (IOException e) {
			LOG.error("文件读写异常：" + e.getMessage());
		}
		return null;
	}

	/**
	 * 返回是否是图片类型
	 * 
	 * @param fileType
	 * @return
	 */
	public static boolean isImg(String fileType) {
		String imgTypes[] = new String[] { ".png", ".jpg", ".jpeg", ".gif", ".bmp" };
		if (StringUtils.hasLength(fileType)) {
			fileType = fileType.toLowerCase();
			for (String imgType : imgTypes) {
				if (fileType.endsWith(imgType)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 获取有文件标记的字段
	 * 
	 * @param clazz
	 * @return
	 */
	public static List<String> getFileFields(Class<?> clazz) {
		List<String> result = new ArrayList<String>();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			FileTarget target = field.getAnnotation(FileTarget.class);
			if (target != null) {
				result.add(field.getName());
			}
		}
		return result;
	}

}
