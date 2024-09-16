package Write.ReadWriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromXls {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File(
				"C:\\Users\\Engr. Abbey\\eclipse-workspace\\java.com\\src\\main\\java\\Write\\DataExcel\\TestData2.xls");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet0 = wb.getSheetAt(0);

		//		Row row0 = sheet0.getRow(0);
		//		Cell cell0 = row0.getCell(0);
		//
		//		System.out.println(cell0);

		for (Row row : sheet0) {
			for (Cell cell : row) {
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "  ");
					break;

				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + "  ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "  ");
				default:
					break;
				}
			}
			System.out.println();
		}

		fis.close();

	}

}
