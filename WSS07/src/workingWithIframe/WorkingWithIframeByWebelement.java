package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIframeByWebelement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// switch to frame by name/id
		// driver.switchTo().frame("navbar-iframe");//id
//		                OR
		// driver.switchTo().frame("navbar-iframe");//name

		// switch your frame webelement
		WebElement frame = driver.findElement(By.id("navbar-iframe"));
		driver.switchTo().frame(frame);
		
	

		Thread.sleep(3000);

		driver.findElement(By.id("b-query")).sendKeys("Apoorva");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();

		// driver.switchTo().defaultContent();
		WebElement radio = driver.findElement(By.id("radio1"));
		radio.click();
		System.out.println(radio.isSelected());
		Thread.sleep(3000);
		driver.quit();
	}
}
