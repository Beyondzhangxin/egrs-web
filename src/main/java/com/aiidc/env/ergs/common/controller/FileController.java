/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aiidc.env.ergs.common.file.FileService;
import com.aiidc.env.ergs.common.file.util.FileConstant;
import com.aiidc.env.ergs.common.file.util.FileUtil;
import com.aiidc.env.ergs.common.file.vo.FileImgSession;
import com.aiidc.env.ergs.common.file.vo.FileMessage;
import com.aiidc.env.ergs.common.file.vo.FileResultVo;
import com.aiidc.env.ergs.common.file.vo.FileSession;

import springfox.documentation.annotations.ApiIgnore;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("file")
@ApiIgnore
public class FileController {

	@Autowired(required = false)
	private FileService service;

	@ResponseBody
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public FileResultVo upload(@RequestParam("qquuid") String uuid, @RequestParam("qqfilename") String filename,
			@RequestParam("qqtotalfilesize") String totalfilesize, @RequestParam("qqfile") MultipartFile file) {
		if (service != null) {
			return service.saveFile(uuid, filename, totalfilesize, file);
		}
		return new FileResultVo(true);
	}

	@ResponseBody
	@RequestMapping(value = "delete/{id}")
	public FileResultVo delete(@PathVariable String id) {
		if (service != null) {
			service.deleteFile(id);
		}
		return new FileResultVo(true, id);
	}

	@RequestMapping(value = "/download/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FileMessage fileMessage = service.getFile(id);
		if (fileMessage != null) {
			File file = fileMessage.getFile();
			if (file != null && file.exists() && file.isFile()) {
				if (file.length() <= 20 * 1024 * 1024) {// 20M以下
					byte[] bs = FileUtil.getBytesFromFile(file);
					HttpHeaders headers = new HttpHeaders();
					headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
					headers.setContentDispositionFormData("attachment", new String(
							fileMessage.getFilename().getBytes(FileConstant.UTF_8), FileConstant.ISO_8859_1)); // 解决文件名中文乱码问题
					return new ResponseEntity<byte[]>(bs, headers, HttpStatus.CREATED);
				} else if (file.length() <= 50 * 1024 * 1024) {// 较大文件(30~50M)下载
					boolean success = FileUtil.returnFile(response, request, file, fileMessage.getFilename());
					if (success) {
						return null;
					}
				} else {// 文件下载
					boolean success = FileUtil.returnBigFile(response, request, file, fileMessage.getFilename());
					if (success) {
						return null;
					}
				}
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/download/normal", method = RequestMethod.GET)
	public ResponseEntity<?> normalDownload(@RequestParam(required = false) String fileName, String path,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		File file = new File(path);
		if (fileName == null) {
			fileName = file.getName();
		}
		if (file != null && file.exists() && file.isFile()) {
			if (file.length() <= 20 * 1024 * 1024) {// 20M以下
				byte[] bs = FileUtil.getBytesFromFile(file);
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				headers.setContentDispositionFormData("attachment",
						new String(fileName.getBytes(FileConstant.UTF_8), FileConstant.ISO_8859_1)); // 解决文件名中文乱码问题
				return new ResponseEntity<byte[]>(bs, headers, HttpStatus.CREATED);
			} else if (file.length() <= 50 * 1024 * 1024) {// 较大文件(30~50M)下载
				boolean success = FileUtil.returnFile(response, request, file, fileName);
				if (success) {
					return null;
				}
			} else {// 文件下载
				boolean success = FileUtil.returnBigFile(response, request, file, fileName);
				if (success) {
					return null;
				}
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/session", method = RequestMethod.GET)
	@ResponseBody
	public List<FileSession> session(String[] ids) {
		List<FileSession> results = new ArrayList<FileSession>();
		for (String id : ids) {
			FileMessage message = service.getFile(id);
			if (message != null) {
				if (FileUtil.isImg(message.getFilename())) {
					results.add(new FileImgSession(message));
				} else {
					results.add(new FileSession(message));
				}
			}
		}
		return results;
	}

}
