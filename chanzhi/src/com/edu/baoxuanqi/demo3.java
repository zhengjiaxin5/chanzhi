package com.edu.baoxuanqi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;

public class demo3 extends Admin_Login {

	@DataProvider(name = "con1")
	public static Object[][] words1() throws Exception {
		ExcelDataProvider d = new ExcelDataProvider();
		return d.getTestDataByExcel("E:\\exc1.xlsx", "Sheet1");
	}

	@Test(dataProvider = "con1",description="确认收货时期和订单过期时间")
	public void test19(String param1,String param2) throws Exception {
		Thread.sleep(3000);
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		Thread.sleep(3000);
		webtest.type("id=confirmLimit", param1);
		webtest.type("id=expireLimit",param2);
		Thread.sleep(3000);
		webtest.click("id=submit");
	}
	@Test(description="填写支付宝参数")
	public void test32() {
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.type("id=pid", "2088567891011121314");
		webtest.type("name=key", "baoxuanqi12345678909876543212345");
		webtest.type("name=email","1686977186@qq.com");
		webtest.click("id=submit");
	}
	@Test(description="商城设置更改货币")
	public void test33() {
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("id=currency_chosen");
		webtest.click("xpath=/html/body/div/div[2]/div/div[2]/form/table/tbody/tr[1]/td[1]/div/div/ul/li[2]");
		webtest.click("id=stock2");
		webtest.click("id=submit");
	}
	@Test(description="填写微信支付参数")
	public void test34() {
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("id=payment1");
		webtest.click("id=payment4");
		webtest.type("id=wechat[appid]", "bao");
		webtest.type("id=wechat[mch_id]", "123");
		webtest.type("id=wechat[apikey]","123456");
		webtest.type("id=wechat[appsecret]","123456789");
		webtest.click("id=submit");
		
	}
	@Test(description="填写微信或支付宝支付参数")
	public void test35() {
		webtest.click("link=商城");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("id=payment4");
		webtest.type("id=pid", "2088567891011121314");
		webtest.type("name=key", "baoxuanqi12345678909876543212345");
		webtest.type("name=email","1686977186@qq.com");
		webtest.type("id=wechat[appid]", "bao");
		webtest.type("id=wechat[mch_id]", "123");
		webtest.type("id=wechat[apikey]","123456");
		webtest.type("id=wechat[appsecret]","123456789");
		webtest.click("id=submit");
	}
	
}