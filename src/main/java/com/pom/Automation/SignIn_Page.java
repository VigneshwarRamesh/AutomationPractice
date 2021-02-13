package com.pom.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {
	public static WebDriver driver;
	

	
	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getSignin() {
		return Signin;
	}


	@FindBy(xpath = "(//input[@class= 'is_required validate account_input form-control'])[2]")
	private WebElement Email;

	@FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[3]")
	private WebElement Password;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement Signin;
	

	public SignIn_Page(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
}

