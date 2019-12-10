package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlackListIPVerification extends BaseTest{
	@Test(description="添加黑名单-IP-验证码测试")
	public void testAddBlackListIPVerification() throws IOException {
		webtest.addWhiteListAccount();
		webtest.click("id=captcha1");
		webtest.click("id=submit");
		webtest.type("id=account", "demo");
		webtest.type("id=password", "demo0");
		webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]", "1");
		for (int i = 0; i < 6; i++) {
			webtest.click("id=submit");
		}
		webtest.backgroundLogin("137554616", "fcschalke04");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//断言
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
