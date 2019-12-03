package com.webtest.chanzhiepsProject;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Filter extends BaseTest{
	@Test
	public void testFilter() {
		webtest.backgroundLogin("137554616", "fcschalke04");
		webtest.click("xpath=//*[@id=\"filterFunction1\"]");
		webtest.click("id=submit");
		//¶ÏÑÔ
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		assertTrue(webtest.isTextPresent("±£´æ³É¹¦"));
	}
}
