package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test6 extends BaseTest{
	@Test
	public void testGsxx() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[1]/a");
		webtest.type("xpath=/html/body/div/div[2]/div/div[2]/div/div[2]/form/table/tbody/tr[1]/td/input", "!");
		webtest.type("xpath=/html/body/div/div[2]/div/div[2]/div/div[2]/form/table/tbody/tr[2]/td/input", "!");
		webtest.click("xpath=/html/body/div/div[2]/div/div[2]/div/div[2]/form/table/tbody/tr[4]/td/input[1]");
		assertTrue(webtest.isTextPresent("…Ë÷√≥…π¶"));
	}

}
