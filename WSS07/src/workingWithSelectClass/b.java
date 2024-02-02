package workingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.id("cars"));
		Select select = new Select(dropDown);
		select.selectByIndex(0);
		Thread.sleep(3000);
		select.selectByValue("299");
		Thread.sleep(3000);
		select.selectByValue("500");

		boolean mul = select.isMultiple();
		System.out.println(mul);
		System.out.println("---------------------------------------------");
		Thread.sleep(3000);
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		System.out.println("---------------------------------------------");

		List<WebElement> allSel = select.getAllSelectedOptions();
		System.out.println(allSel.size());
		for (WebElement sel : allSel) {
			System.out.println(sel.getText());
			System.out.println("---------------------------------------------");

			List<WebElement> allOptions = select.getOptions();
			System.out.println(allOptions.size());
			for (WebElement option : allOptions) {
				System.out.println(option.getText());
			}
		}

		driver.quit();

	}
}
