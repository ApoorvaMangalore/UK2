package workingWithWebdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTittleOfThePage {
	
	//all these methods are for varification and validation
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		//To ge the current url of the page
		String urlOfThepage = driver.getCurrentUrl();
		System.out.println("Current url of the page " + urlOfThepage );
		
		//To get the title of the page
		String title = driver.getTitle();
		System.out.println(" Title of the page " + title);
		
		//To get the PageSouurce of the page
		//String pageSource = driver.getPageSource();
		//System.out.println("Pagesource of demoweb " + pageSource);
		
		driver.quit();
		
	}
}
