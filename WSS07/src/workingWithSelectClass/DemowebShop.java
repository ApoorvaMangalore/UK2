package workingWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemowebShop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(3000);
		// step1: identify first dropdown webelement
		// Step2: Create obeject for select class and pass webelement as constructor
		// step3: Then call a method of select class
		WebElement dropDown = driver.findElement(By.id("products-orderby"));
		Select select = new Select(dropDown);
		System.out.println(select.isMultiple());

		// select.selectByIndex(1);
		// Thread.sleep(3000);

		//select.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
		//Thread.sleep(3000);

		select.selectByVisibleText("Price: High to Low");
		Thread.sleep(3000);
		driver.quit();
	}
}
