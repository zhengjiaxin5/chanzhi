package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test5_name extends BaseTest{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.type("xpath=//*[@id=\"name\"]","蝉知企业123");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		webtest.open("http://127.0.0.1/chanzhieps/www/");
		assertTrue(webtest.isTextPresent("蝉知企业123"));
	}
}
