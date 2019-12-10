package com.edu.gengyifan;

import static org.testng.Assert.assertFalse;

import java.io.IOException;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class WhiteListAccountLogin extends BaseTest{
	@Test(description="白名单-账号-登录测试")
	public void testWhiteListAccountLogin() throws IOException {
		webtest.addWhiteListIP();
		webtest.backgroundLogin("admin", "admin");
		webtest.click("id=filterFunction1");
		webtest.click("id=submit");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[4]/a");
		webtest.type("id=account", "demo");
		webtest.type("id=password", "fcschalke04");
		webtest.click("id=submit");
		for (int i = 0; i < 11; i++) {
			webtest.type("id=account", "demo");
			webtest.type("id=password", "demo0");
			webtest.click("id=submit");
		}
		webtest.type("id=account", "demo");
		webtest.type("id=password", "demo");
		webtest.click("id=submit");
		assertFalse(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
