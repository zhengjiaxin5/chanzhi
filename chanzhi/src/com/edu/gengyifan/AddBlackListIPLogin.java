package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlackListIPLogin extends BaseTest{
	@Test
	public void testAddblackIPLogin() {
		webtest.addWhiteListAccount();
		webtest.testCloseSafety();
		for (int i = 0; i < 11; i++) {
			webtest.type("id=account", "demo");
			webtest.type("id=password", "demo0");
			webtest.click("id=submit");
		}
		webtest.backgroundLogin("137554616", "fcschalke04");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//断言
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
