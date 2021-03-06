package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class FilterAccountLogin extends BaseTest{
	@Test(description="过滤-账号-登录测试")
	public void testFilterAccountLogin() throws IOException {
		webtest.addWhiteListIP();
		//进入前台界面
		ReadProperties u = new ReadProperties();
		String url = u.getPropertyValue("front_url");
		webtest.open("url");
		//循环登录
		webtest.type("id=account", "demo12345");
		webtest.type("id=password", "demo0");
		for(int i=0;i<11;i++) {
			webtest.click("id=submit");
		}
		//断言
		assertTrue(webtest.isTextPresent("用户已经被锁定，请3分钟后再重新尝试登录"));
	}
}
