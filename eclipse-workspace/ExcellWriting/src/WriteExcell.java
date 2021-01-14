import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcell {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet0 = wb.createSheet("Sheet1");
		Row row0 = sheet0.createRow(0);
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("Deepu");
		cellB.setCellValue("Ture");
		
		File f = new File("E:\\Java Lectures\\ExcellWriting\\Practice.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		
		fo.close();
		wb.close();
		
		System.out.println("File Created!!!");
	}

}
