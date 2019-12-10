package com.edu.gengyifan;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class FormValidation extends BaseTest{
	@Test(description="验证码功能测试")
	public void testFormValidation() throws IOException {
		webtest.backgroundLogin("admin","admin");
		webtest.click("xpath=//*[@id=\"captcha1\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");	
		//进入前台界面
		ReadProperties u = new ReadProperties();
		String url = u.getPropertyValue("front_url");
		webtest.open("url");
		//断言
		assertEquals(webtest.isDisplayed("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]",true),"ture");
	}
}
