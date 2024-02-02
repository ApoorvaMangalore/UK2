package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIframeByIdex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		//switch to frame by index
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		driver.findElement(By.id("b-query")).sendKeys("Apoorva");
		Thread.sleep(3000);
		//driver.switchTo().parentFrame();
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("radio1")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
