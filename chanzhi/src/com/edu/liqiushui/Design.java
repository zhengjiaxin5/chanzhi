package com.edu.liqiushui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;




public class Design extends BaseTest{
	

	//1、登陆
	@Test(priority = 1)
	public void test1(){
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver webtest = new FirefoxDriver();
		webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php/");
		webtest.findElement(By.name("account")).sendKeys("admin");		
		webtest.findElement(By.name("password")).sendKeys("123456");
		//webtest.click("name=submit");
		webtest.findElement(By.xpath("//input[@9id=\"submit\"]")).click();
		
	}
	//2、在设计-主题中切换成一个主题1
	@Test(priority = 2)
	public void test2(){
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver webtest = new FirefoxDriver();
		webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
		webtest.findElement(By.name("account")).sendKeys("admin");		
		webtest.findElement(By.name("password")).sendKeys("123456");
		webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
		webtest.findElement(By.xpath("//a[text()='设计']")).click();
		webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[1]/div/a/img")).click();
		
	}
	//3、在设计-主题中切换成一个主题2
		@Test(priority = 2)
		public void test3(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='设计']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[2]/div/a/img")).click();
			
		}
		//4、在设计-主题中切换成一个主题3
		@Test(priority = 2)
		public void test4(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='设计']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[3]/div/a/img")).click();
			
		}
		//5、在设计-主题中切换成空白主题
		@Test(priority = 2)
		public void test5(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='设计']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img")).click();
	
		}
		/*
		//6、在设计-主题-自定义主题中添加一个区块
		@Test(priority = 2)
		public void test6(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='设计']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/div[2]/a")).click();
			
	
		}
		*/
		//7、可视化编辑中改变轮播图顺序
		@Test(priority = 0)
		public void test7(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='设计']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/div[2]/a")).click();//进入自定义
			webtest.findElement(By.xpath("/html/body/div/div/div[2]/div/a[1]")).click();//进入可视化编辑
			webtest.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div[2]/a[4]")).click();//使播放顺序延后
			
		}
	
		
	
	
	
	
//		//2、跳转至设计模块
//		webtest.findElement(By.xpath("//a[text()='设计']")).click();
//		//3、跳转至设计-区块
//		webtest.findElement(By.xpath("//a[text()='区块']")).click();
//		//4、点击设计-导航
//		webtest.findElement(By.xpath("//a[text()='导航']")).click();
//		//5、点击设计-主题
//		webtest.findElement(By.xpath("//a[text()='主题']")).click();
//		
		
		



				
		
	}
		
