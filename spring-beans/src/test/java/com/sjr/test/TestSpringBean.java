package com.sjr.test;

import com.sjr.test.bean.MyTestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestSpringBean {

	@Test
	public void testSpringBean(){
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sjr/test/bean/MyTestBean.xml"));
		final MyTestBean testBean = factory.getBean("myTestBean",MyTestBean.class);
		final String testStr = testBean.getTestStr();
		System.out.println(testStr);
	}
}
