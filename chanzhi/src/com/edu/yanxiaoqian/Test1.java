package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test1 extends BaseTest{
	@Test
	public void testBz() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[9]/a");
		webtest.click("xpath=//*[@id=\"backupBtn\"]");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button");
		webtest.click("xpath=/html/body/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/a[1]");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		webtest.click("xpath=/html/body/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/a[3]");
		webtest.type("xpath=//*[@id=\"note\"]", "11111");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=/html/body/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/a[4]");
		webtest.click("xpath=/html/body/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/a[2]");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		
	}

}
