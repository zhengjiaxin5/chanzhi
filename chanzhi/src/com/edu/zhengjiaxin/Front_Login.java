package com.edu.zhengjiaxin;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class Front_Login extends BaseTest {
	@Test(description="前台登录")
	public void FrontLogin() throws IOException {
		webtest.open("http://127.0.0.1:8011/chanzhieps/www/index.php/user-login.html");
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
	
		}
}
