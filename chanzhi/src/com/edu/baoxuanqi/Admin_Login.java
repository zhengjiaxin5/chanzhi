package com.edu.baoxuanqi;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Admin_Login  extends BaseTest{
	
	@Test
	public void testLogin() {
		//    ҳ  
		webtest.open("http://127.0.0.1/chanzhieps/www/admin.php");
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
	}

}


