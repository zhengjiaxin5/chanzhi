package com.edu.zhengjiaxin;


import org.testng.annotations.Test;


public class LogoUpload extends Admin_Login{
//1
	@Test(description="删除logo")
	public void up() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=组件");
		webtest.click("xpath=//*[@id=\"logoForm\"]/div[1]/div/span/a[2]/i");
		//Thread.sleep(2000);
		//webtest.type("xpath=//*[@id=\"logoForm\"]/div[1]/div/div[1]/a","D:\\demo\\1.jpg");
		//webtest.typeAndClear("xpath=//*[@id=\"files[watermarkSize]\"]",watermarkSize);
		//webtest.click("xpath=//*[@id=\"submit\"]");
		//driver.findElement(By.id(s1)).sendKeys("E:\\test1.jpg");
		
		//*[@id="logoForm"]/div[1]/div/span/a[2]/i
	}
}
