package com.edu.zhengjiaxin;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
//3
public class ChangeSizePic extends Admin_Login{
	@DataProvider(name="change")
	public  Object[][] changesize() throws IOException{
		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\chanzhieps.xlsx","change");
		 return user;
	}

    @Test(dataProvider ="change",description="数据驱动批量添加缩略图大小")
   public void change0(String smallw,String smallh,String middlew,String middleh,String bigw,String bigh) {
    webtest.click("link=设计");
    webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
    webtest.click("link=缩略图设置");
//	webtest.click("xpath=//*[@id=\"mainPanel\"]/div[1]/ul/li[2]/a");
	webtest.type("xpath=//*[@id=\"thumbs[s][width]\"]",smallw);
	webtest.typeAndClear("xpath=//*[@id=\"thumbs[s][width]\"]",smallw);
	webtest.type("xpath=//*[@id=\"thumbs[s][height]\"]",smallh);
	webtest.typeAndClear("xpath=//*[@id=\"thumbs[s][height]\"]",smallh);
	webtest.type("xpath=//*[@id=\"thumbs[m][width]\"]",middlew);
	webtest.typeAndClear("xpath=//*[@id=\"thumbs[m][width]\"]",middlew);
	webtest.type("xpath=//*[@id=\"thumbs[m][height]\"]",middleh);
	webtest.typeAndClear("xpath=//*[@id=\"thumbs[m][height]\"]",middleh);
	webtest.type("xpath=//*[@id=\"thumbs[l][width]\"]",bigw);
	webtest.typeAndClear("xpath=//*[@id=\"thumbs[l][width]\"]",bigw);
	webtest.type("xpath=//*[@id=\"thumbs[l][height]\"]",bigh);
	webtest.typeAndClear("xpath=//*[@id=\"thumbs[l][height]\"]",bigh);
	webtest.click("xpath=//*[@id=\"submit\"]");
	assertTrue(webtest.isTextPresent("设置成功"));
}

}