package ReadWrite.ReadData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataToTxtAndCSV2 {

	public static void main(String[] args) throws IOException {

		// Step 1: Create an object of FileReader class
		/*	FileReader fr = new FileReader(
					"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Read\\properties\\TestData1.properties",
					true);  */

		//OR 

		File f = new File(
				"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Read\\properties\\TestDataCSV.csv");

		FileReader fr = new FileReader(f);

		// Step 2: Create object of BufferedReader Class
		BufferedReader br = new BufferedReader(fr);

		//Step 3: Write data
		for (int i = 1; i <= 10; i++) {
			System.out.println(br.readLine());
		}

		//System.out.println(br.readLine());

		//Step 4: Close the file
		System.out.println("Read succesffuly");
		br.close();

	}

}
