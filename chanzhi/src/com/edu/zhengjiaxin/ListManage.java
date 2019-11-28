package com.edu.zhengjiaxin;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ListManage extends Admin_Login{
	@Test(description="显示设置",priority = 10)
	public void list0() throws InterruptedException {
		webtest.get("http://127.0.0.1:8011/chanzhieps/www/admin.php?m=ui&f=others");
		webtest.findElement(By.xpath("/html/body/div/form/div/div[1]/ul/li[2]/a")).click();
		webtest.findElement(By.xpath("//*[@id=\"articleRec\"]")).sendKeys("55");//*[@id="submit"]
		webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();//*[@id="submit"]
		Thread.sleep(3000);
	}
}
