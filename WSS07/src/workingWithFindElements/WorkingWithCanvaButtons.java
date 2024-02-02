package workingWithFindElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCanvaButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.canva.com/");

		List<WebElement> buttons = driver.findElements(By.tagName("a"));
		int size = buttons.size();
		System.out.println(size);

		for (WebElement button : buttons) {
			System.out.println(button.getText());
		}
		driver.quit();
	}

}
