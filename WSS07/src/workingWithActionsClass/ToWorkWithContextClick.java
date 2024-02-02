package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithContextClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);

		/*
		 * actions.contextClick().perform();//right click with out pram..
		 * Thread.sleep(3000);
		 */

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(rightClick).build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		Thread.sleep(3000);
		// driver.quit();
	}

}
