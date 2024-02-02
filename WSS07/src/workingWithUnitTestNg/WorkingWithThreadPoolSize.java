package workingWithUnitTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithThreadPoolSize {
@Test(invocationCount = 5)
public void run() {
	System.out.println("i am run");
}
//To sequence form=invocationCount
//one kind of parallel exe
	
	@Test(invocationCount = 5,threadPoolSize = 3)
	public void toOpenDemoWebShop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.quit();

	}
}
