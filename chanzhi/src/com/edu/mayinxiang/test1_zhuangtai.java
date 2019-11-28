package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test1_zhuangtai extends BaseTest{
	@Test
	public void test() {
		webtest.open("http://127.0.0.1/chanzhieps/www/admin.php");
		//文本框输入
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"status2\"]");
		
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		webtest.open("http://127.0.0.1/chanzhieps/www/");
		assertTrue(webtest.isTextPresent("站点维护中"));
	}
}
