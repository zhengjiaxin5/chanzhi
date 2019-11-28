package com.edu.zhengjiaxin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;


public class Component extends Admin_Login{

	@Test(description="轮播图片编辑")
	public void editPi() throws InterruptedException {	
		webtest.get("http://127.0.0.1:8011/chanzhieps/www/admin.php?m=ui&f=component");
		webtest.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/section/div[1]/a/div/div/div[1]")).click();
		webtest.findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[1]/td[2]/a[3]/i")).click();
		webtest.findElement(By.name("title")).sendKeys("");
		webtest.findElement(By.name("title")).sendKeys("蝉知，真开源真免费!编辑");
		webtest.findElement(By.name("mainLink")).sendKeys("http://127.0.0.1:8011/chanzhieps/www/pic");
		webtest.findElement(By.name("title")).sendKeys("");
		webtest.findElement(By.xpath("//input[@id=\"backgroundType2\"]")).click();
		webtest.findElement(By.name("label[0]")).sendKeys("");
		webtest.findElement(By.name("title")).sendKeys("");
		webtest.findElement(By.name("title")).sendKeys("");
		webtest.switchTo().frame(0);
		webtest.findElement(By.tagName("body")).click();
		webtest.findElement(By.tagName("body")).sendKeys("电影不错");
		webtest.switchTo().defaultContent();
		webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
	
	}	
}

