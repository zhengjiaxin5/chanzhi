package com.edu.wangxiaodan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class content extends Admin_Login{
	@DataProvider
	public Object[][] name() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("E://nnn.xls", "sheet2");
		return s;
	}
	
	@Test(description="内容文章下添加多个目录",priority=1,dataProvider="name")
	/**
	 * 添加目录一，验证是否有目录一
	 * 添加@￥3￥hadsjkhfsd，验证是否有@￥3￥hadsjkhfsd
	 * 添加两个空格，验证是否提示请输入正确的类目名称
	 */
	public void test1(String name,String name1){
		testLogin();
		webtest.click("link=内容");
		webtest.click("link=文章");
		webtest.click("link=维护类目");
		webtest.type("id=children[]", name);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent(name1));
		
		
	}
	@Test(description="在目录一下添加一篇文章,标题不能重复")
	public void test2() {
		testLogin();
		webtest.click("link=内容");
		webtest.click("link=文章");
		boolean s=webtest.isTextPresent("这是一个title");
		webtest.click("link=目录一");
		webtest.click("link=发布文章");
		webtest.type("id=title", "这是一个title");
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", "这是第一篇文章的内容");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		if(s==true) {
			assert(webtest.isTextPresent("这是一个title"));
		}
	}
	/**
	 * 正确的添加一篇文章
	 * 添加一篇title为空格的文章
	 * 添加一篇内容为空格的文章
	 * 
	 */
	@DataProvider
	public Object[][] name1() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("E://nnn.xls", "sheet3");
		return s;
	}
	
	@Test(description="在目录一下添加一篇文章",dataProvider="name1")
	public void test3(String title,String content,String asserts) {
		testLogin();
		webtest.click("link=内容");
		webtest.click("link=文章");
		webtest.click("link=目录一");
		webtest.click("link=发布文章");
		webtest.type("id=title", title);
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", content);
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent(asserts));
	}
	@Test(description="在目录一下添加一篇title为空的文章")
	public void test4() {
		testLogin();
		webtest.click("link=内容");
		webtest.click("link=文章");
		webtest.click("link=目录一");
		webtest.click("link=发布文章");
//		webtest.type("id=title", );
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", "title为空");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("不能为空"));
		
	}
	@Test(description="在目录一下添加一篇内容为空的文章")
	public void test5() {
		testLogin();
		webtest.click("link=内容");
		webtest.click("link=文章");
		webtest.click("link=目录一");
		webtest.click("link=发布文章");
		webtest.type("id=title","内容为空" );
//		webtest.enterFrame(0);
//		webtest.click("tag=body");
//		webtest.type("tag=body", "title为空");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("不能为空"));
		
	}
	
}
