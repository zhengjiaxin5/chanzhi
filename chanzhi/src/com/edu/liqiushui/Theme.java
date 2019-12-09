package com.edu.liqiushui;



import static org.testng.Assert.assertTrue;



import javax.xml.xpath.XPath;



import org.testng.annotations.Test;



import com.webtest.core.BaseTest;

import com.webtest.demo.Admin_Login;

public class Theme extends Admin_Login{
	@Test(description="切换主题1")
	public void test2() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[1]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="切换主题2")
	public void test3() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[2]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test(description="切换主题3")
	public void test4() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[3]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="切换主题4")
	public void test5() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[4]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test(description="切换空白主题")
	public void test6() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test(description="自定义主题页面")
	public void test7() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/a/img");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/div[2]/a");
		assertTrue(webtest.isTextPresent("设置成功"));

		

	}

}