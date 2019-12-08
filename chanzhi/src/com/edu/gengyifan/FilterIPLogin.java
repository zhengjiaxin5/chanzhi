package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterIPLogin extends BaseTest{
	@Test
	public void testFilterIPLogin() {
		webtest.addWhiteListAccount();
		//进入前台界面
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//循环登录
		webtest.type("id=account", "demo");
		webtest.type("id=password", "demo0");
		for(int i=0;i<9;i++) {
			webtest.click("id=submit");
		}
		//进入前台界面
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//循环登录
		webtest.type("id=account", "demo0");
		webtest.type("id=password", "demo0");
		for(int i=0;i<2;i++) {
			webtest.click("id=submit");
		}
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
	
}
