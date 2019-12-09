package com.edu.mayinxiang;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.IInstanceInfo;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test6_years extends Admin_Login{
	@Test(description="网站创建年份更改")
	public void test() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.type("xpath=//*[@id=\"copyright\"]","2999");
//		for(int i=0;i<10;i++) {
//			webtest.keysDown();
//		}
////		webtest.mouseoverElement("id=submit");
//		webtest.moveOffset();
//		webtest.keysDown();
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		webtest.open("http://127.0.0.1/chanzhieps/www/");
		assertTrue(webtest.isTextPresent("2999"));
//		
	}
}
