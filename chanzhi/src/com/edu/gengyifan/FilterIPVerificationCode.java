package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class FilterIPVerificationCode extends BaseTest{
	@Test(description="过滤-IP-验证码测试")
	public void testFilterIPVerificationCode() throws IOException {
		webtest.addWhiteListAccount();
		//打开页面
		ReadProperties u = new ReadProperties();
		String url = u.getPropertyValue("front_url");
		webtest.open("url");
		//循环输入账号密码和错误的验证码
		webtest.type("account", "demo12345");
		webtest.type("password", "demo12345");
		webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]", "1");
		for (int i = 0; i < 4; i++) {
			webtest.click("id=submit");
		}
		//循环输入账号密码和错误的验证码
		webtest.open("url");
		webtest.type("account", "demo123456");
		webtest.type("password", "demo123456");
		webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]", "1");
		for (int i = 0; i < 2; i++) {
			webtest.click("id=submit");
		}
		//断言
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
