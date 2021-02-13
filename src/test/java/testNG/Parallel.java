package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	@Test
	public void amazone() {
		System.setProperty("webdriver.chrome.driver", "F:\\code\\javaworkspace\\AutomationPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void FaceBook() {
		System.setProperty("webdriver.chrome.driver", "F:\\code\\javaworkspace\\AutomationPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
