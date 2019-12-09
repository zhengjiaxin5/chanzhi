package com.edu.liqiushui;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;



public class BlockArt extends Admin_Login{
	
	@DataProvider(name="article")
	public  Object[][] article() throws IOException{
		Object[][] user= new ExcelDataProvider().getTestDataByExcel("E:\\data\\chanzhieps.xlsx","article");
		 return user;
	}
	
	@Test(dataProvider ="article",description="最新文章中添加一个区块")
	public void test(String title,String limit,String moretext,String moreurl) throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=区块");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=最新文章");
		
		//数据驱动
		webtest.typeAndClear("id=title",title);
		webtest.type("id=params[limit]",limit );
		webtest.type("xpath=//*[@id=\"params[moreText]\"]",moretext);//添加更多连接
		webtest.type("id=params[moreUrl]",moreurl);
		webtest.click("id=submit");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("保存成功"));
	}
}