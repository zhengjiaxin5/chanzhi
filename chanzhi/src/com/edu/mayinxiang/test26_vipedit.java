package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test26_vipedit extends BaseTest{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=//*[@id=\"userList\"]/tbody/tr[1]/td[11]/a[1]");
		webtest.type("id=realname", "23456");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("±£´æ³É¹¦"));
		
	}
}