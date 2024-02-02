package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		// there are duplication as same as tag name so dont prefer class name
		//but if they are very unique you can use
		driver.findElement(By.className("ico-register")).click();
		
		// no such element exep.. bcx there is space in between class name
		driver.findElement(By.className("search-box-text ui-autocomplete-input")).click();

	}

}
