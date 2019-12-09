package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class Export extends Admin_Login{
	@DataProvider(name="export")
	public  Object[][] export() throws IOException{
		Object[][] user= new ExcelDataProvider().getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\chanzhieps1.xlsx","export");
		 return user;
	}
	
	@Test(dataProvider ="export",description="导出主题")
	public void export0(String name,String code,String author,String email,String demo,String qq) throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/a/img");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/div[2]/a");
		webtest.click("xpath=//*[@id=\"dsMenu\"]/div/a[2]");
		
		webtest.type("id=name",name);
		webtest.type("id=code",code);
		webtest.type("id=author",author);
		webtest.type("id=email",email);
		webtest.type("id=demo",demo);
		webtest.type("id=qq",qq);


		webtest.enter();
		Thread.sleep(10000);
//		webtest.alertAccept();
		webtest.goBack();	
	}

}
