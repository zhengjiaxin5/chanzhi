package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Filter extends BaseTest{
	@Test(description="过滤器测试")
	public void testFilter() throws IOException {
		webtest.backgroundLogin("admin", "admin");
		webtest.click("xpath=//*[@id=\"filterFunction1\"]");
		webtest.click("id=submit");
		//断言
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		assertTrue(webtest.isTextPresent("保存成功"));
	}
}
