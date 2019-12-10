package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlackListAccountSearch extends BaseTest{
	@Test(description="添加黑名单-账号-搜索测试")
	public void testAddBlackListAccountSearch() throws IOException {
		webtest.addWhiteListIP();
		webtest.testCloseSafety();
		webtest.frontLogin("demo12345", "demo12345");
		for (int i = 0; i < 11; i++) {
			webtest.type("id=words", "1");
		}
		webtest.backgroundLogin("admin", "admin");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//断言
		assertTrue(webtest.isTextPresent("demo12345"));
	}
}
