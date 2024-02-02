package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("apoorva");
		driver.findElement(By.name("lastname")).sendKeys("mangalore");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("acm");

	}

}
