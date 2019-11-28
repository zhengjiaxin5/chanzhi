package com.edu.zhengjiaxin;


import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class Com_Creategroup extends Admin_Login{


	@Test(description="添加轮播图片编辑")
	public void editPic() throws InterruptedException {
		webtest.get("http://127.0.0.1:8011/chanzhieps/www/admin.php?m=ui&f=component");
		webtest.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/section/div[2]/a/div/div/i")).click();
		webtest.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("admin");
		webtest.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
	
	}	
}
