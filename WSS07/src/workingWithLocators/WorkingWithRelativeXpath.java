package workingWithLocators;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		//when you have have attribute nad attribute value
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		//htmltag[@attribute='value']
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("mobiles");
		Thread.sleep(3000);
		System.out.println("User is able to enter the values for search store");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println("User is able to click on search button");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		System.out.println("user is able to quit the browser");
	}

}
