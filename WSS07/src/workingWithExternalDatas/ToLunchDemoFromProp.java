package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLunchDemoFromProp {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/data.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String key = prop.getProperty("chromeKey");
		String value = prop.getProperty("chromevalue");
		String url = prop.getProperty("url");

		System.setProperty(prop.getProperty(key),prop.getProperty(value));
		ChromeDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
				    
						//OR
		
		System.setProperty(key, value);
		driver.get(url);

	}
}
