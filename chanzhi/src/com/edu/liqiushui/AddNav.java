package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class AddNav extends Admin_Login1{
	
//	@DataProvider(name="addnav")
//	public  Object[][] changesize() throws IOException{
//		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("E:\\data\\addnav.xlsx","addnav");
//		 return user;
//	}
	
	//添加一个导航a
	@Test(priority=1,description="添加导航")
	public void test1() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=导航");
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[1]/span[1]");//使添加按钮出现
		webtest.click("xpath=//*[@id=\"navList\"]/li[1]/span[1]/span/a[2]/i");//点击添加
//		webtest.type("xpath=//*[@id=\"nav[1][title][]\"]","新导航");

//		webtest.typeAndClear("xpath=//*[@id=\"nav[1][title][]\"]","新导航");
		webtest.click("link=保存");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	
	@Test(priority=2,description="删除导航")
	public void test2() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=导航");
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[1]/span[1]");//使删除按钮出现
		webtest.click("xpath=//*[@id=\"navList\"]/li[1]/span[1]/span/a[3]/i");//点击添加
//		webtest.type("xpath=//*[@id=\"nav[1][title][]\"]","新导航");

//		webtest.typeAndClear("xpath=//*[@id=\"nav[1][title][]\"]","新导航");
		webtest.click("link=保存");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	
	
	
	
}