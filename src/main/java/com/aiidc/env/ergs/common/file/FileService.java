/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.file;

import org.springframework.web.multipart.MultipartFile;

import com.aiidc.env.ergs.common.file.vo.FileMessage;
import com.aiidc.env.ergs.common.file.vo.FileResultVo;

/**
 * @author wuwenjun 文件服务接口
 */
public interface FileService {

	public FileResultVo saveFile(String uuid, String filename, String totalfilesize, MultipartFile file);

	public void deleteFile(String id);

	public FileMessage getFile(String id);

	public void clear();

	public void addUse(String ids);
}
