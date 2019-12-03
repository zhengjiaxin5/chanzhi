package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class Front_Login_Test extends BaseTest{

	@Test(description="前台登录")
	public void frontLogin() throws IOException {
		ReadProperties q=new ReadProperties();
		String f_url=q.getPropertyValue("front_url");
		webtest.open(f_url);
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
		

	
		}

}
