package toLunchEmptyBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLunchEmptyChromeBrowser {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 * ChromeDriver driver=new ChromeDriver();
		 */

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// to maximize the page
		//method chaining
		driver.manage().window().maximize();
		
		

	}

}
