package com.webtest.demo;

import org.testng.annotations.Test;

public class demo4 extends Admin_Login{
@Test//所有链接编辑
public void test6() {
	webtest.click("link=推广");
	webtest.click("link=友情链接");
	
	webtest.enterFrame(1);
	webtest.click("tag=body");
	webtest.type("tag=body","111");
	webtest.leaveFrame();
	webtest.click("xpath=//*[@id=\"submit\"]");
}
@Test//首页链接编辑
public void test16() {
webtest.click("link=推广");
	webtest.click("link=友情链接");
	webtest.enterFrame(0);
	webtest.click("tag=body");
	webtest.type("tag=body","添加的网站叫蝉知");
	webtest.leaveFrame();
	webtest.click("xpath=//*[@id=\"submit\"]");
}
@Test//首页链接中返回上一步操作
public void test17() {
	webtest.click("link=推广");
	webtest.click("link=友情链接");
	webtest.enterFrame(0);
	webtest.click("xpath=//*[@id=\"ajaxForm\"]/table/tbody/tr[1]/td/div/div[1]/span[8]/span");
	//webtest.click("xpath=//*[@id=\"submit\"]");
}
	

}
