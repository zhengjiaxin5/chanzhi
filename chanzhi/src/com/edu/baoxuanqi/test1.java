package com.webtest.demo;

import org.testng.annotations.Test;

public class test1 extends Admin_Login{
	@Test//Ȩ������
	public void demo1() {
		webtest.open("http://127.0.0.1/chanzhieps/www/admin.php");
		webtest.click("xpath=/html/body/div/div/table/thead/tr/th[2]/div/a");
		
		
		webtest.click("xpath=/html/body/div/div/table/tbody/tr[1]/td[4]/a[1]");
		webtest.type("xpath=//*[@id=\"link\"]","www.baidu.com");
		webtest.click("xpath=//*[@id=\"submit\"]");
		
		webtest.click("xpath=/html/body/div[1]/div/table/tbody/tr[1]/td[4]/a[2]");
	}
}
