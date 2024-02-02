package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public ChromeDriver driver;

	String emailID = "er.pallavi207@gmail.com";
	String password = "Password@123";

	@BeforeSuite
	public void dataBaseCoonectionStart() {
		Reporter.log("Data base connection is started", true);
		Reporter.log("Report formation started", true);
	}

	@AfterSuite
	public void dataBaseCoonectionStop() {
		Reporter.log("Data base connection is stoped", true);
		Reporter.log("Report formation stoped", true);
	}

//@BeforeTest
	@BeforeClass
	public void browserSetup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open demowebshop", true);
		Thread.sleep(3000);
	}

//@AfterTest
	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("User is able to close the browser", true);
		driver.quit();

	}

	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(emailID);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("User is able to logIn for demowebshop", true);
		Thread.sleep(3000);
	}

	@AfterMethod(enabled = true)
	public void logout() throws InterruptedException {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("User is able to logout for demowebshop", true);
		Thread.sleep(3000);
	}
}
