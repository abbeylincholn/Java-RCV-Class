package Write.ReadWriteExcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToXls {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Sheet1");

		Row r0 = sheet1.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("RCV Academy");

		Row r1 = sheet1.createRow(1);
		Cell c1 = r1.createCell(0);
		c1.setCellValue("Abbey Academy");

		File f = new File(
				"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Write\\DataExcel\\TestData.xls");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		workbook.close();

		System.out.println("File is written succesffully");

	}

}
