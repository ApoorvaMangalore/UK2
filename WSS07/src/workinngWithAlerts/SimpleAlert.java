package workinngWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.id("alert1")).click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();

		Thread.sleep(3000);
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
