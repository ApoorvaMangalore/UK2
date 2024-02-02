package workingWithWebdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBrowserHistory {

	public static void main(String[] args) throws InterruptedException, MalformedURLException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// to luuch application
		//driver.get("https://demowebshop.tricentis.com/");
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		URL url=new URL("https://www.amazon.in/");
		driver.navigate().to(url);
		
		
		driver.quit();
	}

}
