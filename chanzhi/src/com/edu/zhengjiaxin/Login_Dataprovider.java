package com.edu.zhengjiaxin;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
//4
public class Login_Dataprovider extends BaseTest {
	@DataProvider(name="chanzhieps")
	public  Object[][] getchanzhiepsData() throws IOException{
		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\chanzhieps.xlsx","chanzhieps");
		 return user;
	}

    @Test(dataProvider ="chanzhieps",description="数据驱动批量登录")
   public void test(String account,String password) {
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		webtest.open("http://127.0.0.1:8011/chanzhieps/www/admin.php");
		webtest.type("name=account",account);
		webtest.type("name=password",password);
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[2]/li/a/i");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[2]/li/ul/li[8]/a");

  }


}