package com.edu.baoxuanqi;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;



public class demo6 extends Admin_Login{
	@Test(description="熊掌号批量提交")
public void test7() {
	webtest.click("link=推广");
	webtest.click("link=熊掌号");
	webtest.click("link=批量提交");
	webtest.click("link=批量提交资源");
}
	@Test(description="熊掌号日志")
public void test8() {
	webtest.click("link=推广");
	webtest.click("link=熊掌号");
	webtest.click("link=日志");
	webtest.click("link=最近一周");
	
}
	@Test(description="熊掌号日志")
public void test9() {
	webtest.click("link=推广");
	webtest.click("link=熊掌号");
	webtest.click("link=日志");
	webtest.click("name=end");
	webtest.click("xpath=/html/body/div[3]/div[3]/table/tbody/tr[2]/td[4]");
	webtest.click("link=搜索");
}
	@Test(description="熊掌号日志")
public void test10() {
	webtest.click("link=推广");
	webtest.click("link=熊掌号");
	webtest.click("link=日志");
	webtest.click("link=最近30天");
	webtest.click("xpath=/html/body/div[1]/div[2]/div/table/tbody/tr[21]/td/div/a[1]");
}



}

