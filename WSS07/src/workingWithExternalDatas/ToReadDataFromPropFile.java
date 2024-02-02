package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropFile {

	public static void main(String[] args) throws IOException {

		// Step 1:Create object for fis
		FileInputStream fis = new FileInputStream("./testData/data.properties");

		// step 2:create obejct for prop file
		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop.get("url"));
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
		System.out.println(prop.get("company"));
		System.out.println(prop.get("place"));

	}

}
