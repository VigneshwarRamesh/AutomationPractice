package com.pom.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_To_Cart {
	
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getTshirts() {
		return Tshirts;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getQuickView() {
		return QuickView;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getSize() {
		return Size;
	}

	public WebElement getColor() {
		return Color;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	@FindBy(xpath = "(//a[@class='sf-with-ul'])[1]")
	private WebElement Women;
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement Tshirts;
	@FindBy (xpath = "(//img[@class = 'replace-2x img-responsive'])[2]")
	private WebElement image;
	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement QuickView;
	@FindBy(xpath = "//*[@id=\"quantity_wanted_p\"]/a[2]")
	private WebElement Quantity;
	@FindBy(xpath = "//select[@class='form-control attribute_select no-print']")
	private WebElement Size;
	@FindBy(name= "Blue")
	private WebElement Color;
	@FindBy(xpath= "//button[@class='exclusive']")
	private WebElement AddToCart;
	
	public Add_To_Cart(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
}


