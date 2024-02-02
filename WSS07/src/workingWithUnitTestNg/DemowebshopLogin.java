package workingWithUnitTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemowebshopLogin {
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void loginDemo() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximixe browser", true);

		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("User is able to click on register link", true);
		driver.findElement(By.id("gender-female")).click();
		Reporter.log("User is able to click on female radio button", true);
	}
}
