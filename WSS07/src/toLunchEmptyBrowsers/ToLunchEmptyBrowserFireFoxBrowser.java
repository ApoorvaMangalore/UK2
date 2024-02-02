package toLunchEmptyBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLunchEmptyBrowserFireFoxBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	}
}
