package Write.ReadWriteExcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToXls2 {
	public static void main(String[] args) throws IOException {
		// Create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a sheet
		XSSFSheet sheet = workbook.createSheet("Sheet1");

		// Data to be written to the Excel file (rows and columns)
		String[][] data = { { "Name", "Age", "City", "Boolean" }, { "John", "30", "New York", "true" },
				{ "Anna", "25", "Los Angeles", "false" }, { "Mike", "35", "Chicago", "true" } };

		// Loop over the data and write it to rows and columns
		for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			Row row = sheet.createRow(rowIndex); // Create a row at the specified index

			for (int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
				Cell cell = row.createCell(colIndex); // Create a cell in the row
				cell.setCellValue(data[rowIndex][colIndex]); // Set the cell value
			}
		}

		//		File f = new File(
		//				"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Write\\DataExcel\\TestData2.xls");
		//
		//		try (FileOutputStream fileOut = new FileOutputStream(f)) {
		//			workbook.write(fileOut);
		//		} catch (IOException e) {
		//			e.printStackTrace();
		//		} finally {
		//
		//			try {
		//
		//				workbook.close();
		//			} catch (IOException e) {
		//				e.printStackTrace();
		//
		//			}
		//
		//		}
		//		System.out.println("File is written succesffully");

		// OR

		File f = new File(
				"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Write\\DataExcel\\TestData2.xls");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		//	fos.close();
		workbook.close();

		System.out.println("File is written succesffully");
	}

}
