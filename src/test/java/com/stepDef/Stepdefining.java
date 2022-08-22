package com.stepDef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefining {
	public WebDriver d = null;

	
	@Given("Browser should open")
	public void browser_should_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikramt\\eclipse-workspace\\youl\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
	}

	@Given("Enter the URL")
	public void enter_the_URL() {
		d.get("https://practice.automationtesting.in/");
	}

	@Given("Click on the My Account menu")
	public void click_on_the_My_Account_menu() {
		d.findElement(By.linkText("My Account")).click();

	}

	@Given("Enter the user and password")
	public void enter_the_user_and_password() {

		d.findElement(By.id("username")).sendKeys("vikram.tbk15@gmail.com");
		d.findElement(By.id("password")).sendKeys("Viki@112523321");

	}

	@Given("Click on the login button")
	public void click_on_the_login_button() {
		d.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
	}

	@Then("User should successfully login")
	public void user_should_successfully_login() {

		String CText = d.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
		assertEquals(true, CText.contains("vikram.tbk15"));
	}

}
