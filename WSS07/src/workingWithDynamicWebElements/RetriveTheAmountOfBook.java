package workingWithDynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveTheAmountOfBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/books");

		String amount = driver.findElement(By.xpath("(//span[text()='10.00'])[1]")).getText();
		System.out.println(amount);

		String amount1 = driver.findElement(By.xpath(
				"(//img[@alt='Picture of Computing and Internet'])/../../..//span[@class='price actual-price']"))
				.getText();
		System.out.println(amount1);

		String amount2 = driver.findElement(By.xpath("(//span[contains(text(),'10')])[2]")).getText();
		System.out.println(amount2);
	}

}
