package workingWithWebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 25);
        driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));

		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Facebook")));

		WebElement faceBook = driver.findElement(By.xpath("//a[text()='Facebook']"));

		wait.until(ExpectedConditions.elementToBeClickable(faceBook));

		driver.findElement(By.xpath("//a[text()='Facebook']")).click();

		driver.quit();

	}

}
