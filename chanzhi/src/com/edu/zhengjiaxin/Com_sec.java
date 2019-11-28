package com.edu.zhengjiaxin;


import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class Com_sec extends Admin_Login{

	@Test(description="获取特效")
	public void lun() throws InterruptedException {
		
		webtest.get("http://127.0.0.1:8011/chanzhieps/www/admin.php?m=ui&f=component");
		webtest.findElement(By.xpath("/html/body/div/div[1]/div/ul/li[2]/a")).click();
		webtest.findElement(By.xpath("/html/body/div/div[2]/div/a")).click();
		webtest.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[1]/a/img")).click();
		webtest.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/a[1]")).click();
		Thread.sleep(2000);
		
	}	
}

