package com.edu.yanxiaoqian;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Test2 extends Admin_Login{
	WebDriver WebDriver = null;
	@Test(description="登录协议关闭")
	public void testZcxy1() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[10]/a");
		webtest.click("xpath=//*[@id=\"agreement2\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="登录协议开启")
	public void testZcxy2() throws InterruptedException {
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
		Thread.sleep(3000);
		webtest.open("http://localhost/chanzhieps/www/index.php/user-register.html");
		assertTrue(webtest.isTextPresent("我已经知晓并同意"));
	}

}
