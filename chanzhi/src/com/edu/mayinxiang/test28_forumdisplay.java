package com.edu.mayinxiang;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test28_forumdisplay extends Admin_Login{
	@Test(description="论坛主题的隐藏")
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=//*[@id=\"threadList\"]/tbody/tr/td[10]/a[2]");
		assertTrue(webtest.isTextPresent("已隐藏"));
	}
}