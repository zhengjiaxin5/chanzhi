package com.edu.yanxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Test11 extends Admin_Login{
	@Test(description="蝉知首页发布文章跳转")
	public void testGsxx1() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[1]");
		assertTrue(webtest.isTextPresent("发布文章"));
	}
	
	@Test(description="蝉知首页添加产品跳转")
	public void testGsxx2() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[2]");
		assertTrue(webtest.isTextPresent("添加产品"));
	}
	
	@Test(description="蝉知首页处理反馈跳转")
	public void testGsxx3() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[3]");
		assertTrue(webtest.isTextPresent("处理反馈"));
	}
	
	@Test(description="蝉知首页站点设置跳转")
	public void testGsxx4() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[4]");
		assertTrue(webtest.isTextPresent("基本信息设置"));
	}
	
	@Test(description="蝉知首页公司信息跳转")
	public void testGsxx5() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[5]");
		assertTrue(webtest.isTextPresent("公司信息"));
	}
	
	@Test(description="蝉知首页联系方式跳转")
	public void testGsxx6() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[6]");
		assertTrue(webtest.isTextPresent("联系方式"));
	}

}
