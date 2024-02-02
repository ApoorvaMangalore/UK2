package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("b-more")).click();
		Thread.sleep(4000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("radio2")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
