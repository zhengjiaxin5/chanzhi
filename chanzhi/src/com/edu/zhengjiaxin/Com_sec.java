package com.edu.zhengjiaxin;


import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class Com_sec extends Admin_Login{
//1
	@Test(description="获取特效")
	public void lun() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=组件");
		webtest.click("link=特效");
		webtest.click("xpath=/html/body/div/div[2]/div/a");
		webtest.click("xpath=//*[@id=\"effect5\"]/a/img");
		webtest.click("xpath=//*[@id=\"columns\"]/div/div[1]/div[1]/div/a[1]");

	}	
}



