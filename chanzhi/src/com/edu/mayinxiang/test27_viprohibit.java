package com.edu.mayinxiang;


import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test27_viprohibit extends Admin_Login{
	@Test(description="会员的禁用")
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=//*[@id=\"userList\"]/tbody/tr[1]/td[11]/span/a");
		webtest.click("xpath=//*[@id=\"userList\"]/tbody/tr[1]/td[11]/span/ul/li[1]/a");
		assertTrue(webtest.isTextPresent("禁用成功"));
	}
	@Test
	public void test2() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=//*[@id=\"userList\"]/tbody/tr[1]/td[11]/a[3]");
		assertTrue(webtest.isTextPresent("解除禁用成功"));
//		webtest.enter();
	}
}