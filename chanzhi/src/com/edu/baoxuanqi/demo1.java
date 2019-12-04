package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class demo1 extends Admin_Login{
	@Test//关键词
	public void test1() {
		webtest.click("link=推广");
		webtest.click("link=权重");
		webtest.click("link=关键词");
		webtest.click("link=链接");
		webtest.click("xpath=/html/body/div/div/table/tfoot/tr/td/div/a[1]/i");
	}
	@Test//关键词点击
	public void test11() {
		webtest.click("link=推广");
		webtest.click("link=免费cms");
		webtest.click("link=蝉知企业门户2.2.1版本发布");
		
	}
	@Test//关键词点击
	public void test12() throws InterruptedException {
		webtest.click("link=推广");
		webtest.click("link=免费cms");
		webtest.click("link=技术支持");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[3]/div/div/a");
		
		
	}
	@Test//删除关键词
	public void test13() {
		webtest.click("link=推广");
		webtest.click("xpath=/html/body/div[1]/div/table/tbody/tr[5]/td[4]/a[2]");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		
		
	}
	@Test//关键词增加链接
	public void test5() {
		webtest.click("link=推广");
		webtest.click("link=编辑链接");
		webtest.type("name=link", "http://www.baidu.com");
		webtest.click("id=submit");
		
	}
	@Test//搜索关键词
	public void test14() {
		webtest.click("link=推广");
		webtest.type("name=tag","蝉知");
		webtest.click("id=submit");
		
		
	}
	@Test//关键词页面返回首页
	public void test15() {
		webtest.click("link=推广");
		webtest.click("link=蝉知");
		
		
	}
}
