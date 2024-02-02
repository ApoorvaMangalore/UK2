package workingWithJS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInJS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("alert('ok')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		jse.executeScript("prompt('hello')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		jse.executeScript("confirm('good night')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
