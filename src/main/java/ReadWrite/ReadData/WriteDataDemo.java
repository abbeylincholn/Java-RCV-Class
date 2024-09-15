package ReadWrite.ReadData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {

		// Step 1: Create an object of FileWriter class
		/*	FileWriter fr = new FileWriter(
					"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Read\\properties\\TestData1.properties",
					true); */

		//OR THIS WAY

		//if you want to do file input stream
		// true: is used to add data to same file with different times and date
		FileOutputStream fis = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Read\\properties\\TestData2.properties", true); // hardcode the directory // change file name to add new file to the properties

		// Step 2: Create an object of properties class
		Properties p = new Properties();

		// Step 3: Use get property/store method to get property
		p.setProperty("url", "www.hp.com");
		p.store(fis, "Sample comments");

	}

}
