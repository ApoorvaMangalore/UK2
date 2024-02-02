package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");

		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("mangalore");
		String exp = firstName.getAttribute("value");
		System.out.println(exp +" user is able to enter correct data" );

	}

}
