package com.edu.mayinxiang;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test16_address extends Admin_Login{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[4]/a");
		webtest.type("name=domain", "test");
		webtest.type("name=alloweDomain", "test");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("…Ë÷√≥…π¶"));
	}
}