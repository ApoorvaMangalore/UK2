package workingWithUnitTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUndrstandSoftAssertion {
	String actualUrl="https://demowebshop.tricentis.com/";

	@Test
	public void demo() {
		SoftAssert softAssert=new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Assert.assertEquals(actualUrl, url,"Url is not correct");
		softAssert.assertEquals(actualUrl, url, "Url is not correct");
		
		driver.quit();
		softAssert.assertAll();
	}
}
