package com.edu.baoxuanqi;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;
public class demo1 extends Admin_Login{
	@Test(description="进行权重，关键词，链接排序")
	public void test1() {
		webtest.click("link=推广");
		webtest.click("link=权重");
		webtest.click("link=关键词");
		webtest.click("link=链接");
		webtest.click("xpath=/html/body/div/div/table/tfoot/tr/td/div/a[1]/i");
	}
	@Test(description="点击关键词进入文章")
	public void test11() {
		webtest.click("link=推广");
		webtest.click("link=免费cms");
		webtest.click("link=蝉知企业门户2.2.1版本发布");
	}
	@Test(description="")
	public void test12() throws InterruptedException {
		webtest.click("link=推广");
		webtest.click("link=免费cms");
		webtest.click("link=技术支持");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[3]/div/div/a");
	}
	@Test(description="删除关键词")
	public void test13() {
		webtest.click("link=推广");
		webtest.click("xpath=/html/body/div[1]/div/table/tbody/tr[5]/td[4]/a[2]");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
	}
	@Test(description="给关键词添加链接")
	public void test5() {
        webtest.click("link=推广");
		webtest.click("link=编辑链接");
		webtest.type("name=link", "http://www.baidu.com");
		webtest.click("id=submit");
	}
	@Test(description="搜索关键词")
	public void test14() {
		webtest.click("link=推广");
		webtest.type("name=tag","蝉知");
		webtest.click("id=submit");
	}
	@Test(description="进入关键词页面再返回首页")
	public void test15() {
		webtest.click("link=推广");
		webtest.click("link=蝉知");
	}
	@Test(description="关键词页面第二张跳转第一张")
	public void test46() {
		webtest.click("link=推广");
		webtest.click("link=关键词");
		webtest.click("class=icon-play");
		webtest.click("class=icon icon-play icon-rotate-180");
	}
	@Test(description="关键词跳转到最后一页和最前一页")
	public void test47() {
		webtest.click("link=推广");
		webtest.click("link=关键词");
		webtest.click("class=icon-step-forward");
		webtest.click("class=icon-step-backward");
	}
	@Test(description="查看熊掌号日志最近30天")
	public void test48() {
		webtest.click("link=推广");
		webtest.click("link=熊掌号");
		webtest.click("link=日志");
		webtest.click("link=最近30天");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/table/tbody/tr[21]/td/div/a[1]");
		webtest.click("class=icon-step-forward");
		webtest.click("class=icon-step-backward");
	}
	@Test(description="将关键词改成每页显示25条")
	public void test49() {
		webtest.click("link=推广");
		webtest.click("link=关键词");
		webtest.click("id=_recPerPage");
		webtest.click("link=25");
	}
	@Test(description="熊掌号日志清除内容并输入123")
	public void test50() {
		webtest.click("link=推广");
		webtest.click("link=熊掌号");
		webtest.typeAndClear("id=name", "123");
	}

	

}
