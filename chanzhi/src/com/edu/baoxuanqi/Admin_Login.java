package com.edu.baoxuanqi;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class Admin_Login extends BaseTest {


	@Test(description="后台登录",priority = 0)
	public void testLogin() throws IOException {
		ReadProperties u=new ReadProperties();
		String url=u.getPropertyValue("base_url");
		webtest.open(url);
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");

	
		}
}




