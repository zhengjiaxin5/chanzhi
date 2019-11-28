package com.edu.liqiushui;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Navigation extends Admin_Login{
	
	//添加一个导航a
	@Test(priority=1)
	public void test1() {
		testLogin();
		webtest.click("//a[text()='设计']");
		webtest.click("//a[text()='导航']");
		webtest.click("/html/body/div/div[2]/div[2]/form/ul/li[3]");
		webtest.type("id=\"nav[1][title][]\" ", "a");//添加一个导航a
		webtest.click("//a[text()='保存']");
		
	}
	
	//删除导航a
	@Test(priority=2)
	public void test2() {
		testLogin();
		webtest.click("//a[text()='设计']");
		webtest.click("//a[text()='导航']");
		webtest.click("/html/body/div/div[2]/div[2]/form/ul/li[3]");
		webtest.type("id=\"nav[1][title][]\" ", "a");//添加一个导航a
		webtest.click("//a[text()='保存']");
		
	}
}