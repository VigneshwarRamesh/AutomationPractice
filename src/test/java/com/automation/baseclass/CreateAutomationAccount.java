package com.automation.baseclass;

import java.util.concurrent.TimeUnit;

import javax.xml.crypto.dsig.SignedInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.pom.Automation.Add_To_Cart;
import com.pom.Automation.Homepage_SignIn;
import com.pom.Automation.SignIn_Page;

public class CreateAutomationAccount extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "F:\\code\\javaworkspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.get("http://automationpractice.com/index.php");
		 */
		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		Homepage_SignIn hp = new Homepage_SignIn(driver);
		ClickOnElement(hp.getSignin());

		SignIn_Page sp = new SignIn_Page(driver);
		InputToElements(sp.getEmail(), "ram123vignesh@gmail.com");
		InputToElements(sp.getPassword(), "Ch#77777");
		ClickOnElement(sp.getSignin());

		Add_To_Cart ac = new Add_To_Cart(driver);
		actionsClass(ac.getWomen());
		actionsClass(ac.getTshirts());
		ClickOnElement(ac.getTshirts());
		actionsClass(ac.getImage());
		actionsClass(ac.getQuickView());
		ClickOnElement(ac.getQuickView());
		driver.switchTo().frame(0);
		ClickOnElement(ac.getQuantity());
		ClickOnElement(ac.getColor());
		ClickOnElement(ac.getAddToCart());
		/*
		 * WebElement signin =
		 * driver.findElement(By.xpath("//div[@class = 'header_user_info']"));
		 * signin.click();
		 */

		/*
		 * Thread.sleep(2000); WebElement EmailId = driver.findElement(By.id("email"));
		 * EmailId.sendKeys("ram123vignesh@gmail.com");
		 */

		/*
		 * WebElement password = driver.findElement(By.id("passwd"));
		 * password.sendKeys("Ch#77777");
		 * 
		 * WebElement SignIn = driver.findElement(By.id("SubmitLogin")); SignIn.click();
		 * 
		 * WebElement womens = driver.findElement(By.xpath("//a[text() = 'Women']"));
		 * Actions ac = new Actions(driver); ac.moveToElement(womens).perform();
		 * 
		 * 
		 * WebElement Tshirt = driver.findElement(By.xpath("//a[text() = 'T-shirts']"));
		 * ac.moveToElement(Tshirt).perform(); ac.click(Tshirt).perform();
		 * 
		 * WebElement image = driver.findElement(By.
		 * xpath("(//img[@class = 'replace-2x img-responsive'])[2]"));
		 * ac.moveToElement(image).perform();
		 * 
		 * WebElement Quickview =
		 * driver.findElement(By.xpath("//a[@class='quick-view']"));
		 * ac.moveToElement(Quickview).perform(); ac.click().perform();
		 * 
		 * driver.switchTo().frame(0); WebElement Quantity =
		 * driver.findElement(By.xpath("//input[@class='text']"));
		 * Quantity.sendKeys("2");
		 * 
		 * WebElement size = driver.findElement(By.id("group_1")); Select s1 = new
		 * Select(size); s1.selectByVisibleText("M");
		 * 
		 * Thread.sleep(2000); WebElement addtocart =
		 * driver.findElement(By.xpath("//button[@class='exclusive']"));
		 * ac.moveToElement(addtocart).perform(); ac.click(addtocart).perform();
		 * 
		 * WebElement AddtoCart = driver.findElement(By.
		 * xpath("//a[@class = 'button ajax_add_to_cart_button btn btn-default']"));
		 * ac.moveToElement(AddtoCart).perform(); ac.click(AddtoCart).perform();
		 * 
		 * Thread.sleep(2000); WebElement ProcedToCheckOut =
		 * driver.findElement(By.xpath("//a[@title = 'Proceed to checkout']"));
		 * ProcedToCheckOut.click();
		 * 
		 * WebElement proceed1 = driver.findElement(By.
		 * xpath("//a[@class= 'button btn btn-default standard-checkout button-medium']"
		 * )); proceed1.click();
		 * 
		 * WebElement proceed2 = driver.findElement(By.name("processAddress"));
		 * proceed2.click();
		 * 
		 * Thread.sleep(2000); WebElement checkBox =
		 * driver.findElement(By.id("uniform-cgv")); checkBox.click();
		 * 
		 * WebElement proceed3 = driver.findElement(By.name("processCarrier"));
		 * proceed3.click();
		 * 
		 * WebElement payByBankWire =
		 * driver.findElement(By.xpath("//a[@class = 'bankwire']"));
		 * payByBankWire.click();
		 * 
		 * WebElement conformOrder = driver.findElement(By.
		 * xpath("//button[@class = 'button btn btn-default button-medium']"));
		 * conformOrder.click();
		 */
		/*
		 * Thread.sleep(2000);
		 * 
		 * WebElement downpage =
		 * driver.findElement(By.xpath("//textarea[@class = 'form-control']"));
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("argumetn[0].scrollIntoview()", downpage);
		 */
		// WebElement CreatAcc = driver.findElement(By.xpath("(//button[@type =
		// 'submit'])[2]"));
		// CreatAcc.click();

		// Thread.sleep(5000);
		// WebElement Mr = driver.findElement(By.xpath("//label[@class = 'top']"));
		// Mr.click();

		/*
		 * WebElement FirstName =
		 * driver.findElement(By.xpath("(//input[contains(@class, 'is_required ')])[1]")
		 * ); FirstName.sendKeys("Vigneshwar");
		 * 
		 * WebElement LastName =
		 * driver.findElement(By.xpath("(//input[contains(@class, 'is_required ')])[2]")
		 * ); LastName.sendKeys("Ramesh");
		 * 
		 * WebElement Password =
		 * driver.findElement(By.xpath("(//input[contains(@class, 'is_required ')])[4]")
		 * ); Password.sendKeys("Ch#77777");
		 * 
		 * WebElement days = driver.findElement(By.id("days")); Select s = new
		 * Select(days); s.selectByVisibleText("3  ");
		 * 
		 * WebElement month = driver.findElement(By.id("months")); Select s1 = new
		 * Select(month); s1.selectByVisibleText("June ");
		 * 
		 * WebElement Years = driver.findElement(By.id("years")); Select s2 = new
		 * Select(Years); s2.selectByVisibleText("1997  ");
		 * 
		 * WebElement Address = driver.findElement(By.id("address1"));
		 * Address.sendKeys("No 7/4 Ramaswamy Garden Street");
		 * 
		 * WebElement City = driver.findElement(By.name("city"));
		 * City.sendKeys("Chennai");
		 * 
		 * WebElement State = driver.findElement(By.name("id_state")); Select s3 = new
		 * Select(State); s3.selectByVisibleText("Indiana");
		 * 
		 * WebElement Postcode = driver.findElement(By.id("postcode"));
		 * Postcode.sendKeys("00000");
		 * 
		 * WebElement PhNo = driver.findElement(By.id("phone_mobile"));
		 * PhNo.sendKeys("9710082116");
		 * 
		 * WebElement adressalies = driver.findElement(By.id("alias"));
		 * adressalies.sendKeys("99 accers street");
		 * 
		 * WebElement Submit = driver.findElement(By.id("submitAccount"));
		 * Submit.click();
		 */
	}

}
