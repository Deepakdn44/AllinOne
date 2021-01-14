package com.w2a.ExcelReading;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args)throws Exception {
	  File file=new File("E://hello.xlsx");
	  file.createNewFile();
      XSSFWorkbook wb=new XSSFWorkbook();
      XSSFSheet sheet=wb.createSheet("testStep");
      for(int i=0;i<10;i++) {
    	  Row rows=sheet.createRow(i);
    	  for(int j=0;j<10;j++) {
    		  Cell cols=rows.createCell(j);
    		  cols.setCellValue((int)(Math.random()*100));
    	  }
    	  
      }
     
      FileOutputStream fo=new FileOutputStream(file);
      wb.write(fo);
      fo.close();
      wb.close();
      
      System.out.println("File Created!!");
	}
}
