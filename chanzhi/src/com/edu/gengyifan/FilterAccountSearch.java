package com.webtest.chanzhiepsProject;


import static org.testng.Assert.assertTrue;

import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterAccountSearch extends BaseTest{
	@Test
	public void testFilterAccountSearch() throws UnknownHostException {
		webtest.addWhiteListIP();
		webtest.frontLogin("demo","demo");
		for(int i=0;i<11;i++) {
		webtest.type("id=words", "1");
		}
		//断言
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
