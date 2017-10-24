/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;

import org.springframework.data.domain.Page;

/**
 * @author wuwenjun
 *
 */
public class Pagination extends BodyTagSupport {

	private static final long serialVersionUID = 6795500510076304041L;

	private Page<Object> page;

	private String click = "page";

	@Override
	public int doStartTag() throws JspException {
		return BodyTagSupport.EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			this.pageContext.getOut().write("<div class=\"pagination\" data-size=\"" + page.getSize()
					+ "\" data-number=\"" + page.getNumber() + "\">");
			if (page.getNumber() > 1) {
				this.pageContext.getOut().write(
						"<span class=\"item\" onclick=\"" + click + "(" + 0 + "," + page.getSize() + ")\"><<</span>");
			}
			if (page.hasPrevious()) {
				this.pageContext.getOut().write("<span class=\"item\" onclick=\"" + click + "(" + (page.getNumber() - 1)
						+ "," + page.getSize() + ")\"><</span>");
			}
			for (int i = 0; i < page.getTotalPages(); i++) {
				if (page.getNumber() - i > 3) {
					this.pageContext.getOut().write("<span class=\"item spaces\"></span>");
					i = page.getNumber() - 3;
				}
				if (page.getNumber() == i) {
					this.pageContext.getOut().write("<span class=\"item current\">" + (i + 1) + "</span>");
				} else {
					this.pageContext.getOut().write("<span class=\"item\" onclick=\"" + click + "(" + i + ","
							+ page.getSize() + ")\">" + (i + 1) + "</span>");
				}
				if (i - page.getNumber() > 3) {
					this.pageContext.getOut().write("<span class=\"item spaces\"></span>");
					break;
				}
			}
			if (page.hasNext()) {
				this.pageContext.getOut().write("<span class=\"item\" onclick=\"" + click + "(" + (page.getNumber() + 1)
						+ "," + page.getSize() + ")\">></span>");
			}
			if (page.getNumber() < page.getTotalPages() - 2) {
				this.pageContext.getOut().write("<span class=\"item\" onclick=\"" + click + "("
						+ (page.getTotalPages() - 1) + "," + page.getSize() + ")\">>></span>");
			}
			this.pageContext.getOut().write("</div>");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return Tag.EVAL_PAGE;
	}

	public Page<Object> getPage() {
		return page;
	}

	public void setPage(Page<Object> page) {
		this.page = page;
	}

	public String getClick() {
		return click;
	}

	public void setClick(String click) {
		this.click = click;
	}

}
