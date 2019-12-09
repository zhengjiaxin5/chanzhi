package com.edu.gengyifan;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class BindingMail extends BaseTest{
	@Test
	public void testBinDingMail() {
		webtest.frontLogin("demo","demo");
		webtest.click("xpath=//*[@id=\"checkEmail1\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");	
		webtest.frontLogin("demo","demo");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/header/div[1]/div/nav/a[1]");//点击用户
		//断言
		assertEquals(webtest.isDisplayed("xpath=//*[@id=\"checkEmail\"]",true),"ture");
	}
}
