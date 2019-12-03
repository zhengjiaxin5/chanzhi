package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test30_forumappdate extends BaseTest{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[4]/a");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("更新数据成功"));
	}
}