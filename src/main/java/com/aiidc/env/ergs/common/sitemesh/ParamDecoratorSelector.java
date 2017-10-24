/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.sitemesh;

import java.io.IOException;

import org.sitemesh.DecoratorSelector;
import org.sitemesh.content.Content;
import org.sitemesh.webapp.WebAppContext;
import org.springframework.web.servlet.ThemeResolver;

import com.aiidc.env.ergs.common.util.SpringContextUtil;

/**
 * @author wuwenjun
 *
 */
public class ParamDecoratorSelector implements DecoratorSelector<WebAppContext> {
	private DecoratorSelector<WebAppContext> defaultDecoratorSelector;

	public ParamDecoratorSelector(DecoratorSelector<WebAppContext> defaultDecoratorSelector) {
		this.defaultDecoratorSelector = defaultDecoratorSelector;
	}

	public String[] selectDecoratorPaths(Content content, WebAppContext context) throws IOException {
		if (context.getPath().contains("/table/") || context.getPath().endsWith("/regist")
				|| context.getPath().contains("/report/view")) {
			return new String[] {};
		}
		String[] path = defaultDecoratorSelector.selectDecoratorPaths(content, context);
		String resolveThemeName = SpringContextUtil.getBean(ThemeResolver.class).resolveThemeName(context.getRequest());
		String[] newPath = path.clone();
		for (int i = 0; i < newPath.length; i++) {
			newPath[i] = newPath[i].replace("${theme}", resolveThemeName);
		}
		return newPath;
	}

}
