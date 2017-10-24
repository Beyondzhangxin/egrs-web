/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.tag;

import org.springframework.util.Assert;

/**
 * @author wuwenjun
 *
 */
public class MetroCheckboxButtonsTag extends AbstractMultiCheckedElementTag {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8683887306771934116L;
	private String element = "label class='input-control checkbox'";

	public void setElement(String element) {
		Assert.hasText(element, "'element' cannot be null or blank");
		this.element = element;
	}

	public String getElement() {
		return this.element;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.tags.form.AbstractCheckedElementTag#
	 * getInputType()
	 */
	@Override
	protected String getInputType() {
		return "checkbox";
	}
}
