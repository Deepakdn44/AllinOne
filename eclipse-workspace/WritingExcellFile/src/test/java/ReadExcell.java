
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("E:\\Java Lectures\\ExcellWriting\\Browser.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fi);
		
		Sheet sheet0 = workbook.getSheetAt(0);
		Row row0 = sheet0.getRow(0);
		Row row1 = sheet0.getRow(1);
		Cell cellA = row0.getCell(0);
		Cell cellB = row1.getCell(0);
		//String Browser = cellA;
		
		String Browser = cellA.getStringCellValue();
		String url = cellB.getStringCellValue();
		System.out.println(Browser);
		System.out.println(url);
		
	}

}
