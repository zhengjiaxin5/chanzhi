package com.edu.liqiushui;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Block extends Admin_Login{
	@Test(description="自定义区块添加一个区块")
	public void test9() {
		webtest.click("link='设计'");
		webtest.click("link='区块'");
		webtest.click("/html/body/div/div[2]/div[1]/div/div[1]/div/a/i");//添加
		webtest.type("id=title","这是一个区块");//名称填写
		webtest.click("id=submit");
		
	}
	@Test(description="删除一个区块")
	public void test10() {
		webtest.click("link='设计'");
		webtest.click("link='区块'");
		webtest.click("/html/body/div[1]/div[2]/div[1]/div/div[2]/span[1]/a[2]/i");//删除区块

		
	}

}
