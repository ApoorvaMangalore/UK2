package testNgProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_001 extends BaseClass  {

	
	@Test
	public void clickOnallTabs() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		Reporter.log("User is able to click on shopping cart",true);
		Thread.sleep(5000);
	}
	@Test
	public void clickOnWishList() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Wishlis']")).click();
		Reporter.log("User is able to click on wishlist cart",true);
		Thread.sleep(5000);
		
	}
}
