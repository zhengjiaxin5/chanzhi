package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;

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
	@Test//关键词页面第二张跳转第一张
	public void test46() {
		webtest.click("link=推广");
		webtest.click("link=关键词");
		webtest.click("class=icon-play");
		webtest.click("class=icon icon-play icon-rotate-180");
		
	}
	@Test//关键词页面第二张跳转第一张
	public void test47() {
		webtest.click("link=推广");
		webtest.click("link=关键词");
		webtest.click("class=icon-step-forward");
		webtest.click("class=icon-step-backward");
		
	}
	@Test//熊掌号日志
	public void test48() {
		webtest.click("link=推广");
		webtest.click("link=熊掌号");
		webtest.click("link=日志");
		webtest.click("link=最近30天");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/table/tbody/tr[21]/td/div/a[1]");
		webtest.click("class=icon-step-forward");
		webtest.click("class=icon-step-backward");
	}
	@Test//关键词页面第二张跳转第一张
	public void test49() {
		webtest.click("link=推广");
		webtest.click("link=关键词");
		webtest.click("id=_recPerPage");
		webtest.click("link=25");
	}
	@Test//熊掌号日志清除内容并输入123
	public void test50() {
		webtest.click("link=推广");
		webtest.click("link=熊掌号");
		
		webtest.typeAndClear("id=name", "123");
	}
	
}
