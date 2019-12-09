package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterAccountVerificationCode extends BaseTest{
	@Test
	public void testFilterAccountVerificationCode() throws UnknownHostException {
		webtest.addWhiteListIP();
		//打开页面
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//循环输入账号密码和错误的验证码
		for (int i = 0; i < 6; i++) {
			webtest.type("account", "demo");
			webtest.type("password", "demo");
			webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]", "1");
		}
		//断言
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
