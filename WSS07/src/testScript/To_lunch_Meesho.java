package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class To_lunch_Meesho {

	@Test(groups = "ecom")
	public void meesho() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 25);

		driver.get("https://www.meesho.com/");
		driver.quit();
	}
}
