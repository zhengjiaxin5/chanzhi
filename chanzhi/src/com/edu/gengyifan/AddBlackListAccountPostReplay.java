package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlackListAccountPostReplay extends BaseTest{
	@Test
	public void testAddBlackListAccountPostReplay() throws UnknownHostException {
		webtest.addWhiteListIP();
		webtest.frontLogin("demo", "demo");
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
		webtest.backgroundLogin("137554616", "fcschalke04");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//╤оят
		assertTrue(webtest.isTextPresent("demo"));
	}
}
