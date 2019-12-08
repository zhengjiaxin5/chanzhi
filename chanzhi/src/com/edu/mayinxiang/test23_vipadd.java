package com.edu.mayinxiang;


import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test23_vipadd extends Admin_Login{
	@Test(description="会员的增加")
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=/html/body/div[1]/div/div/div/a");
		webtest.type("id=account","admin1");
		webtest.type("id=realname","admin");
		webtest.type("id=email","1234567@qq.com");
		webtest.type("id=password1","123456");
		webtest.type("id=password2","123456");
		webtest.tapClick();
		webtest.enter();
		assertTrue(webtest.isTextPresent("保存成功"));
	}
}