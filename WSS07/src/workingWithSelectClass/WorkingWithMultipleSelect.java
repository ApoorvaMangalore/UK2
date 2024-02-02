package workingWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement multisel = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multisel);

		System.out.println(select.isMultiple());

		select.selectByIndex(0);// v
		Thread.sleep(3000);
		select.selectByValue("swiftx");
		Thread.sleep(3000);
		select.selectByIndex(3);// a
		Thread.sleep(3000);

		select.deselectByIndex(0);
		Thread.sleep(3000);
		select.deselectByValue("swiftx");
		Thread.sleep(3000);
		select.deselectByIndex(5);
		Thread.sleep(3000);

		select.deselectAll();
		Thread.sleep(3000);
		driver.quit();

	}

}
