package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class AddBlackListIPLogin extends BaseTest{
	@Test(description="添加黑名单-IP-登录测试")
	public void testAddblackIPLogin() throws IOException {
		webtest.addWhiteListAccount();
		webtest.testCloseSafety();
		//进入前台界面
		ReadProperties u = new ReadProperties();
		String url = u.getPropertyValue("front_url");
		webtest.open("url");
		//循环登录
		webtest.type("id=account", "demo");
		webtest.type("id=password", "demo0");
		for(int i=0;i<11;i++) {
			webtest.click("id=submit");
		}
		webtest.backgroundLogin("admin", "admin");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//鏂█
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
