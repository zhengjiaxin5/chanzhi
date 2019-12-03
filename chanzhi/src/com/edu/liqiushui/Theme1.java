package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Theme1 extends Admin_Login1{
	@Test
	public void test2() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[1]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test
	public void test3() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[2]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
}
//