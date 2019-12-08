package com.edu.yanxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Test7 extends Admin_Login{
	@Test(description="开放登录GitHub")
	public void testGsxx() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.type("xpath=/html/body/div/div[2]/div/div[3]/div/div[2]/form/table/tbody/tr[1]/td/input", "github");
		webtest.type("xpath=/html/body/div/div[2]/div/div[3]/div/div[2]/form/table/tbody/tr[2]/td/input", "!");
		webtest.click("xpath=/html/body/div/div[2]/div/div[3]/div/div[2]/form/table/tbody/tr[4]/td/input[1]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}

}
