package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		//it very difficult to identify the element
		//in real time its not at not all possible
		//very lenghty and more time taken
		//If UI is changed it will not work for the future
		// adv-- idexing is posssible in xpath
		driver.findElement(By.xpath("(/html/body/div/div/div/div)[1]")).click();

	}

}
