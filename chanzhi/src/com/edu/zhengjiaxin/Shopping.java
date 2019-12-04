package com.edu.zhengjiaxin;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Shopping extends Front_Login{
//1	
	@Test(description="前台购物流程")
	public void editPic() throws InterruptedException {
		webtest.click("link=产品列表");
		webtest.click("xpath=//*[@id=\"listMode\"]/table/tbody/tr[3]/td[4]/a");
		webtest.click("xpath=//*[@id=\"buyBtnBox\"]/label[1]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("保存成功"));

}
}
