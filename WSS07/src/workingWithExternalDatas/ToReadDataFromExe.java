package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataFromExe {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
	//	XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Workbook workbook = WorkbookFactory.create(fis);

		String value1 = workbook.getSheet("data").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);

		String value2 = workbook.getSheet("data").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value2);

		String value3 = workbook.getSheet("data").getRow(2).getCell(1).getStringCellValue();
		System.out.println(value3);

		LocalDateTime LDT = workbook.getSheet("data").getRow(4).getCell(1).getLocalDateTimeCellValue();
		System.out.println(LDT);
		
		System.out.println(LDT.getMonth().name());
		System.out.println(LDT.getYear());
		System.out.println(LDT.getDayOfMonth());
	}
}
