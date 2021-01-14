import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcell {

	public static void main(String[] args) throws IOException{
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("First Sheet");
		Row row0 = sheet0.createRow(0);
		
		Cell cellA = row0.createCell(0);	
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("First Cell");
		cellB.setCellValue("Second Cell");
		
		File f = new File("E:\\Java Lectures\\MyExcell.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		
		fo.close();
		
		System.out.println("File Created!!!");

	}

}
