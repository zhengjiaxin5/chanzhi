package com.edu.liqiushui;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.demo.Admin_Login;

public class Code extends Admin_Login1{
	//添加html、css、javascript代码
	@Test(priority = 1,description="区块自定义中添加一个区块")
	public void test9() throws InterruptedException {
		webtest.click("link=设计");
		webtest.click("link=区块");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//添加
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//出现下拉框
		webtest.click("link=html源代码");//选择html选项
		webtest.type("id=title", "第一个");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType("给我写进去啊！");
		Thread.sleep(5000);

		
		//写css代码
		
		webtest.click("link=CSS");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType("给我写进去啊！");
		Thread.sleep(5000);
		
		//写javascript
		webtest.click("link=Javascript");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType("给我写进去啊！");




		webtest.click("link=保存");



		
		

	}
}