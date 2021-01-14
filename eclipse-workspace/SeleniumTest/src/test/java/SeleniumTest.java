import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File f = new File("E:\\Java Lectures\\ExcellWriting\\Browser.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fi);
		
		Sheet sheet0 = workbook.getSheetAt(0);
		Row row0 = sheet0.getRow(0);
		Row row1 = sheet0.getRow(1);
		Cell cellA = row0.getCell(0);
		//Cell cellB = row0.getCell(1);
		//Cell cellC = row0.getCell(2);
		Cell cell1 = row1.getCell(0);
		
		String browser = cellA.getStringCellValue();
		String url = cell1.getStringCellValue();
		
		//fi.close();
		if(browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
			
		driver.close();
		

	}

}
