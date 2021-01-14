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
			XSSFSheet sheet = wb.createSheet("New Sheet");
			Row row0 = sheet.createRow(0);
			Cell cellA = row0.createCell(0);
			Cell cellB = row0.createCell(1);
			cellA.setCellValue("Deepu");
			cellB.setCellValue("Devu");
			
			File f = new File("E:\\Deepu.xlsx");
			FileOutputStream fo = new FileOutputStream(f);
			wb.write(fo);
			//fo.close();
			wb.close();
			
			System.out.println("File Created!!");

	}

}
