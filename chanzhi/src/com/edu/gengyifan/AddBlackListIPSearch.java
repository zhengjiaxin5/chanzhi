package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlackListIPSearch extends BaseTest{
	@Test
	public void testAddBlackListIPSearch() {
		webtest.addWhiteListAccount();
		webtest.testCloseSafety();
		webtest.frontLogin("demo", "demo");
		for (int i = 0; i < 11; i++) {
			webtest.type("id=words", "1");
		}
		webtest.backgroundLogin("137554616", "fcschalke04");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//断言
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
