package ch5.custns;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class CalculatorBeanDefinitorParse extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class getBeanClass(Element element) {
		return Calculator.class;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		String operator = element.getAttribute("operator");
		Assert.notNull(operator, "operaotr is required.");
		if (StringUtils.hasText(operator)) {
			builder.addPropertyValue("operator", operator);
			if ("add".equalsIgnoreCase(operator)) {
				processAdd(element, builder);
			} else if ("minus".equalsIgnoreCase(operator)) {
				processMinus(element, builder);
			} else {
				throw new UnsupportedOperationException("UnSupport Operaotr");
			}
		}
	}

	/**
	 * @param element
	 * @param builder
	 */
	private void processAdd(Element element, BeanDefinitionBuilder builder) {
		try {
			double number1  = getNumber(element, "number1");
			builder.addPropertyValue("number1", number1);
			double number2  = getNumber(element, "number2");
			builder.addPropertyValue("number2", number2);

			double result = number1 + number2;
			builder.addPropertyValue("result", result);

		} catch (Exception e) {
			throw new IllegalArgumentException("Number1/Number2 Must be Number.");
		}
	}

	/**
	 * @param number1
	 * @param number2
	 */
	private Double getNumber(Element element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		String strNumber = StringUtils.hasText(attribute) ? StringUtils.trimWhitespace(attribute) : "";
		if ("".equals(strNumber)) {
			return 0d;
		}
		return Double.parseDouble(strNumber);
	}

	/**
	 * @param element
	 * @param builder
	 */
	private void processMinus(Element element, BeanDefinitionBuilder builder) {
		try {
			double number1  = getNumber(element, "number1");
			builder.addPropertyValue("number1", number1);
			double number2  = getNumber(element, "number2");
			builder.addPropertyValue("number2", number2);

			double result = number1 - number2;
			builder.addPropertyValue("result", result);
		} catch (Exception e) {
			throw new IllegalArgumentException("Number1/Number2 Must be Number.", e);
		}
	}

}