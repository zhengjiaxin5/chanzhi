package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class ProductCategory  extends Admin_Login{
	
	@Test(description="添加产品分类类区块第一种选择")
	public void Product111() {
		webtest.click("link=设计");
		webtest.click("link=区块");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=产品分类");
		webtest.typeAndClear("id=title","第1个");
		webtest.click("id=params[showChildren]1");
		webtest.click("id=params[initialExpand]1");
		webtest.click("id=params[fromCurrent]1");
		webtest.click("id=submit");
	}
	@Test(description="添加产品分类类区块第二种选择")
	public void Product112() {
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=产品分类");
		webtest.typeAndClear("id=title","第2个");
		webtest.click("id=params[showChildren]1");
		webtest.click("id=params[initialExpand]1");
		webtest.click("id=params[fromCurrent]2");
		webtest.click("id=submit");
	}
	@Test(description="添加产品分类类区块第三种选择")
	public void Product121() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=产品分类");
		webtest.typeAndClear("id=title","第3个");
		webtest.click("id=params[showChildren]1");
		webtest.click("id=params[initialExpand]2");
		webtest.click("id=params[fromCurrent]1");
		webtest.click("id=submit");
	}
	@Test(description="添加产品分类类区块第四种选择")
	public void Product122() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=产品分类");
		webtest.typeAndClear("id=title","第4个");
		webtest.click("id=params[showChildren]1");
		webtest.click("id=params[initialExpand]2");
		webtest.click("id=params[fromCurrent]2");
		webtest.click("id=submit");
	}
	@Test(description="添加产品分类类区块第五种选择")
	public void Product211() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=产品分类");
		webtest.typeAndClear("id=title","第5个");
		webtest.click("id=params[showChildren]2");
		webtest.click("id=params[initialExpand]1");
		webtest.click("id=params[fromCurrent]1");
		webtest.click("id=submit");
	}
	@Test(description="添加产品分类类区块第六种选择")
	public void Product212() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=产品分类");
		webtest.typeAndClear("id=title","第6个");
		webtest.click("id=params[showChildren]2");
		webtest.click("id=params[initialExpand]1");
		webtest.click("id=params[fromCurrent]2");
		webtest.click("id=submit");
	}
	@Test(description="添加产品分类类区块第七种选择")
	public void Product221() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=产品分类");
		webtest.typeAndClear("id=title","第7个");
		webtest.click("id=params[showChildren]2");
		webtest.click("id=params[initialExpand]2");
		webtest.click("id=params[fromCurrent]1");
		webtest.click("id=submit");
	}
	@Test(description="添加产品分类类区块第八种选择")
	public void Product222s() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=产品分类");
		webtest.typeAndClear("id=title","第8个");
		webtest.click("id=params[showChildren]2");
		webtest.click("id=params[initialExpand]2");
		webtest.click("id=params[fromCurrent]2");
		webtest.click("id=submit");
	}

		

}



