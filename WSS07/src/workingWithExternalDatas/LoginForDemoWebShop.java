package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForDemoWebShop {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		String emailId = workbook.getSheet("demoweb").getRow(0).getCell(0).getStringCellValue();
		String pwd = workbook.getSheet("demoweb").getRow(0).getCell(1).getStringCellValue();
		System.out.println(emailId);
		System.out.println(pwd);

		WebElement emailIgTb = driver.findElement(By.id("Email"));
		emailIgTb.sendKeys(emailId);
		System.out.println(emailIgTb.getAttribute("value"));
		
		WebElement pwdTb=driver.findElement(By.id("Password"));
		pwdTb.sendKeys(pwd);
		System.out.println(pwdTb.getAttribute("value"));
		
		driver.quit();

	}

}
