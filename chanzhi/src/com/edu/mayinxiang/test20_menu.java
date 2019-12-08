package com.edu.mayinxiang;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test20_menu extends Admin_Login{
	@Test(description="网站后台的菜单的增删")
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[7]/a");
		webtest.click("xpath=//*[@id=\"homeMenus8\"]");
		webtest.click("xpath=//*[@id=\"homeMenus9\"]");
		webtest.click("xpath=//*[@id=\"homeMenus10\"]");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		assertTrue(webtest.isTextPresent("产品"));
//		
	}
	@Test(description="网站后台的菜单的增删")
	public void test2() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[7]/a");
		webtest.click("xpath=//*[@id=\"homeMenus1\"]");
		webtest.click("xpath=//*[@id=\"homeMenus2\"]");
		webtest.click("xpath=//*[@id=\"homeMenus3\"]");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		assertTrue(webtest.notisTextPresent("订单"));
	}
}