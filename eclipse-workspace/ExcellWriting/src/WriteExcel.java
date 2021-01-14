import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public static void main(String[] args) throws IOException  {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0= workbook.createSheet("First Sheet");
		XSSFRow row1 = sheet0.createRow(1);
		XSSFCell cellA = row1.createCell(1);
		XSSFCell cellB = row1.createCell(1);
		
		cellA.setCellValue("Deepu");
		cellB.setCellValue("Sanju");
		
		File f = new File("E:\\SANJU\\Deepu.xlsx");
		FileOutputStream fs =  new FileOutputStream(f);
		
		workbook.write(fs);
		
		fs.close();
		workbook.close();
		
		System.out.println("File created");
		
		
	}

}
