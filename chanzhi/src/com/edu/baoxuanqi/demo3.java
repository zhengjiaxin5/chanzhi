package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;

public class demo3 extends Admin_Login {

	@DataProvider(name = "con1")
	public static Object[][] words1() throws Exception {
		ExcelDataProvider d = new ExcelDataProvider();
		return d.getTestDataByExcel("E:\\exc1.xlsx", "Sheet1");
	}

	@Test(dataProvider = "con1")//商场设置数据驱动
	public void test18(String param1,String param2) throws Exception {
		Thread.sleep(3000);
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		Thread.sleep(3000);
		webtest.type("id=confirmLimit", param1);
		webtest.type("id=expireLimit",param2);
		Thread.sleep(3000);
		webtest.click("id=submit");
	}
	@Test//商场设置
	public void test19() {
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.type("id=pid", "2088567891011121314");
		webtest.type("name=key", "baoxuanqi12345678909876543212345");
		webtest.type("name=email","1686977186@qq.com");
		webtest.click("id=submit");
	}
}