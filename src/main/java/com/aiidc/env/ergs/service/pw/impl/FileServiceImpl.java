/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.impl;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.aiidc.env.ergs.common.file.FileService;
import com.aiidc.env.ergs.common.file.vo.FileMessage;
import com.aiidc.env.ergs.common.file.vo.FileResultVo;
import com.aiidc.env.ergs.jpa.po.pw.EnvFile;
import com.aiidc.env.ergs.jpa.repo.pw.EnvFileDao;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;

/**
 * @author wuwenjun
 *
 */
@Service
public class FileServiceImpl implements FileService {

	private static final Logger log = LoggerFactory.getLogger(FileServiceImpl.class);

	@Resource
	private EnvFileDao dao;

	@Value("${env.file.path}")
	private String filePath;

	@Value("${env.file.expireTime:24}")
	private Integer expireTime;

	@PostConstruct
	public void postConstruct() {
		File file = new File(filePath);
		if (!file.exists() || file.isFile()) {
			file.mkdirs();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.common.service.FileService#saveFile(java.lang.String,
	 * java.lang.String, java.lang.String,
	 * org.springframework.web.multipart.MultipartFile)
	 */
	@Override
	public FileResultVo saveFile(String uuid, String filename, String totalfilesize, MultipartFile file) {
		EnvFile envFile = new EnvFile();
		envFile.setUuid(uuid);
		envFile.setFileSize(totalfilesize);
		File tmpFile = new File(filePath, uuid);
		try {
			file.transferTo(tmpFile);
		} catch (Exception e) {
			log.error(uuid + "：" + filename + "文件写入失败");
		}
		envFile.setFilePath(tmpFile.getAbsolutePath());
		envFile.setUploader(LoginUserUtil.getLoginUserName());
		envFile.setFileName(filename);
		dao.save(envFile);
		return new FileResultVo(true, uuid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.common.service.FileService#deleteFile(java.lang.
	 * String)
	 */
	@Override
	public void deleteFile(String id) {
		String[] idsArr = new String[] { id };
		if (StringUtils.hasLength(id) && id.contains(",")) {
			idsArr = id.split(",");
		}
		for (String uuid : idsArr) {
			EnvFile envFile = dao.findOne(uuid);
			if (envFile != null) {
				if (envFile.getUseCount() < 2) {
					File file = new File(envFile.getFilePath());
					file.delete();
					dao.delete(uuid);
				} else {
					envFile.setUseCount((envFile.getUseCount() - 1));
					dao.save(envFile);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.common.service.FileService#getFile(java.lang.String)
	 */
	@Override
	public FileMessage getFile(String id) {
		EnvFile envFile = dao.findOne(id);
		if (envFile != null) {
			FileMessage fileMessage = new FileMessage();
			fileMessage.setFile(new File(envFile.getFilePath()));
			fileMessage.setFilename(envFile.getFileName());
			fileMessage.setTotalfilesize(envFile.getFileSize());
			fileMessage.setUuid(id);
			return fileMessage;
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.common.service.FileService#addUse(java.lang.String)
	 */
	@Override
	public void addUse(String ids) {
		String[] idsArr = new String[] { ids };
		if (StringUtils.hasLength(ids) && ids.contains(",")) {
			idsArr = ids.split(",");
		}
		for (String id : idsArr) {
			EnvFile envFile = dao.findOne(id);
			if (envFile != null) {
				envFile.setUsed(true);
				envFile.setUseCount((envFile.getUseCount() + 1));
				dao.save(envFile);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.common.service.FileService#clear()
	 */
	@Override
	@Scheduled(cron = "0 0 0 * * ?")
	public void clear() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR_OF_DAY, -1 * expireTime);
		List<EnvFile> list = dao.getUnusedFiles(cal.getTime());
		for (EnvFile envFile : list) {
			deleteFile(envFile.getUuid());
		}
	}

}
