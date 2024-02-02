package workingWithUnitTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandTimeout {
//in critical condition if you want to run your tc
	@Test(timeOut = 3000)
	public void toOpenDemoWebShop() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();

	}

}
