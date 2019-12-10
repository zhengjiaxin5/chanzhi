package com.edu.wangxiaodan;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;



public class shopcity extends Admin_Login{
	@DataProvider
	public Object[][] leimu() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\nnn.xls", "leimu");
		return s;
	}
	@Test(description="商城产品下添加类目",priority=1,dataProvider="leimu")
	public void addshopleimu(String name,String name1) throws IOException{
		this.testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("link=维护类目");
		webtest.type("id=children[]",name);
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent(name1));
	}
	@Test(description="删除四川风味",priority=2)
	public void deletesichuan() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("link=维护类目");
		webtest.click1("xpath=//li[@data-id='4']/a[@class='deleter']");
		webtest.click1("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		assertTrue(webtest.isTextPresent("四川风味"));
	}
	@Test(description="添加产品",priority=2)
	public void addproduction() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("link=卤煮");
		webtest.click1("link=添加产品");
		webtest.type("xpath=//input[@name='name']", "鸡爪");
		System.out.println(webtest.isElementPresent("class=ke-edit-iframe"));
		webtest.enterFrame(1);
		webtest.click1("tag=body");
		webtest.type("tag=body", "这是一个鸡爪");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("鸡爪"));
		
	}
	@Test(description="添加名称为空的产品",priority=2)
	public void addprowithoutname() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("link=卤煮");
		webtest.click1("link=添加产品");
		System.out.println(webtest.isElementPresent("class=ke-edit-iframe"));
		webtest.enterFrame(1);
		webtest.click1("tag=body");
		webtest.type("tag=body", "这是一个鸡爪");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("不能为空"));
		
		
	}
	@Test(description="添加详情为空的产品",priority=2)
	public void addprowoutdetail() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("link=卤煮");
		webtest.click1("link=添加产品");
		webtest.type("xpath=//input[@name='name']", "鸡爪");
		System.out.println(webtest.isElementPresent("class=ke-edit-iframe"));
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("不能为空"));
		
	}
	@Test(description="将鸡爪下架",priority=3)
	public void xiajiajizhua() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("xpath=");
		webtest.open("http://127.0.0.1:8066/chanzhieps/www/index.php/product/c0.html");
		assertFalse(webtest.isTextPresent("鸡爪"));
		
		
	}
	@Test(description="将鸡爪上架",priority=4)
	public void shangjiajizhua() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[4]");
		webtest.open("http://127.0.0.1:8066/chanzhieps/www/index.php/product/c0.html");
		assertTrue(webtest.isTextPresent("鸡爪"));
		
		
	}
	@Test(description="搜索",priority=5)
	public void findjizhua() throws IOException {
		testLogin();
		webtest.click1("xpath=//a[text()='商城']");
		webtest.click1("xpath=//a[text()='产品']");
		webtest.type("xpath=//*[@id='searchWord']", "鸡爪");
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("鸡爪"));
	}
	@Test(description="将鸡爪的库存改为600",priority=6)
	public void change1() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "600");
		webtest.pause(3000);String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("600"));
		
		
	}
	@Test(description="将鸡爪的库存改为0.05",priority=7)
	public void change2() throws InterruptedException, IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "0.05");
		webtest.pause(3000);String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("库存应当是数字"));
		
		
	}
	@Test(description="将鸡爪的库存改为-600",priority=8)
	public void change3() throws InterruptedException, IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "-600");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("库存数量为正整数"));
		
		
	}
	@Test(description="将鸡爪删除",priority=9)
	public void deletejizhua() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("link=产品");
		webtest.click1("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/span[2]/a");
		webtest.click1("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/span[2]/ul/li[1]/a");
		webtest.click1("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		assertFalse(webtest.isTextPresent("鸡爪"));
	}
	@DataProvider
	public Object[][] name() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\nnn.xls", "kuaidi");
		return s;
	}
	@Test(description="添加快递",priority=10,dataProvider="name")
	public void addkuaidi(String kuaidi,String kuaidi2) throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click1("link=快递");
		webtest.typeAndClear("xpath=//*[@id='children[]']", kuaidi);
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent(kuaidi2));
	}
	@Test(description="删除百世快递",priority=11)
	public void deletekuadi() throws IOException {
		testLogin();
		webtest.click1("link=商城");
		webtest.click1("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click1("link=快递");
		webtest.click1("xpath=//li[@data-id='2']/a");
		webtest.click1("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		assertFalse(webtest.isTextPresent("百世"));
	}

	
	
}

