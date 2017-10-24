/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.metro;

import org.springframework.util.StringUtils;

import com.aiidc.env.ergs.common.metro.converter.Converter;

/**
 * @author wuwenjun
 *
 */
public class MetroMessage implements Comparable<MetroMessage> {
	private String field;
	private String ch;
	private String type;
	private String date;
	private String placeholder;
	private String dataValidateFunc;
	private String dataValidateArg;
	private String dataValidateHint;
	private Integer order;
	private boolean list;
	private Converter converter;

	public MetroMessage(MetroField metro, String field) {
		super();
		this.field = field;
		this.ch = metro.value();
		this.type = metro.edit().value();
		this.date = metro.edit().date();
		this.placeholder = metro.edit().placeholder();
		this.dataValidateArg = metro.edit().validate().arg();
		this.dataValidateFunc = metro.edit().validate().func();
		this.dataValidateHint = metro.edit().validate().hint();
		this.order = metro.order();
		this.list = metro.list();
		this.converter = metro.convert();
	}

	public String getField() {
		return field;
	}

	public String getFieldName() {
		if (StringUtils.hasLength(ch)) {
			return ch;
		} else {
			return field;
		}
	}

	public String getCh() {
		return ch;
	}

	public String getType() {
		return type;
	}

	public String getDate() {
		return date;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public String getDataValidateFunc() {
		return dataValidateFunc;
	}

	public String getDataValidateArg() {
		return dataValidateArg;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(MetroMessage o) {
		return this.order.compareTo(o.order);
	}

	public String getDataValidateHint() {
		return dataValidateHint;
	}

	public boolean isList() {
		return list;
	}

	public Converter getConverter() {
		return converter;
	}

}
