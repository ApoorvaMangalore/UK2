package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAllTheRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");

		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		/*
		 * for (WebElement radiobutton : radioButtons) { // [] radiobutton.click();
		 * Thread.sleep(3000)
		 */;
		for (int i = 0; i <= radioButtons.size()-1; i++) {
			radioButtons.get(i).click();
		}

		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		Thread.sleep(3000);

	
		driver.quit();

	}

}
