package com.pom.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_SignIn {
	public static WebDriver driver;
	
	@FindBy(xpath = "//div[@class = 'header_user_info']")
	private WebElement signin;

	public Homepage_SignIn(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignin() {
		return signin;
	}
}
