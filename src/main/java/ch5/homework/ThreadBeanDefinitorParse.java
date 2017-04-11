package ch5.homework;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class ThreadBeanDefinitorParse extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class getBeanClass(Element element) {
		return CustomScopeConfigurer.class;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String className = element.getAttribute("class");
		Assert.notNull(id, "id is required.");
		Assert.notNull(className, "class is required.");
		if (StringUtils.hasText(id) && StringUtils.hasText(className)) {
			Map<String, Class> scopes = new HashMap<String, Class>();
			try {
				scopes.put(id, Class.forName(className));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			builder.addPropertyValue("scopes", scopes);
		}
	}

}