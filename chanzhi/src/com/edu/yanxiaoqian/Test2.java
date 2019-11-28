package com.webtest.demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test2 extends BaseTest{
	WebDriver WebDriver = null;
	@Test
	public void testZcxy1() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[10]/a");
		webtest.click("xpath=//*[@id=\"agreement2\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test
	public void testZcxy2() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[10]/a");
		webtest.click("xpath=//*[@id=\"agreement1\"]");
		webtest.type("xpath=//*[@id=\"agreementTitle\"]", "aaaaa");
//		webtest.tapClick();
		webtest.enterFrame(0);
		webtest.click("tag=body");
		
		webtest.type("tag=body", "bbbbbb");
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		webtest.sleep(3000);
		webtest.open("http://localhost/chanzhieps/www/index.php/user-register.html");
		assertTrue(webtest.isTextPresent("我已经知晓并同意"));
	}

}
