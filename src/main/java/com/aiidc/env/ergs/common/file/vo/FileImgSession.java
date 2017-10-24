/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.file.vo;

/**
 * @author wuwenjun
 *
 */
public class FileImgSession extends FileSession {

	private String thumbnailUrl;

	public FileImgSession(FileMessage message) {
		super(message);
		this.thumbnailUrl = "/file/download/" + this.getUuid();
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}
