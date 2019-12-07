package com.edu.yanxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Test4 extends Admin_Login{
	@Test(description="添加联系方式")
	public void testGsxx() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[2]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[2]/a");
		webtest.type("xpath=//*[@id=\"contacts\"]", "!");
		webtest.type("xpath=//*[@id=\"phone\"]", "!");
		webtest.type("xpath=//*[@id=\"fax\"]", "!");
		webtest.type("xpath=//*[@id=\"email\"]", "!");
		webtest.type("xpath=//*[@id=\"qq\"]", "!");
		webtest.type("xpath=//*[@id=\"skype\"]", "!");
		webtest.type("xpath=//*[@id=\"weixin\"]", "!");
		webtest.type("xpath=//*[@id=\"wangwang\"]", "!");
		webtest.type("xpath=//*[@id=\"site\"]", "!");
		webtest.type("xpath=//*[@id=\"address\"]", "!");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}

}
