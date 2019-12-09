package com.edu.yanxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Test5 extends Admin_Login{
	@Test(description="开放登录微博")
	public void testGsxx() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[1]/a");
		webtest.type("xpath=//*[@id=\"verification\"]", "!");
		webtest.type("xpath=//*[@id=\"clientID\"]", "!");
		webtest.type("xpath=//*[@id=\"clientSecret\"]", "!");
		webtest.type("xpath=//*[@id=\"widget\"]", "!");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}

}
