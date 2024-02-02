package workingWithWebdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenDemoWebshop {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// to luuch application
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
	
		// it will close only the parent one/ parent window
		driver.close();

		// it will close all the window which are opened by selenium
		//best to go with quit
		// driver.quit();
	}

}
