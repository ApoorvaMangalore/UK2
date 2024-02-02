package workingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectOnOmayoPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement multisel = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multisel);

		System.out.println(select.isMultiple());
        System.out.println("==================================");
        
		select.selectByIndex(0);// v
		Thread.sleep(3000);
		select.selectByValue("swiftx");
		Thread.sleep(3000);
		select.selectByIndex(3);// a
		Thread.sleep(3000);
		
	    WebElement firstSel = select.getFirstSelectedOption();
		System.out.println(firstSel);// address of the webelement
		System.out.println(firstSel.getText());
		 System.out.println("==================================");
		List<WebElement> allOptions = select.getAllSelectedOptions();
		System.out.println(allOptions);// address

		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		 System.out.println("==================================");
		List<WebElement> getOptions = select.getOptions();// all the optios which are present in dropdown

		for (WebElement options1 : getOptions) {
			System.out.println(options1.getText());
		}

		driver.quit();
	}

}
