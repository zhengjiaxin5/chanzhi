package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test4 extends BaseTest{
	@Test
	public void testGsxx() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
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
		assertTrue(webtest.isTextPresent("…Ë÷√≥…π¶"));
	}

}
