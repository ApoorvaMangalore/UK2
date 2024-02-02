package workingWithWebdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        
        WebElement firstName = driver.findElement(By.id("FirstName"));
        String getcssValueOfFirstName = firstName.getCssValue("border");
        System.out.println(getcssValueOfFirstName);
        driver.quit();

	}

}
