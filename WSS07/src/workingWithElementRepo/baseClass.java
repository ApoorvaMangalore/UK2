package workingWithElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	WebDriver driver;

	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximixe browser", true);
		driver.get("https://demowebshop.tricentis.com");
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}
}
