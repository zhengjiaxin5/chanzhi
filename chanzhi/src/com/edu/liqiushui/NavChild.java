package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class NavChild extends Admin_Login{

	//添加一个导航a
	@Test(priority=1,description="先添加一个导航")
	public void addnav1() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=导航");
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[1]/span[1]");
		webtest.click("xpath=//*[@id=\"navList\"]/li[1]/span[1]/span/a[2]/i");
		webtest.click("link=保存");
		assertTrue(webtest.isTextPresent("设置成功"));	
		Thread.sleep(5000);

	}
	//添加子导航
	@Test(priority=2,description="添加子导航")
	public void addchild() throws InterruptedException {
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[2]/span[1]");
		webtest.click("xpath=//*[@id=\"navList\"]/li[2]/span[1]/span/a[4]/i");
		Thread.sleep(5000);
		webtest.typeAndClear("id=nav[2][title][]","第一个子导航");
		webtest.click("link=保存");
		assertTrue(webtest.isTextPresent("设置成功"));	
	}
	
	
		
}
	


	
	
	
