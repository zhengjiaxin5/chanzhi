package com.webtest.demo;

import org.testng.annotations.Test;

public class demo2 extends Admin_Login{
	@Test//熊掌号勾选1
	public void test2() {
		webtest.click("link=推广");
		webtest.click("link=熊掌号");
		webtest.type("id=name", "a");
		webtest.type("id=appID","b");
		webtest.type("id=token", "c");
		webtest.click("id=autoSync2");
		webtest.click("id=submit");
}
	@Test//熊掌号勾选2
	public void test3() {
	webtest.click("link=推广");
	webtest.click("link=熊掌号");
	webtest.type("id=name", "x");
	webtest.type("id=appID","y");
	webtest.type("id=token", "z");
	webtest.click("id=autoSync3");
	webtest.click("id=submit");
}
	@Test//熊掌号勾选3
	public void test4() {
	webtest.click("link=推广");
	webtest.click("link=熊掌号");
	webtest.type("id=name", "1");
	webtest.type("id=appID","2");
	webtest.type("id=token", "3");
	webtest.click("id=autoSync4");
	webtest.click("id=submit");
	}
	@Test//熊掌号设置
	public void test18() {
		webtest.click("link=推广");
		webtest.click("link=熊掌号");
		webtest.click("name=type");
		webtest.click("xpath=//*[@id=\"type\"]/option[2]");
		webtest.click("id=submit");
	}
}

