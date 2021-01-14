import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("E:\\Java Lectures\\Access modifiers.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fi);
		
		org.apache.poi.ss.usermodel.Sheet sheet0 = wb.getSheetAt(0);
		Row row0 = sheet0.getRow(0);
		Cell cellA = row0.getCell(0);
		
		System.out.println(cellA);
		
		fi.close();
		
		
	}	

}
