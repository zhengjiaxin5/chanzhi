package com.edu.zhengjiaxin;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ListOption extends Admin_Login{
	//10
	@Test (description="列表博客列表类目设置")
	public void ListOP() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.click("xpath=//*[@id=\"browseTab\"]/table/tbody/tr[9]/td[1]/label[1]");
		webtest.click("id=blog");
		webtest.click("xpath=//*[@id=\"blog\"]/option[2]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));

	}
	@Test (description="列表博客列表类目级别设置")
	public void Listde() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.click("xpath=//*[@id=\"browseTab\"]/table/tbody/tr[9]/td[1]/label[1]");
		webtest.click("name=blog[categoryLevel]");
		webtest.click("xpath=/html/body/div/form/div/div[2]/div[1]/div[2]/table/tbody/tr[10]/td[1]/div/select[2]/option[2]");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	
	

	
	@Test (description="列表博客列表图片位置")
	public void Listpic() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.selectByIndex("name=blog[imagePosition]",1);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));

	}
	@Test (description="列表博客列表图片大小")
	public void Listpic1() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.selectByIndex("name=blog[imageSize]",1);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	
	
	
	@Test (description="列表文章列表图片位置")
	public void Listart() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.selectByIndex("name=article[imagePosition]",0);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test (description="列表文章列表图片大小")
	public void Listart1() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.selectByIndex("name=article[imageSize]",0);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test (description="列表产品视图模式")
	public void Listpro() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.selectByIndex("name=product[browseType]",0);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test (description="列表产品点击量")
	public void Listpro1() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.selectByIndex("name=product[showViews]",0);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test (description="列表价格显示")
	public void Listpro2() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.selectByIndex("name=product[showPrice]",0);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	@Test (description="列表产品名称位置")//只有在点击量不显示时才能设置
	public void Listpro3() throws InterruptedException {	
		webtest.click("link=设计");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[6]/ul/li[6]/a");
		webtest.click("link=列表设置");
		webtest.selectByIndex("name=product[showViews]",1);
		webtest.selectByIndex("name=product[namePosition]",1);
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("设置成功"));
		
	}
	
}
