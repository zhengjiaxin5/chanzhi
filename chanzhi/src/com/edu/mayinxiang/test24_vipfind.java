package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test24_vipfind extends BaseTest{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.type("id=user","admin");
		webtest.click("id=submit");
	}
}