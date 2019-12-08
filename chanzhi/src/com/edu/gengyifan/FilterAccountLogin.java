package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterAccountLogin extends BaseTest{
	@Test
	public void testFilterAccountLogin() throws UnknownHostException {
		webtest.addWhiteListIP();
		//进入前台界面
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//循环登录
		webtest.type("id=account", "demo");
		webtest.type("id=password", "demo0");
		for(int i=0;i<11;i++) {
			webtest.click("id=submit");
		}
		//断言
		assertTrue(webtest.isTextPresent("用户已经被锁定，请3分钟后再重新尝试登录"));
	}
}
