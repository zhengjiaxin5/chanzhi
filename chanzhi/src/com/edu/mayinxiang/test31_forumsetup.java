package com.edu.mayinxiang;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test31_forumsetup extends Admin_Login{
	@Test(description="发帖审核")
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[5]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[5]/a");
		webtest.click("id=postReview2");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("保存成功"));
	}
}