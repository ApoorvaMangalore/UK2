package workingWithJS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendDataToTheDisabledTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement dTextBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		jse.executeScript("arguments[0].value='Apoorva'",dTextBox);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='Mangalore'",dTextBox);

	}

}
