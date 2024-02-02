package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UnderstandingAboutXl {

	public static void main(String[] args) throws IOException {
		// step1 :create obeject for fis

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		//create obejct for your xl version
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("data");

		int rowcount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();

		System.out.println(rowcount);
		System.out.println(cellCount);

	}

}
