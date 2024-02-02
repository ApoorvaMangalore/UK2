package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		//Tag name are duplicate in web page
		//so we are not going to use this
		//it will give us first match web element bcz of findelement
		// driver.findElement(By.tagName("img")).click();// click on logo of demo web
		driver.findElement(By.tagName("input")).sendKeys("apoorva");
		driver.quit();
	}

}
