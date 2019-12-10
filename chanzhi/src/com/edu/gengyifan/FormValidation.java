package com.edu.gengyifan;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class FormValidation extends BaseTest{
	@Test(description="验证码功能测试")
	public void testFormValidation() throws IOException {
		webtest.backgroundLogin("137554616","fcschalke04");
		webtest.click("xpath=//*[@id=\"captcha1\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");	
		//进入前台界面
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//断言
		assertEquals(webtest.isDisplayed("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]",true),"ture");
	}
}
