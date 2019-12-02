package com.edu.zhengjiaxin;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;


public class PicManage extends Admin_Login{
	//11
	@Test(description="设置图片水印关闭")
	public void pic() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=图片水印");
		webtest.click("xpath=//*[@id=\"files[watermark]2\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");	
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	
	@DataProvider(name="watermark")
	public  Object[][] getWatermark() throws IOException{
		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("D:\\demo\\data\\chanzhieps.xlsx","watermark");
		 return user;
	}
	@Test(dataProvider ="watermark",description="设置图片水印开启数据驱动")
	public void pic2(String watermarkContent,String watermarkOpacity,String watermarkSize){
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=图片水印");
		webtest.click("xpath=//*[@id=\"files[watermark]1\"]");	
		webtest.type("xpath=//*[@id=\"files[watermarkContent]\"]",watermarkContent);
		webtest.typeAndClear("xpath=//*[@id=\"files[watermarkContent]\"]",watermarkContent);	
		webtest.type("xpath=//*[@id=\"files[watermarkOpacity]\"]",watermarkOpacity);
		webtest.typeAndClear("xpath=//*[@id=\"files[watermarkOpacity]\"]",watermarkOpacity);	
		webtest.type("xpath=//*[@id=\"files[watermarkSize]\"]",watermarkSize);
		webtest.typeAndClear("xpath=//*[@id=\"files[watermarkSize]\"]",watermarkSize);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));

	}
}
