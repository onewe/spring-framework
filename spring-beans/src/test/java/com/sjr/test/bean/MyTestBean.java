package com.sjr.test.bean;

public class MyTestBean {

	private AdvProp advProp;

	private String testStr = "test--one";

	public MyTestBean(AdvProp advProp) {
		this.advProp = advProp;
	}

	public MyTestBean() {
	}

	public String getTestStr() {
		return testStr;
	}

	public MyTestBean setTestStr(String testStr) {
		this.testStr = testStr;
		return this;
	}

	public AdvProp getAdvProp() {
		return advProp;
	}

	public MyTestBean setAdvProp(AdvProp advProp) {
		this.advProp = advProp;
		return this;
	}

	public void printAdvProp(){
		System.out.println("advProp: age-" + advProp.getAge() + ",name-" + advProp.getName());
	}
}
