/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wuwenjun
 *
 */
public class RegistQryVo {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	private String companyName;
	private String creditCode;
	private String registTime;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCreditCode() {
		return creditCode;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getRegistTime() {
		return registTime;
	}

	public void setRegistTime(String registTime) {
		this.registTime = registTime;
	}

	public Date getRegistStartTime() {
		try {
			return sdf.parse(this.registTime + " 00:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Date getRegistEndTime() {
		try {
			return sdf.parse(this.registTime + " 23:59:59");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
