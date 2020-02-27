package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefinition {
	public static WebDriver driver;
	
	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aarthi\\eclipse-workspace\\vigneshman\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

	@When("user enter the {string} and pass {string}")
	public void user_enter_the_and_pass(String s1, String s2) {
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(s1);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(s2);
}

	@Then("user click the login button")
	public void user_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
		btnLogin.click();
		driver.close();
	}




		}
