/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.vo;

import java.io.Serializable;

/**
 * @author wuwenjun
 *
 */
public class JsonMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4979797282466463227L;

	private boolean flag;
	private String message = "";

	public JsonMessage(boolean flag) {
		super();
		this.flag = flag;
	}

	public JsonMessage(boolean flag, String message) {
		super();
		this.flag = flag;
		this.message = message;
	}

	public boolean isFlag() {
		return flag;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "JsonMessage [flag=" + flag + ", message=" + message + "]";
	}
}
