package workingWithScreenShoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class ScreenshotOfTheWebPage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		// step 1: typecasting
		TakesScreenshot tk_scn_shoot = (TakesScreenshot) driver;

		// step2: call the method to take srcnshoot
		File src = tk_scn_shoot.getScreenshotAs(OutputType.FILE);

		// to store in my project
		File dest = new File("./errorShots/webpage.jpg");
		Files.copy(src, dest);
		driver.quit();

	}

}
