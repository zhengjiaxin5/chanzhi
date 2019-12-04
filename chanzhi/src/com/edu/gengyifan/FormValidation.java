package com.edu.gengyifan;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class FormValidation extends BaseTest{
	@Test
	public void testFormValidation() {
		webtest.backgroundLogin("137554616","fcschalke04");
		webtest.click("xpath=//*[@id=\"captcha1\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");	
		//进入前台界面
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//断言
		assertEquals(webtest.isDisplayed("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]",true),"ture");
	}
}
