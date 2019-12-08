package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.UnknownHostException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class AddBlackListIPRegistered extends BaseTest{
	@DataProvider(name="AddBlackListIPRegistered")
	public Object[][] dataToTest() throws IOException{
		Object[][] register = new ExcelDataProvider().getTestDataByExcel("E:\\software\\AddBlackListAccountRegisteredData.xlsx", "sheet1");
		return register;
	}
	@Test(dataProvider="AddBlackListIPRegistered",priority=1)
	public void testAddBlackListIPRegistered(String username,String realname,String email,String password,String password0) throws UnknownHostException {
		webtest.addWhiteListAccount();
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
	public void testAfterAddBlackListIPRegistered() {
		webtest.backgroundLogin("137554616", "fcschalke04");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[3]/a");
		//断言
		assertTrue(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
