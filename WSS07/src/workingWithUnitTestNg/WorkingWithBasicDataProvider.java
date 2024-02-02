package workingWithUnitTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithBasicDataProvider {

	@Test(dataProvider = "dataDemo")
	public void testcase(String place, String place1) {
		System.out.println(place);
		System.out.println(place1);
	}

	@DataProvider
	public Object[][] dataDemo() {
		Object[][] data = new Object[4][2];

		data[0][0] = "a";
		data[0][1] = "b";// row 1

		data[1][0] = "c";
		data[1][1] = "d";

		data[2][0] = "e";
		data[2][1] = "f";

		data[3][0] = "g";
		data[3][1] = "h";

		return data;
	}
}
