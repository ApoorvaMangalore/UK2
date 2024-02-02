package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathWithContains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		//driver.findElement(By.xpath("//input[contains(@data-val-equalto,'The password')]")).sendKeys("acm");
		driver.findElement(By.id("register-button")).click();
		
		WebElement errormsg = driver.findElement(By.xpath("//span[contains(text(),'First')]"));
		System.out.println(errormsg.getText());
	}

}
