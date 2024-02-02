package workingWithScreenShoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// TakesScreenshot tk_scn_shoot = (TakesScreenshot) driver;

		WebElement regLink = driver.findElement(By.linkText("Register"));

		File src = regLink.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/webElement.jpg");
		Files.copy(src, dest);
		driver.quit();
	}
}
