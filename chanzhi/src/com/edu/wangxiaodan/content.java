package com.edu.wangxiaodan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.injector.UnableToInstaniateInstanceException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;
import com.webtest.demo.Front_Login_Test;
import com.webtest.utils.ReadProperties;

public class content extends Admin_Login{
	
	@DataProvider
	public Object[][] name() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\nnn.xls", "sheet2");
		return s;
	}
	
	@Test(description="内容文章下添加多个目录",priority=1,dataProvider="name")
	/**
	 * 添加目录一，验证是否有目录一
	 * 添加@￥3￥hadsjkhfsd，验证是否有@￥3￥hadsjkhfsd
	 * 添加两个空格，验证是否提示请输入正确的类目名称
	 */
	public void addleimu(String name,String name1) throws IOException{
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=文章");
		webtest.click1("link=维护类目");
		webtest.type("id=children[]", name);
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent(name1));
		
		
	}
	@Test(description="在目录一下添加一篇文章,标题不能重复",priority=2)
	public void addwenzhang() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=文章");
		boolean s=webtest.isTextPresent("这是一个title");
		webtest.click1("link=目录一");
		webtest.click1("link=发布文章");
		webtest.type("id=title", "这是一个title");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "这是第一篇文章的内容");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		if(s==true) {
			assert(webtest.isTextPresent("该类目已经存在"));
		}else {
			assertTrue(webtest.isTextPresent("这是一个title"));
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
		Object[][] s=excelDataProvider.getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\nnn.xls", "sheet3");
		return s;
	}
	
	@Test(description="在目录一下添加一篇文章",dataProvider="name1",priority=3)
	public void dataaddwenzhang(String title,String content,String asserts) throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=文章");
		webtest.click1("link=目录一");
		webtest.click1("link=发布文章");
		webtest.type("id=title", title);
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", content);
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent(asserts));
	}
	@Test(description="删除目录二",priority=4)
	public void deleteleimu() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=文章");
		webtest.click1("link=维护类目");
		webtest.click1("xpath=//li[@data-id='6']/a[@class='deleter']");
		webtest.click1("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		assertTrue(webtest.isTextPresent("目录二"));
	}
	@Test(description="在目录一下添加一篇title为空的文章",priority=4)
	public void wenzhangwithouttitle() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=文章");
		webtest.click1("link=目录一");
		webtest.click1("link=发布文章");
//		webtest.type("id=title", );
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "title为空");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("不能为空"));
		
	}
	@Test(description="在目录一下添加一篇内容为空的文章",priority=5)
	public void addwenzhangwithoutcontent() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=文章");
		webtest.click1("link=目录一");
		webtest.click1("link=发布文章");
		webtest.type("id=title","内容为空" );
//		webtest.enterFrame(0);
//		webtest.click1("tag=body");
//		webtest.type("tag=body", "title为空");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("不能为空"));
		
	}
	@Test(description="对文章输入内容搜索",priority=6)
	public void findwenzhang() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=文章");
		webtest.type("id=searchWord", "title");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("title"));
	}
	@Test(description="直接点击搜索",priority=7)
	public void clickfind() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=文章");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("请输入搜索内容"));
	}
	@Test(description="添加单页",priority=8)
	public void adddanye() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=单页");
		webtest.click1("link=添加单页");
		webtest.type("id=title", "第一个单页title");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "第一个单页内容");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("第一个单页title"));
	}
	@Test(description="添加title为空的单页",priority=9)
	public void adddanyewithouttitle() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=单页");
		webtest.click1("link=添加单页");
//		webtest.type("id=title", "第一个单页title");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "第一个单页内容");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("不能为空"));
	}
	@Test(description="添加内容为空的单页",priority=10)
	public void adddanyewithoutcontent() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=单页");
		webtest.click1("link=添加单页");
		webtest.type("id=title", "第二个单页title");
//		webtest.enterFrame(0);
//		webtest.click1("tag=body");
//		webtest.type("tag=body", "第一个单页内容");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("第一个单页title"));
	}
	@Test(description="对单页输入内容搜索",priority=11)
	public void finddanye() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=单页");
		webtest.type("id=searchWord", "title");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("title"));
	}
	@Test(description="单页直接点击搜索",priority=12)
	public void clickfinddanye() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=单页");
		webtest.click1("xpath=//input[@id='submit']");
		assertTrue(webtest.isTextPresent("请输入搜索内容"));
	}
	@Test(description="博客下添加类目",priority=13)
	public void addbokeleimu() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=博客");
		webtest.click1("link=维护类目");
		webtest.type("id=children[]", "第一类目");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("第一类目"));
	}
	@Test(description="第一类目下添加博客",priority=14)
	public void addboke() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=博客");
		webtest.click1("link=第一类目");
		webtest.click1("link=发布博客");
		webtest.type("id=title", "博客title");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "第一个单页内容");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("博客title"));
		
	}
	@Test(description="第一类目下添加title为空的博客",priority=15)
	public void addbokewithouttitle() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=博客");
		webtest.click1("link=第一类目");
		webtest.click1("link=发布博客");
//		webtest.type("id=title", "博客title");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "第一个单页内容");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("不能为空"));
		
	}
	@Test(description="第一类目下添加内容为空博客",priority=16)
	public void addbokewithoutcontent() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=博客");
		webtest.click1("link=第一类目");
		webtest.click1("link=发布博客");
		webtest.type("id=title", "博客title");
//		webtest.enterFrame(0);
//		webtest.click1("tag=body");
//		webtest.type("tag=body", "第一个单页内容");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("不能为空"));
		
	}
	@Test(description="对博客输入内容搜索",priority=17)
	public void findboke() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=博客");
		webtest.type("id=searchWord", "博客title");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("title"));
	}
	@Test(description="博客直接点击搜索",priority=18)
	public void clickfindboke() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=博客");
		webtest.click1("xpath=//input[@id='submit']");
		assertTrue(webtest.isTextPresent("请输入搜索内容"));
	}
	@Test(description="添加手册下的类目",priority=19)
	public void addshouce() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=手册");
		webtest.click1("link=添加");
		webtest.type("id=title", "用户手册");
		webtest.type("id=alias", "这是用户手册");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("用户手册"));
	}
	@DataProvider
	public Object[][] name3() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\nnn.xls", "sheet4");
		return s;
	}
	@Test(description="用户手册下面添加章节",priority=20,dataProvider="name3")
	public void addzhangjie(String title1,String title2) throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=手册");
		webtest.click1("link=用户手册");
		webtest.click1("link=章节");
		webtest.type("id=title[]", title1);
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent(title2));
	}
	@Test(description="在手册下进行搜索",priority=21)
	public void findsouce() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=手册");
		webtest.type("id=searchWord", "关于我们");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("关于我们"));
		
	}
	@Test(description="在手册下进行搜索",priority=21)
	public void clickfindshouce() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=手册");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("请输入搜索内容"));
	}
	@Test(description="手册下的设置显示第一个option",priority=22)
	public void shezhibuju() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=手册");
		webtest.click1("xpath=/html/body/div/div[1]/div/div/div/div/a[2]");
		webtest.click1("id=index");
		webtest.click1("xpath=//option[@value='1']");
		webtest.click1("id=submit");
		ReadProperties u=new ReadProperties();
		String url=u.getPropertyValue("fronturl");
		webtest.open(url);
		webtest.click1("link=手册");
		assertTrue(webtest.isTextPresent("常见问题"));
	}
	@Test(description="手册下的设置显示手册列表",priority=22)
	public void shezhibujuliebiao() throws IOException {
		testLogin();
		webtest.click1("link=内容");
		webtest.click1("link=手册");
		webtest.click1("xpath=/html/body/div/div[1]/div/div/div/div/a[2]");
		webtest.click1("id=index");
		webtest.click1("xpath=//option[@value='list']");
		webtest.click1("id=submit");
		ReadProperties u=new ReadProperties();
		String url=u.getPropertyValue("fronturl");
		webtest.open(url);
		webtest.click1("link=手册");
		assertTrue(webtest.isTextPresent("用户手册"));
		assertTrue(webtest.isTextPresent("常见问题"));
	}
}
