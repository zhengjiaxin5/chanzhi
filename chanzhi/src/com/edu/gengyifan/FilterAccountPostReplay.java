package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterAccountPostReplay extends BaseTest{
	@Test(description="过滤-账号-回帖测试")
	public void testFilterAccountLogin() throws IOException {
		webtest.addWhiteListIP();
		webtest.frontLogin("demo12345","demo12345");
		webtest.click("link=论坛");
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
		//断言
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
