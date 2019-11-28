package com.edu.wangxiaodan;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

import bsh.org.objectweb.asm.Type;


public class shopcity extends Admin_Login{
	
	@Test(description="商城产品下添加卤煮类目",priority=1)
	public void test1(){
		testLogin();
		webtest.click("link=商城");
		webtest.click("link=产品");
		webtest.click("link=维护类目");
		boolean s=webtest.isTextPresent("卤煮");
		webtest.type("id=children[]","卤煮");
		webtest.click("xpath=//input[@type='submit']");
		if(s==true) {
			assertTrue(webtest.isTextPresent("不能添加重复的类目"));
		}else {
			assertTrue(webtest.isTextPresent("卤煮"));
		}
		
		
	}
	@Test(description="添加产品",priority=2)
	public void test3() {
		testLogin();
		webtest.click("link=商城");
		webtest.click("link=产品");
		webtest.click("xpath=//*[@id='category19']");
		webtest.click("xpath=/html/body/div/div[2]/div/div/div/a/i");
		webtest.type("xpath=//input[@name='name']", "鸡爪");
		System.out.println(webtest.isElementPresent("class=ke-edit-iframe"));
		webtest.enterFrame(1);
		webtest.click("tag=body");
		webtest.type("tag=body", "这是一个鸡爪");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("油泼面"));
		
	}
	@Test(description="将鸡爪下架",priority=3)
	public void test4() {
		testLogin();
		webtest.click("link=商城");
		webtest.click("link=产品");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[4]");
		webtest.open("http://127.0.0.1:8066/chanzhieps/www/index.php/product/c0.html");
		assertFalse(webtest.isTextPresent("鸡爪"));
		
		
	}
	@Test(description="将鸡爪上架",priority=4)
	public void test5() {
		testLogin();
		webtest.click("link=商城");
		webtest.click("link=产品");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[4]");
		webtest.open("http://127.0.0.1:8066/chanzhieps/www/index.php/product/c0.html");
		assertTrue(webtest.isTextPresent("鸡爪"));
		
		
	}
	@Test(description="搜索",priority=5)
	public void test6() {
		testLogin();
		webtest.click("xpath=//a[text()='商城']");
		webtest.click("xpath=//a[text()='产品']");
		webtest.type("xpath=//*[@id='searchWord']", "鸡爪");
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("鸡爪"));
	}
	@Test(description="将鸡爪的库存改为600",priority=6)
	public void test7() {
		testLogin();
		webtest.click("link=商城");
		webtest.click("link=产品");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "600");
		webtest.pause(3000);String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("600"));
		
		
	}
	@Test(description="将鸡爪的库存改为0.05",priority=7)
	public void test8() throws InterruptedException {
		testLogin();
		webtest.click("link=商城");
		webtest.click("link=产品");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "0.05");
		webtest.pause(3000);String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("库存应当是数字"));
		
		
	}
	@Test(description="将鸡爪的库存改为-600",priority=8)
	public void test9() throws InterruptedException {
		testLogin();
		webtest.click("link=商城");
		webtest.click("link=产品");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "-600");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("库存数量为正整数"));
		
		
	}
	@Test(description="将鸡爪删除",priority=9)
	public void test10() {
		testLogin();
		webtest.click("link=商城");
		webtest.click("link=产品");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/span[2]/a");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/span[2]/ul/li[1]/a");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		assertFalse(webtest.isTextPresent("鸡爪"));
	}
	@Test(description="添加快递",priority=10)
	public void test11() {
		testLogin();
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("link=快递");
		webtest.typeAndClear("xpath=//*[@id='children[]']", "中通");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("中通"));
	}
	@Test(description="删除快递",priority=11)
	public void test12() {
		testLogin();
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("link=快递");
		webtest.click("xpath=/html/body/div/div[2]/div/div[1]/div/div[2]/div/ul/li/a");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertFalse(webtest.isTextPresent("中通"));
	}
	
}

