package com.edu.baoxuanqi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class demo2 extends Admin_Login{
	@DataProvider(name = "con2")
	public static Object[][] words1() throws Exception {
		ExcelDataProvider d = new ExcelDataProvider();
		return d.getTestDataByExcel("E:\\exc2.xlsx", "Sheet1");
	}
	@Test(dataProvider = "con2",description="熊掌号勾选产品")
	public void test2(String a1,String a2,String a3) throws Exception{
		webtest.click("link=推广");
		webtest.click("link=熊掌号"); 
		webtest.type("id=name", a1);
		webtest.type("id=appID",a2);
		webtest.type("id=token", a3);
		webtest.click("id=autoSync2");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("保存成功"));
}
	
	@Test(description="熊掌号勾选博客")
	public void test3() {
	webtest.click("link=推广");
	webtest.click("link=熊掌号");
	webtest.type("id=name", "x");
	webtest.type("id=appID","y");
	webtest.type("id=token", "z");
	webtest.click("id=autoSync3");
	webtest.click("id=submit");
	assertTrue(webtest.isTextPresent("保存成功"));
}
	@Test(description="熊掌号勾选单页")
	public void test4() {
	webtest.click("link=推广");
	webtest.click("link=熊掌号");
	webtest.type("id=name", "1");
	webtest.type("id=appID","2");
	webtest.type("id=token", "3");
	webtest.click("id=autoSync4");
	webtest.click("id=submit");
	assertTrue(webtest.isTextPresent("保存成功"));
	}
	@Test(description="熊掌号更换类型")
	public void test18() {
		webtest.click("link=推广");
		webtest.click("link=熊掌号");
		webtest.click("name=type");
		webtest.click("xpath=//*[@id=\"type\"]/option[2]");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("保存成功"));
	}
}


	



