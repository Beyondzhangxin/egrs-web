/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.file.vo;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author wuwenjun
 *
 */
public class FileResultVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9203742756637555336L;
	private boolean success;
	private String reset;
	private String newUuid;
	private String msg = "";

	public FileResultVo(boolean success) {
		super();
		this.success = success;
		this.newUuid = UUID.randomUUID().toString();
	}

	public boolean isSuccess() {
		return success;
	}

	public String getReset() {
		return reset;
	}

	public String getMsg() {
		return msg;
	}

	public String getNewUuid() {
		return newUuid;
	}

	public FileResultVo(boolean success, String newUuid) {
		super();
		this.success = success;
		this.newUuid = newUuid;
	}

}
