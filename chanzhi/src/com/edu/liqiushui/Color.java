package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class Color extends Admin_Login{
	@DataProvider(name="color")
	public  Object[][] changesize() throws IOException{
		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\chanzhieps1.xlsx","color");
		 return user;
	}

	@Test(dataProvider ="color",description="添加有颜色区块")
	public void color0(String icon,String border,String top,String right,String bottom,String left,String title,String background,String text,String link,String back) {
		webtest.click("link=设计");
		webtest.click("link=区块");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.type("id=title","我有颜色");//名称填写
		webtest.click("link=样式");
		//数据驱动
		webtest.type("xpath=//*[@id=\"params[custom][blank][iconColor]\"]",icon);
		webtest.type("xpath=//*[@id=\"params[custom][blank][borderColor]\"]",border);
		webtest.type("xpath=//*[@id=\"params[custom][blank][paddingTop]\"]",top);
		webtest.type("xpath=//*[@id=\"params[custom][blank][paddingRight]\"]",right);
		webtest.type("xpath=//*[@id=\"params[custom][blank][paddingBottom]\"]",bottom);
		webtest.type("xpath=//*[@id=\"params[custom][blank][paddingLeft]\"]",left);
		webtest.type("xpath=//*[@id=\"params[custom][blank][titleColor]\"]",title);
		webtest.type("xpath=//*[@id=\"params[custom][blank][titleBackground]\"]",background);
		webtest.type("xpath=//*[@id=\"params[custom][blank][textColor]\"]",text);
		webtest.type("xpath=//*[@id=\"params[custom][blank][linkColor]\"]",link);
		webtest.type("xpath=//*[@id=\"params[custom][blank][backgroundColor]\"]",back);


		
		webtest.typeAndClear("xpath=//*[@id=\"thumbs[s][width]\"]",icon);
		

		webtest.click("id=submit");
	}
	
	
	
}
