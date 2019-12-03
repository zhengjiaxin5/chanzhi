package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test25_vipallselect extends BaseTest{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=//*[@id=\"userList\"]/tbody/tr[3]/td[1]/input");
		webtest.click("xpath=//*[@id=\"userList\"]/tfoot/tr/td/div[1]/a[2]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.type("id=password", "admin");
		webtest.enter();
		assertTrue(webtest.isTextPresent("É¾³ý³É¹¦"));
		
	}
}