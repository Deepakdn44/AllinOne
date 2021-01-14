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
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		Row row0 = sheet.createRow(0);
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		Cell cellC = row0.createCell(2);
		cellA.setCellValue("Firefox");
		cellB.setCellValue("Chrome");
		cellC.setCellValue("IE");
		
		/*for(int rows=0;rows<10;rows++) {
			Row row = sheet.createRow(rows);
			for(int cols=0;cols<10;cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue((Math.random()*100));
			}
		}*/
		
		File f = new File("E:\\Java Lectures\\ExcellWriting\\Browser.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		
		fo.close();
		
		System.out.println("File Created");
		
		
	}

}
