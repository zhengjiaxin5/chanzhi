package com.edu.yanxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Test3 extends Admin_Login{
	@Test(description="添加公司信息")
	public void testGsxx() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[2]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[1]/a");
		webtest.type("xpath=//*[@id=\"name\"]", "!");
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", "bbbbbb");
		webtest.leaveFrame();
		webtest.enterFrame(1);
		webtest.click("tag=body");
		webtest.type("tag=body", "bbbbbb");
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}

}
