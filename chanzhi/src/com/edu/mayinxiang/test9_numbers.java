package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test9_numbers extends BaseTest{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.type("xpath=//*[@id=\"icpSN\"]","test123");
		webtest.type("xpath=//*[@id=\"policeSN\"]","test123");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("…Ë÷√≥…π¶"));		
	}
}
