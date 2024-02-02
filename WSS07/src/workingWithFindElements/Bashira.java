package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bashira {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		int totalNoOfImages = images.size();
		System.out.println(totalNoOfImages);
		//System.out.println(images.size());
		Thread.sleep(3000);
		for(WebElement image:images) {
			System.out.println(image.getText());
		}
		driver.quit();

	}

}
