package com.sjr.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestSpringFactoryBean {

	@Test
	public void testFactoryBean() {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sjr/test/bean/MyTestBeanFactory.xml"));
		final Object bean = factory.getBean("myTestBeanFactory");
		System.out.println(bean.getClass().getName());
		final Object bean1 = factory.getBean("&myTestBeanFactory");
		System.out.println(bean1.getClass().getName());
	}
}
