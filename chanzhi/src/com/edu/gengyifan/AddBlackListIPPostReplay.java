package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlackListIPPostReplay extends BaseTest{
	@Test(description="添加黑名单-IP-回帖测试")
	public void testAddBlackListIPPostReplay() throws IOException {
		webtest.addWhiteListAccount();
		webtest.frontLogin("demo12345", "demo12345");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[1]/a");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[3]/table/tbody/tr/td[2]/div/a");
		for(int i=0;i<6;i++) {
			webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
			webtest.enterFrame(0);
			webtest.click("tag=body");
			webtest.type("tag=body", "1");
			webtest.leaveFrame();
			webtest.click("id=submit");
		}
		webtest.backgroundLogin("admin", "admin");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//鏂█
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
