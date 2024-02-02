package workingWithUnitTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProviderForActiTime {
	
	@Test(dataProvider = "setOfdata")
	public void openActiTime(String un,String pw) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] setOfdata(){
		return new Object[][] {{"apoorva","acm"},{"acm","apoorva"},{"123","apoorva"}};
	}
}
