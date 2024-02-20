package workingWithDynamicWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Via {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.via.com/hotels");
		String month = "Jan";
		String date = "26";

		driver.findElement(By.id("checkIn")).click();
		driver.findElement(By.xpath("//div[@id='depart-cal']//span[text()=' 2024']//span[text()='" + month
				+ "']/../../..//div[text()='" + date + "']")).click();
		driver.findElement(By.id("vc-close")).click();
	}
}
