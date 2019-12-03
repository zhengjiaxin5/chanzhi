package com.edu.mayinxiang;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test7_usemokuai extends Admin_Login{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"modules3\"]");
		webtest.click("xpath=//*[@id=\"modules2\"]");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("设置成功"));
//		
	}
	
	@Test
	public void test2() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"modules1\"]");
		webtest.click("xpath=//*[@id=\"modules2\"]");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("设置成功"));
//		
	}
}
