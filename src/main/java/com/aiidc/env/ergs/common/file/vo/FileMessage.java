/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.file.vo;

import java.io.File;

/**
 * @author wuwenjun
 *
 */
public class FileMessage {

	private String uuid;

	private String filename;

	private String totalfilesize;

	private File file;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getTotalfilesize() {
		return totalfilesize;
	}

	public void setTotalfilesize(String totalfilesize) {
		this.totalfilesize = totalfilesize;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
