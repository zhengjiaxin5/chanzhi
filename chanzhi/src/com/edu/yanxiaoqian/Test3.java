package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test3 extends BaseTest{
	@Test
	public void testGsxx() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[2]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[1]/a");
		webtest.type("xpath=//*[@id=\"name\"]", "!");
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", "bbbbbb");
		webtest.leaveFrame();
		webtest.enterFrame(1);
		webtest.click("tag=body");
		webtest.type("tag=body", "bbbbbb");
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("…Ë÷√≥…π¶"));
	}

}
