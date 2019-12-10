package com.edu.gengyifan;

import static org.testng.Assert.assertFalse;

import java.io.IOException;
import java.net.UnknownHostException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.utils.ReadProperties;

public class WhiteListAccountRegistered extends BaseTest{
	@DataProvider(name="WhiteListAccountRegistered")
	public Object[][] dataToTest() throws IOException{
		Object[][] register = new ExcelDataProvider().getTestDataByExcel("C:\\ruanjian\\jenkins\\workspace\\chanzhi3\\chanzhi\\data\\AddBlackListAccountRegisteredData.xlsx", "sheet1");
		return register;
	}
	@Test(dataProvider="WhiteListAccountRegistered",priority=1,description="白名单-账号-注册测试1")
	public void testWhiteListAccountRegistered(String username,String realname,String email,String password,String password0) throws IOException {
		webtest.addWhiteListIP();
		webtest.addWhiteListAccount();
		ReadProperties u = new ReadProperties();
		String url = u.getPropertyValue("front_url");
		webtest.open("url");
		webtest.click("id=register");
		webtest.type("id=account", username);
		webtest.type("id=realname", realname);
		webtest.type("id=email", email);
		webtest.type("id=password1", password);
		webtest.type("id=password2", password0);
		webtest.click("id=submit");
	}
	@Test(priority=2,description="白名单-账号-注册测试2")
	public void testAfterWhiteListAccountRegistered() throws IOException {
		webtest.backgroundLogin("admin", "admin");
		assertFalse(webtest.isTextPresent("系统检测到您的行为存在异常"));
	}
}
