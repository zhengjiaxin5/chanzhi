package com.webtest.core;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.webtest.utils.Log;
/**
 * author:lihuanzhen
 
 */
public class WebDriverEngine {

	WebDriver driver = null;
	ElementFinder finder = null;
	Actions action  =null;
	
	public void addWhiteListIP() throws UnknownHostException {
		backgroundLogin("137554616","fcschalke04");
		click("xpath=/html/body/div[1]/div[1]/div/ul/li[4]/a");
		type("id=ip", InetAddress.getLocalHost().getHostAddress().toString());
		type("id=password", "fcschalke04");
		click("id=submit");
	}
	
	public void addWhiteListAccount() {
		backgroundLogin("137554616","fcschalke04");
		click("xpath=/html/body/div[1]/div[1]/div/ul/li[4]/a");
		type("id=account", "demo");
		type("id=password", "fcschalke04");
		click("id=submit");
	}

	public void frontLogin(String account,String password) {
		open("http://localhost/chanzhieps/www/index.php/user-login.html");
		type("id=account", account);
		type("id=password", password);
		click("id=submit");
	}
	
	public void backgroundLogin(String account,String password) {
		open("http://localhost/chanzhieps/www/admin.php?m=admin&f=index");
		type("xpath=//*[@id=\"account\"]", account);
		type("xpath=//*[@id=\"password\"]", password);
		click("id=submit");

		click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		click("xpath=//html/body/nav[2]/div[2]/ul[1]/li[4]/a");
	}
	
	public void testCloseSafety() {
		backgroundLogin("137554616","fcschalke04");
		click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[1]/td/label[3]");
		click("xpath=//*[@id=\"checkEmail2\"]");
		click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[6]/td[1]/label[2]");
		click("id=submit");
	}

	public String isDisplayed(String locator,boolean ture) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			System.out.println(element.isDisplayed());
			return "ture";
		}
		return "flase";
	}
	
	public String[] getAllWindowTitles() {
		// TODO Auto-generated method stub
	    String current = driver.getWindowHandle();

	    List<String> attributes = new ArrayList<String>();
	    for (String handle : driver.getWindowHandles()) {
	      driver.switchTo().window(handle);
	      attributes.add(driver.getTitle());
	    }

	    driver.switchTo().window(current);

	    return attributes.toArray(new String[attributes.size()]);
	}

	public WebDriverEngine(WebDriver driver) {
	
		this.driver = driver;
		driver.manage().window().maximize();
		finder = new ElementFinder(driver);
		action = new Actions(driver);
	}

	public void enterFrame(String frameID) {
		this.pause(3000);
		driver.switchTo().frame(frameID);
//		driver.switchTo().f
		Log.info("Entered iframe " + frameID);
	}
	public void enterFrame(int frameID) {
		this.pause(3000);
		driver.switchTo().frame(frameID);
		Log.info("Entered iframe " + frameID);
	}

	public void enterFrame1(String  locator) {
		this.pause(3000);
		WebElement element = finder.findElement(locator);
		driver.switchTo().frame(element);
		Log.info("Entered iframe " + element);
	}
	public void leaveFrame() {
		driver.switchTo().defaultContent();
		Log.info("Left the iframe");
	}

	public void open(String url) {

		try {
			driver.get(url);
			pause(3000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		Log.info("Opened url " + url);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void pause(int time) {
		if (time <= 0) {
			return;
		}
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isTextPresent(String pattern) {

		String text = driver.getPageSource();
		text = text.trim();
		if (text.contains(pattern)) {
			return true;
		}
		return false;
	}

	public void typeAndClear(String locator, String value) {
		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.clear();
			element.sendKeys(value);

		}
	}

	public void type(String locator, String value) {
		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.sendKeys(value);
		}
	}

	public boolean isChecked(String locator) {
		WebElement element = finder.findElement(locator);
		return element.isSelected();
	}

	public void click(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.click();
			this.pause(1000);
		}
	}
	
	public void click1(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.click();
			this.pause(3000);
		}
	}

	public void clickLonger(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			runJs("window.scrollTo(0," + element.getLocation().x + ")");
			element.click();
			this.pause(3000);
		}
	}

	public void doubleClick(String locator) throws InterruptedException {
		WebElement element = finder.findElement(locator);
	
		action.doubleClick(element).build().perform();
	}

	public void isDisplayed(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			System.out.println(element.isDisplayed());
		}
	}

	public String getText(String locator) {

		return finder.findElement(locator).getText().trim();
	}

	public boolean isElementPresent(String locator) {

		WebElement element = null;
		try {
			element = finder.findElement(locator);
		} catch (Exception e) {

			Log.info(e.getMessage());
		}
		if (element != null) {
			return true;
		}
		{
			return false;
		}
	}
	public WebDriver getDriver() {
        return driver;
    }
	
	public String getValue(String locator) {

		return finder.findElement(locator).getAttribute("value");
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public void goBack() {
		driver.navigate().back();
	}

	public void goForward() {

		driver.navigate().forward();
	}

	public Alert getAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public String getAlertTest() {

		return getAlert().getText();
	}

	public void alertAccept() {

		getAlert().accept();
	}

	public Select getSelect(String locator) {
		Select inputSelect = new Select(finder.findElement(locator));
		return inputSelect;
	}

	public void selectByValue(String locator, String value) {
		getSelect(locator).selectByValue(value);
		this.pause(5000);
	}

	public void selectByVisibleText(String locator, String value) {
		getSelect(locator).selectByVisibleText(value);
	}

	public void selectByIndex(String locator, int index) {
		getSelect(locator).selectByIndex(index);
	}

	

	public String getHtmlSource() {

		return driver.getPageSource();
	}

	public void runJs(String js) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript(js);
	}


	public void mouseoverElement(String locator) throws InterruptedException {
		action.moveToElement(finder.findElement(locator)).perform();
	}
	//鍒囨崲绐楀彛
	public void switchWidow(int i){
	    List<String> windows = new ArrayList<String>();
	    for (String handle : driver.getWindowHandles()) {
	    
	    	windows.add(handle);
	    }
	    driver.switchTo().window(windows.get(i));
	}
	//鍙抽敭
	public void rightClickMouse(String locator) throws InterruptedException {
		action.contextClick(finder.findElement(locator)).perform();
		}
	//Tab锟�?
	public void tapClick(){
	
		action.sendKeys(Keys.TAB).perform();;
	}
	
	public void tapType(String content){
		
			action.sendKeys(content).perform();
		}
	
	public void getWindow(int i){
		List<String> windows = new ArrayList<String>();
		for (String handle : driver.getWindowHandles())
		{
			windows.add(handle);
		}
		driver.switchTo().window(windows.get(i));
	}
	
	public void enter(){
		
		action.sendKeys(Keys.ENTER).perform();
		this.pause(1000);
	}
	public void wait1(){
		
		
		this.pause(1000);
	}
	public boolean notisTextPresent(String pattern) {

		String text = driver.getPageSource();
		text = text.trim();
		if (text.contains(pattern)) {
			return false;
		}
		return true;
	}



	
	
	
}
