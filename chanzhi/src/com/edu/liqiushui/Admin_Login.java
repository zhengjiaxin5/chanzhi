package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.*;
public class Admin_Login extends BaseTest {
	
	public void testLogin() {
		//打开页面
		webtest.open("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
		//文本框输入
		webtest.type("name=account","admin");
		webtest.type("name=password","123456");
		webtest.click("xpath=//input[@type='submit']");
	}

}
