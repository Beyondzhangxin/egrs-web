/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.file.vo;

/**
 * @author wuwenjun
 *
 */
public class FileSession {

	private String uuid;

	private String name;

	private String size;

	public FileSession(FileMessage message) {
		super();
		this.uuid = message.getUuid();
		this.name = message.getFilename();
		this.size = message.getTotalfilesize();
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
