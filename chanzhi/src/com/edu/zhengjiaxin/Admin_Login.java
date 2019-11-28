package com.edu.zhengjiaxin;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class Admin_Login extends BaseTest{
	//extends BaseTest
	//public  WebDriverEngine webtest;
	//WebDriver webtest = null;
//	@BeforeClass
//	public void bc() throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","D:\\ruanjian\\geckodriver.exe");
//		webtest=new WebDriverEngine();
//	}
//	@AfterClass
//	public void ac() throws InterruptedException {
//		Thread.sleep(3000);
//		webtest.quit();
//	}

//	@Test(description="后台登录")
//	public void loginSuccess() throws InterruptedException {
//		
//		webtest.get("http://127.0.0.1:8011/chanzhieps/www/admin.php/");
//		Thread.sleep(2000);
//		webtest.findElement(By.name("account")).sendKeys("admin");
//		webtest.findElement(By.name("password")).sendKeys("admin");
//		webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();//*[@id="submit"]
//	}	
	@Test(description="后台登录")
	public void testLogin() {
		
		webtest.open("http://127.0.0.1:8011/chanzhieps/www/admin.php");
		//�ı�������
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
		//assertTrue(webtest.isTextPresent("�Զ���"));
	}
	
}