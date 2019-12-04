package com.edu.zhengjiaxin;


import org.testng.annotations.Test;


public class LogoUpload extends Admin_Login{
//1
	@Test(description="上传logo")
	public void up() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=组件");
		webtest.type("id=logo","D:\\demo\\1.jpg");
		webtest.pause(2000);
	}
	@Test(description="删除logo")
	public void down() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=组件");
		webtest.type("id=logo","D:\\demo\\1.jpg");
		webtest.pause(1000);
		webtest.click("xpath=//*[@id=\"logoForm\"]/div[1]/div/span/a[2]/i");
		webtest.pause(1000);
	}
}
