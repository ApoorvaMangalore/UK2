package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithKeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.UP).perform();
		Thread.sleep(3000);

		actions.sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("(//input[@value='Add to cart'])[6]")).click();

		Thread.sleep(6000);

		// driver.quit();
	}

}
