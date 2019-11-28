package com.edu.zhengjiaxin;


import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class PicManage extends Admin_Login{

	@Test(description="设置图片水印关闭")
	public void pic() throws InterruptedException {
		
		webtest.get("http://127.0.0.1:8011/chanzhieps/www/admin.php?m=ui&f=others");
		webtest.findElement(By.xpath("/html/body/div/form/div/div[1]/ul/li[4]/a")).click();
		webtest.findElement(By.xpath("//*[@id=\"files[watermark]2\"]")).click();
		webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
		Thread.sleep(1500);
		
	}
	@Test(description="设置图片水印开启")
	public void pic1() throws InterruptedException {
		
		webtest.get("http://127.0.0.1:8011/chanzhieps/www/admin.php?m=ui&f=others");
		webtest.findElement(By.xpath("/html/body/div/form/div/div[1]/ul/li[4]/a")).click();
		webtest.findElement(By.xpath("//*[@id=\"files[watermark]1\"]")).click();
		webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();

		
	}
}
