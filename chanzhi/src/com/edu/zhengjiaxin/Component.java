package com.edu.zhengjiaxin;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;


public class Component extends Admin_Login{
//1
	@Test(description="轮播图片编辑")
	public void editPi() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("link=组件");
		webtest.click("xpath=//*[@id=\"slide\"]/div/div[2]/section/div[1]/a/div/div/div[1]");
		webtest.click("xpath=//*[@id=\"sortForm\"]/table/tbody/tr[1]/td[2]/a[3]");
		webtest.type("xpath=//*[@id=\"title\"]","admin");
		//webtest.typeAndClear("xpath=//*[@id=\"title\"]",admin);
		webtest.type("name=mainLink", "http://127.0.0.1:8011/chanzhieps/www/pic");
		webtest.click("//input[@id=\"backgroundType2\"]");
		webtest.type("name=label[0]", "");
		webtest.type("name=title", "");
		webtest.type("name=title", "");
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body","不错不错");
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		

	}	
}


