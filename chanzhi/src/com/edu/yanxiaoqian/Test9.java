package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test9 extends BaseTest{
	@Test
	public void testGsxx1() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.type("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[1]/td/input", "!");
		webtest.type("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[2]/td/input", "!");
		webtest.click("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[3]/td/label[2]/input");
		webtest.click("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[4]/td/input[1]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	
	@Test
	public void testGsxx2() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.type("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[1]/td/input", "!");
		webtest.type("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[2]/td/input", "!");
		webtest.click("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[3]/td/label[1]/input");
		webtest.click("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[4]/td/input[1]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}

}
