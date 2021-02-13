package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class Simple_Automation {
	@BeforeSuite
	public void setup() {
		System.out.println("set up");
	}
	@BeforeTest
		public void Browserlaunch() {
		System.out.println("Browser Launch");
	}
	@BeforeClass
	public void loadUrl() {
		System.out.println("Url");
	}
	@BeforeMethod
	
	public void login() {
		System.out.println("Log in");
	}
	@Test
	public void SearchLaptop() {
		System.out.println("Search Laptop");
	}
	@Test
	public void SearchMobile() {
		System.out.println("Search Mobile");
	}
	@AfterMethod
	public void LogOut() {
		System.out.println("Log Out");
	}
	@AfterClass
	public void VerifyHomePage() {
		System.out.println("Verify Homepage");
	}
}
