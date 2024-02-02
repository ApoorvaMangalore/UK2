package workingWithDynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/books");

		driver.findElement(
				By.xpath("(//input[@value='Add to cart'])[1]/../../../..//a[text()='Computing and Internet']")).click();

	}

}
