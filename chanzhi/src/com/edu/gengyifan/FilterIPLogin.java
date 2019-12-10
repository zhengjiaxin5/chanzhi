package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class FilterIPLogin extends BaseTest{
	@Test(description="过滤-IP-登录测试")
	public void testFilterIPLogin() throws IOException {
		webtest.addWhiteListAccount();
		ReadProperties u = new ReadProperties();
		String url = u.getPropertyValue("front_url");
		webtest.open("url");
		//循环登录
		webtest.type("id=account", "demo12345");
		webtest.type("id=password", "demo0");
		for(int i=0;i<9;i++) {
			webtest.click("id=submit");
		}
		//进入前台界面
		webtest.open(url);
		//循环登录
		webtest.type("id=account", "demo123456");
		webtest.type("id=password", "demo0");
		for(int i=0;i<2;i++) {
			webtest.click("id=submit");
		}
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
	
}
