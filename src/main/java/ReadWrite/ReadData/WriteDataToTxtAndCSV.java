package ReadWrite.ReadData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTxtAndCSV {

	public static void main(String[] args) throws IOException {

		// Step 1: Create an object of FileWriter class
		/*	FileWriter fr = new FileWriter(
					"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Read\\properties\\TestDataTXT.txt",
					true);  */

		//OR 

		File f = new File(
				"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Read\\properties\\TestDataCSV.csv");

		FileWriter fr = new FileWriter(f, true);

		// Step 2: Create object of BufferedWrite Class
		BufferedWriter br = new BufferedWriter(fr);

		//Step 3: Write data
		for (int i = 1; i <= 10; i++) {
			br.write(" RCV Academy online shops" + ",");
		}

		//Step 4: Close the file
		System.out.println("Written succesffuly");
		br.close();

	}

}
