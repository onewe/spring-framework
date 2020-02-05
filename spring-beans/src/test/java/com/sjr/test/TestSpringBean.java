package com.sjr.test;

import com.sjr.test.bean.MyTestBean;
import com.sjr.test.resolver.SjrProtocolResolver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;

public class TestSpringBean {

	@Test
	public void testSpringLoadXml(){
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sjr/test/bean/MyTestBean.xml"));
		final MyTestBean testBean = factory.getBean("myTestBean",MyTestBean.class);
		final String testStr = testBean.getTestStr();
		System.out.println(testStr);
	}

	@Test
	public void testSpringResourceLoader(){
		DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader(this.getClass().getClassLoader());
		BeanFactory factory = new XmlBeanFactory(defaultResourceLoader.getResource("classpath:com/sjr/test/bean/MyTestBean.xml"));
		final MyTestBean testBean = factory.getBean("myTestBean",MyTestBean.class);
		final String testStr = testBean.getTestStr();
		System.out.println(testStr);
	}

	@Test
	public void testSpringResourceLoaderForFileProtocol(){
		DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader(this.getClass().getClassLoader());
		BeanFactory factory = new XmlBeanFactory(defaultResourceLoader.getResource("file:///Users/doge/project/spring-framework/spring-beans/src/test/resources/com/sjr/test/bean/MyTestBean.xml"));
		final MyTestBean testBean = factory.getBean("myTestBean",MyTestBean.class);
		final String testStr = testBean.getTestStr();
		System.out.println(testStr);
	}

	@Test
	public void testSpringProtocolResolverOfAdv(){
		DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader(this.getClass().getClassLoader());
		defaultResourceLoader.addProtocolResolver(new SjrProtocolResolver());
		BeanFactory factory = new XmlBeanFactory(defaultResourceLoader.getResource("sjr:com/sjr/test/bean/MyTestBean.xml"));
		final MyTestBean testBean = factory.getBean("myTestBean",MyTestBean.class);
		final String testStr = testBean.getTestStr();
		System.out.println(testStr);
	}
}
