package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Theme extends Admin_Login1{
	
	@Test(priority = 1,description="切换主题1")
	//设计-主题模块
	public void test1() {
		testLogin();
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/a");
		webtest.click("link=主题");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[1]/div/a/img");//切换为第一个主题
		assertTrue(webtest.isTextPresent("zhuti"));

	}
	@Test(description="切换主题2")
	public void test2() {
		testLogin();
		webtest.click("link='设计'");
		webtest.click("link='主题'");
		webtest.click("//*[@id=\"internalSection\"]/div[2]/div/a/img");//切换为第二个主题
		assertTrue(webtest.isTextPresent("zhuti2"));

	}
	@Test(description="切换主题3")
	public void test3() {
		testLogin();
		webtest.click("link='设计'");
		webtest.click("link='主题'");
		webtest.click("//*[@id=\"internalSection\"]/div[3]/div/a/img");//切换为第三个主题

	}
	@Test(description="切换空白主题")
	public void test4() {
		testLogin();
		webtest.click("link='设计'");
		webtest.click("link='主题'");
		webtest.click("//*[@id=\"internalSection\"]/div[5]/div/a/img");//切换成空白主题

	}
	/*
	//在自定义主题中添加一个区块
	public void test5() {
		testLogin();
		webtest.click("link='设计'");
		webtest.click("link='主题'");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//切换成空白主题
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//进入自定义
		//用数据驱动
		

	}
	*/
	//可视化编辑中改变轮播图顺序
	@Test(description="改变轮播图顺序")
	public void test6() {
		testLogin();
		webtest.click("link='设计'");
		webtest.click("link='主题'");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//切换成空白主题
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/div[2]/a");//进入自定义
		webtest.click("/html/body/div/div/div[2]/div/a[1]");//进入可视化编辑
		webtest.click("/html/body/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div[2]/a[4]");//换顺序
	}
	
	

}
