package com.webtest.chanzhiepsProject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.UnknownHostException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class AddBlackListAccountRegistered extends BaseTest{
	@DataProvider(name="AddBlackListAccountRegistered")
	public Object[][] dataToTest() throws IOException{
		Object[][] register = new ExcelDataProvider().getTestDataByExcel("E:\\software\\AddBlackListAccountRegisteredData.xlsx", "sheet1");
		return register;
	}
	@Test(dataProvider="AddBlackListAccountRegistered",priority=1)
	public void testAddBlackListAccountRegistered(String username,String realname,String email,String password,String password0) throws UnknownHostException {
		webtest.addWhiteListIP();
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		webtest.click("id=register");
		webtest.type("id=account", username);
		webtest.type("id=realname", realname);
		webtest.type("id=email", email);
		webtest.type("id=password1", password);
		webtest.type("id=password2", password0);
		webtest.click("id=submit");
	}
	@Test(priority=2)
	public void testAfterAddBlackListAccountRegistered() {
		webtest.backgroundLogin("137554616", "fcschalke04");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//╤оят
		assertTrue(webtest.isTextPresent("demo"));
	}
}
