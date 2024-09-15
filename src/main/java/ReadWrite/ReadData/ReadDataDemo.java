package ReadWrite.ReadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException {

		// Step 1: Create an object of FileReader class
		/*	FileReader fr = new FileReader(
					"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Read\\properties\\TestData.properties"); */

		//OR THIS WAY

		//if you want to do file input stream
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Read\\properties\\TestData.properties"); // hardcode the directory

		// Step 2: Create an object of properties class
		Properties p = new Properties();

		// Step 3: Load the file
		p.load(fis);

		// Step 4: Use get property method to get property
		System.out.println(p.getProperty("website"));
		System.out.println(p.getProperty("name"));
		System.out.println(System.getProperty("user.dir"));

	}

}
