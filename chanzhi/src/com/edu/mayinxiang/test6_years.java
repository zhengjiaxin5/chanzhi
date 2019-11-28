package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.IInstanceInfo;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test6_years extends BaseTest{
	@Test
	public void test() throws InterruptedException {
		webtest.open("http://127.0.0.1/chanzhieps/www/admin.php");
		//Œƒ±æøÚ ‰»Î
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
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
