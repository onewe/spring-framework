package com.sjr.test.handler;

import com.sjr.test.bean.AdvProp;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class TestAdvPropParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return AdvProp.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		final String name = element.getAttribute("name");
		final String age = element.getAttribute("age");
		builder.addPropertyValue("name",name);
		builder.addPropertyValue("age",age);
	}
}
