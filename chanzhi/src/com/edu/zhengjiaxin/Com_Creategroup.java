package com.edu.zhengjiaxin;


import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class Com_Creategroup extends Admin_Login{

//1
	@Test(description="添加轮播图片编辑")
	public void editPic() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=组件");
		webtest.click("xpath=/html/body/div/div[3]/div/div[2]/section/div[2]/a/div/div/i");
		webtest.type("xpath=//*[@id=\"name\"]","admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
		
		

	}	
}
