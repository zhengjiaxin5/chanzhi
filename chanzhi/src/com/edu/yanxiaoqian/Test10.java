package com.edu.yanxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Test10 extends Admin_Login{
	@Test(description="设置格式错误的发信邮箱")
	public void testGsxx1() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[2]/a");
		webtest.type("xpath=//*[@id=\"fromAddress\"]", "111");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("发信邮箱应当为合法的EMAIL"));
	}
	
	@Test(description="设置格式正确的发信邮箱")
	public void testGsxx2() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[2]/a");
		webtest.type("xpath=//*[@id=\"fromAddress\"]", "438117595@qq.com");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("发信邮箱"));
		webtest.click("xpath=//*[@id=\"submit\"]");
	}
	

}
