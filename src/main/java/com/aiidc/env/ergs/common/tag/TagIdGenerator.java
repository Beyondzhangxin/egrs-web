/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.tag;

import javax.servlet.jsp.PageContext;

/**
 * @author wuwenjun
 *
 */
abstract class TagIdGenerator {
	private static final String PAGE_CONTEXT_ATTRIBUTE_PREFIX = TagIdGenerator.class.getName() + ".";

	public static String nextId(String name, PageContext pageContext) {
		String attributeName = PAGE_CONTEXT_ATTRIBUTE_PREFIX + name;
		Integer currentCount = (Integer) pageContext.getAttribute(attributeName);
		currentCount = Integer.valueOf(currentCount != null ? currentCount.intValue() + 1 : 1);
		pageContext.setAttribute(attributeName, currentCount);
		return name + currentCount;
	}
}
