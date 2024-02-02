package workingWithJS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByJs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// it will scroll directly to the bottom of the page
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		// jse.executeScript("window.scrollBy(0,1000)");//page down
		Thread.sleep(3000);
		// jse.executeScript("window.scrollBy(0,-500)");//page up

	}

}
