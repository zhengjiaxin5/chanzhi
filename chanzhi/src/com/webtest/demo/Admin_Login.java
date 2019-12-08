package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class Admin_Login  extends BaseTest{
	
	

	@Test(description="µÇÂ¼")
	public void testLogin() throws IOException {
		ReadProperties u=new ReadProperties();
		String url=u.getPropertyValue("base_url");
		webtest.open(url);
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
		

	
		}
//	@Test
//	public void testLogin() {
//		//ï¿½ï¿½Ò³ï¿½ï¿½
//		webtest.open("http://localhost:8032/mymovie/admin.php/");
//		//ï¿½Ä±ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
//		webtest.type("name=username", "admin");
//		webtest.type("name=password", "admin");
//		webtest.click("xpath=//input[@type='submit']");
//		
//		
//	}

}
