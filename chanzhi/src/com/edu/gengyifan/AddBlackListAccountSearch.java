package com.webtest.chanzhiepsProject;

import static org.testng.Assert.assertTrue;

import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlackListAccountSearch extends BaseTest{
	@Test
	public void testAddBlackListAccountSearch() throws UnknownHostException {
		webtest.addWhiteListIP();
		webtest.testCloseSafety();
		webtest.frontLogin("demo", "demo");
		for (int i = 0; i < 11; i++) {
			webtest.type("id=words", "1");
		}
		webtest.backgroundLogin("137554616", "fcschalke04");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//╤оят
		assertTrue(webtest.isTextPresent("demo"));
	}
}
