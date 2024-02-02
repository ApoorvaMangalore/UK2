package workingWithmultipleWindow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/demo.html");
		WebElement resume = driver.findElement(By.id("resume"));
		actions.click(resume).perform();
		
		Thread.sleep(3000);
		
		Robot robot=new Robot();
	    robot.keyPress(KeyEvent.VK_A);//folder name
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    
	    robot.keyRelease(KeyEvent.VK_A);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
