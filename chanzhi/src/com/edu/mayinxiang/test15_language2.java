package com.edu.mayinxiang;


import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test15_language2 extends Admin_Login{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[2]/a");
		webtest.click("xpath=//*[@id=\"enabledLangs2\"]");
		webtest.click("xpath=//*[@id=\"defaultLang2\"]");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");	
		assertTrue(webtest.isTextPresent("默认语言必须在简体"));
		
	}
}