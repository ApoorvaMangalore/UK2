package workingWithWebdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
		System.out.println(driver.getCurrentUrl());
		// sendkeys
		// click//submit
		// clear
		// getAttributre
		// getText
		// getLocation
		// isDisplayed
		// isenable
		// isselected
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("apoorva");
		WebElement passsword = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		passsword.sendKeys("!@#!@#$%");
		passsword.clear();
		Thread.sleep(5000);
		passsword.sendKeys("dgsrdthfsydgaskyu");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()=' LogIn ']"));
		loginButton.click();

		Point locP = passsword.getLocation();
		System.out.println(locP.getX());
		System.out.println(locP.getY());

		Point loc = loginButton.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());

		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		System.out.println(loginButton.isSelected());

	}

}
