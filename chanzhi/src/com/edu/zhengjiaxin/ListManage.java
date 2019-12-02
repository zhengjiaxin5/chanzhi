package com.edu.zhengjiaxin;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;

public class ListManage extends Admin_Login{
	//7
	@Test(description="列表设置")
	@DataProvider(name="listm")
	public  Object[][] getchanzhiepsData() throws IOException{
		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("D:\\demo\\data\\listm.xlsx","listm");
		 return user;
	}

    @Test(dataProvider ="listm",description="数据驱动批量添加")
   public void list0(String articleRec,String productRec,String blogRec,String bookRec,String messageRec,String commentRec,String forumRec,String replyRec) {
    webtest.click("link=设计");
    webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
    webtest.click("link=列表设置");
	webtest.click("xpath=//*[@id=\"mainPanel\"]/div[1]/ul/li[2]/a");
	webtest.type("xpath=//*[@id=\"articleRec\"]",articleRec);
	webtest.typeAndClear("xpath=//*[@id=\"articleRec\"]",articleRec);
	webtest.type("xpath=//*[@id=\"productRec\"]",productRec);
	webtest.typeAndClear("xpath=//*[@id=\"productRec\"]",productRec);
	webtest.type("xpath=//*[@id=\"blogRec\"]",blogRec);
	webtest.typeAndClear("xpath=//*[@id=\"blogRec\"]",blogRec);
	webtest.type("xpath=//*[@id=\"bookRec\"]",bookRec);
	webtest.typeAndClear("xpath=//*[@id=\"bookRec\"]",bookRec);
	webtest.type("xpath=//*[@id=\"messageRec\"]",messageRec);
	webtest.typeAndClear("xpath=//*[@id=\"messageRec\"]",messageRec);
	webtest.type("xpath=//*[@id=\"commentRec\"]",commentRec);
	webtest.typeAndClear("xpath=//*[@id=\"commentRec\"]",commentRec);
	webtest.type("xpath=//*[@id=\"forumRec\"]",forumRec);
	webtest.typeAndClear("xpath=//*[@id=\"forumRec\"]",forumRec);
	webtest.type("xpath=//*[@id=\"replyRec\"]",replyRec);
	webtest.typeAndClear("xpath=//*[@id=\"replyRec\"]",replyRec);
	webtest.click("xpath=//*[@id=\"submit\"]");
	assertTrue(webtest.isTextPresent("设置成功"));
}

}