/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;

import com.aiidc.env.ergs.common.metro.MetroMessage;
import com.aiidc.env.ergs.common.metro.MetroUtil;

/**
 * @author wuwenjun
 *
 */
public class MetroView extends BodyTagSupport {

	private static final long serialVersionUID = 6795500510076304041L;

	private MetroMessage metro;

	private Object item;

	private String field;

	@Override
	public int doStartTag() throws JspException {
		return BodyTagSupport.EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			if (metro == null) {
				metro = MetroUtil.getMetroMessage(item.getClass(), field);
			}
			Object object = MetroUtil.getFieldValue(item, metro);
			if (object != null) {
				String result = String.valueOf(object);
				this.pageContext.getOut().write(result);
			} else {
				this.pageContext.getOut().write("");
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return Tag.EVAL_PAGE;
	}

	public MetroMessage getMetro() {
		return metro;
	}

	public void setMetro(MetroMessage metro) {
		this.metro = metro;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}
