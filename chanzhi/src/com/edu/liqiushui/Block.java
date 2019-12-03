package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Block extends Admin_Login1{
	@Test(priority = 1,description="区块自定义中添加一个区块")
	public void test9() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=区块");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.type("id=title","这是一个区块");//名称填写
		webtest.click("id=submit");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("保存成功"));
	}
	@Test(priority = 2,description="删除一个区块")
	public void test10() throws InterruptedException {
		webtest.mouseoverElement("xpath=/html/body/div/div[2]/div[1]/div/div[2]/span[1]");//鼠标放在该区块上
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[2]/span[1]/a[2]/i");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");//点击确认
	}
	
	
}
