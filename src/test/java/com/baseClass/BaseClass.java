package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver d;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikramt\\eclipse-workspace\\youl\\driver\\chromedriver.exe");

		d = new ChromeDriver();
	}

	public static void maximizeWindow() {
		d.manage().window().maximize();
	}

	public static void loadURL(String url) {
		d.get(url);
	}

	public static void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static void quitBrowser() {
		d.quit();
	}
	
	private void selectByVisibleText(WebElement element, String text ) {
		
		Select s = new Select (element);
		s.selectByVisibleText(text);
		
	}

}
