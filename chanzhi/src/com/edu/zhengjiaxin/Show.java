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

public class Show extends Admin_Login{
//8
	@Test(description="显示设置1")
	public void show0() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode1\"]");
		webtest.click("xpath=//*[@id=\"execInfo1\"]");
		webtest.click("xpath=//*[@id=\"mobileBottomNav1\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	
	
	@Test(description="显示设置2",priority = 1)
	public void show1() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode1\"]");
		webtest.click("xpath=//*[@id=\"execInfo2\"]");
		webtest.click("xpath=//*[@id=\"mobileBottomNav1\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="显示设置3",priority = 2)
	public void show2() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode1\"]");
		webtest.click("xpath=//*[@id=\"execInfo1\"]");
		webtest.click("xpath=//*[@id=\"mobileBottomNav2\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="显示设置4",priority = 3)
	public void show3() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode2\"]");
		webtest.click("xpath=//*[@id=\"execInfo1\"]");
		webtest.click("xpath=//*[@id=\"mobileBottomNav1\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="显示设置5",priority = 4)
	public void show4() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode1\"]");
		webtest.click("xpath=//*[@id=\"execInfo2\"]");
		webtest.click("xpath=//*[@id=\"mobileBottomNav2\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="显示设置6",priority = 5)
	public void show5() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode2\"]");
		webtest.click("xpath=//*[@id=\"execInfo1\"]");
		webtest.click("xpath=//*[@id=\"mobileBottomNav2\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="显示设置7",priority = 6)
	public void show6() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode2\"]");
		webtest.click("xpath=//*[@id=\"execInfo2\"]");
		webtest.click("xpath=//*[@id=\"mobileBottomNav1\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="显示设置8",priority = 7)
	public void show7() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode2\"]");
		webtest.click("xpath=//*[@id=\"execInfo2\"]");
		webtest.click("xpath=//*[@id=\"mobileBottomNav2\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	@Test(description="显示设置9",priority = 8)
	public void show8() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("xpath=//*[@id=\"QRCode2\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
	}
	

}