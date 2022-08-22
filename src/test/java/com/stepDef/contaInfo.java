package com.stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contaInfo {

	WebDriver d = null;
	@Given("open the Chrome browser")
	public void open_the_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikramt\\eclipse-workspace\\youl\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
	}

	@Given("Enter the URL {string}")
	public void enter_the_URL(String URL) {
	   d.get(URL);
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}


	@When("valid {string} and {string} and {string} and {string}")
	public void valid_and_and_and(String First_Name , String string2, String phone, String email) {
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys(First_Name);
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys(string2);
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys(phone);
		d.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(email);
		
	}


	@When("valid {string} and {string} and {string} and {string} and {string}")
	public void valid_and_and_and_and(String address, String City, String State, String Code, String Country) {
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys(address);
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")).sendKeys(City);
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys(State);
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")).sendKeys(Code);
	    
	    
	    Select s = new Select(d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")));
		s.selectByIndex(13);
//	    Select s = new Select(d.findElement(By.xpath("")));
//	    s.selectByVisibleText(Country);
//	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")).sendKeys(Country);
	}

	@When("valid {string} and {string} and {string}")
	public void valid_and_and(String Username, String Password, String ConfirmPassword) {
	    d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Username);
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys(Password);
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys(ConfirmPassword);
	}

	@Then("User should click submit button")
	public void user_should_click_submit_button() {
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
	}
}
