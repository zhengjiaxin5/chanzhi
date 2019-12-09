package com.edu.baoxuanqi;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;



public class demo4 extends Admin_Login{
	@Test(description="所有链接编辑")
public void test6() {
	webtest.click("link=推广");
	webtest.click("link=友情链接");
	webtest.enterFrame(1);
	webtest.click("tag=body");
	webtest.type("tag=body","111");
	webtest.leaveFrame();
	webtest.click("xpath=//*[@id=\"submit\"]");
}
	@Test(description="首页链接编辑")
public void test16() {
webtest.click("link=推广");
	webtest.click("link=友情链接");
	webtest.enterFrame(0);
	webtest.click("tag=body");
	webtest.type("tag=body","添加的网站叫蝉知");
	webtest.leaveFrame();
	webtest.click("xpath=//*[@id=\"submit\"]");
}
	


}