package com.sjr.test.factory;

import com.sjr.test.bean.MyTestFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;

public class MyTestBeanFactory implements ObjectFactory<MyTestFactoryBean> {
	@Override
	public MyTestFactoryBean getObject() throws BeansException {
		return  new MyTestFactoryBean();
	}
}
