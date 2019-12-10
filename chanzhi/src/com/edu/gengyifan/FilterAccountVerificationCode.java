package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class FilterAccountVerificationCode extends BaseTest{
	@Test(description="过滤-账号-验证码测试")
	public void testFilterAccountVerificationCode() throws IOException {
		webtest.addWhiteListIP();
		//进入前台界面
		ReadProperties u = new ReadProperties();
		String url = u.getPropertyValue("front_url");
		webtest.open("url");
				
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
