package com.edu.liqiushui;



import static org.testng.Assert.assertTrue;



import javax.xml.xpath.XPath;



import org.testng.annotations.Test;



import com.webtest.core.BaseTest;

import com.webtest.demo.Admin_Login;

public class Theme extends Admin_Login{
	@Test(description="切换主题1")
	public void theme1() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[1]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="切换主题2")
	public void theme2() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[2]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test(description="切换主题3")
	public void theme3() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[3]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="切换主题4")
	public void theme4() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[4]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test(description="切换空白主题")
	public void theme5() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/a/img");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test(description="自定义主题页面")
	public void theme6() {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/a/img");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/div[2]/a");
		assertTrue(webtest.isTextPresent("设置成功"));

		

	}

}