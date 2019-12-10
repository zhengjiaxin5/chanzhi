package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class DelBlock extends Admin_Login{
	@Test(priority = 1,description="区块自定义中添加一个区块")
	public void addBlock() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=区块");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.type("id=title","这是一个区块啊");//名称填写
		webtest.typeAndClear("xpath=//*[@id=\"params[moreText]\"]","右上角");//添加更多连接
		webtest.click("id=submit");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("保存成功"));
	}
	@Test(priority = 2,description="删除一个区块")
	public void delBlock() throws InterruptedException {
		webtest.mouseoverElement("xpath=/html/body/div/div[2]/div[1]/div/div[2]/span[1]");//鼠标放在该区块上
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[2]/span[1]/a[2]/i");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");//点击确认
	}
	
	
}
