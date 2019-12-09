package com.edu.liqiushui;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class Code extends Admin_Login{
	
	@DataProvider(name="code")
	public  Object[] code() throws IOException{
		Object[] user= new  ExcelDataProvider().getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\chanzhieps1.xlsx","code");
		 return user;
	}
	//添加html、css、javascript代码
	@Test(dataProvider ="code",description="添加代码")
	public void test9(String html,String css,String Javascript) throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=区块");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=html源代码");//选择html选项
		
		webtest.type("id=title", "我有代码");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType(html);
		Thread.sleep(5000);
		//写css代码
		webtest.click("link=CSS");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType(css);
		Thread.sleep(5000);
		//写javascript
		webtest.click("link=Javascript");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType(Javascript);
		Thread.sleep(5000);
		webtest.click("link=保存");



		
		

	}
}