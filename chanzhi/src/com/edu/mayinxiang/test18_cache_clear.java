package com.edu.mayinxiang;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test18_cache_clear extends Admin_Login{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[6]/a");
		webtest.click("id=clearButton");
		assertTrue(webtest.isTextPresent("Çå³ýÍê±Ï"));
//		
	}
}