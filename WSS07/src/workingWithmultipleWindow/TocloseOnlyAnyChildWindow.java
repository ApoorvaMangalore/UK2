package workingWithmultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocloseOnlyAnyChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		String parent_Window = driver.getWindowHandle();// only parent window
		Thread.sleep(8000);

		Set<String> all_window = driver.getWindowHandles();// all the window
		int size = all_window.size();

		System.out.println(parent_Window);
		System.out.println(all_window);
		System.out.println(size);

		String windowTitle = "#1 buffet grill barbeque restaurant near you. Exciting Offers on lunch dinner with our trademark. | Barbeque Nation";

		for (String i : all_window) {
			driver.switchTo().window(i);
			String title = driver.getTitle();
			if (title.equals(
					"#1 buffet grill barbeque restaurant near you. Exciting Offers on lunch dinner with our trademark. | Barbeque Nation")) {
				driver.close();
			}
			// OR
			if (title.equalsIgnoreCase(windowTitle)) {
				driver.close();
			}
			// OR
			if (title.contains("#1 buffet grill")) {
				driver.close();
			}
		}

	}
}
