package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		WebElement errorMsgFirstName = driver.findElement(By.xpath("//span[text()='First name is required.']"));
		//System.out.println(errorMsgFirstName.getText());
		String text = errorMsgFirstName.getText();// webelement
		System.out.println(text);
		
	}

}
