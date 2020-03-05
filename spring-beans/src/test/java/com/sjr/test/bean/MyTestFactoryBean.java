package com.sjr.test.bean;

import org.springframework.beans.factory.FactoryBean;

public class MyTestFactoryBean implements FactoryBean<MyTestBean> {


	@Override
	public MyTestBean getObject() throws Exception {
		return new MyTestBean();
	}

	@Override
	public Class<?> getObjectType() {
		return MyTestBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
