import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHandlingCalandars {

	static int targetDay = 0;
	static int targetMonth = 0;
	static int targetYear = 0;
	
	static int currentDay = 0;
	static int currentMonth = 0;
	static int currentYear = 0;
	
	static int jumpMonthsby = 0;
	
	static boolean increment = true;
	
	public static void main(String[] args) throws InterruptedException {
		// Target day, month and year
		// Current day, month and year
		// Jump to month
		// Increment or Decrement
		
		String dateToSet = "08/11/2020";
		getCurrentDateMonthAndYear();
		System.out.println(currentDay+"  "+currentMonth+"  "+currentYear);
		getTargetDayMonthAndYear(dateToSet);
		System.out.println(targetDay+"  "+targetMonth+"  "+targetYear);
		CalculateDifference();
		System.out.println(jumpMonthsby);
		System.out.println(increment);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jquerycookbook.com/demos/S9-General/67.1-datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datepicker"))).click();;
		
		
		
		
		for(int i=0;i<jumpMonthsby;i++) {
			if(increment) {
				driver.findElement(By.xpath("/html/body/div/div/a[2]/span")).click();;
			}else {
				driver.findElement(By.xpath("/html/body/div/div/a[1]/span")).click();
			}
			Thread.sleep(1000);
		}
		driver.findElement(By.linkText(Integer.toString(targetDay))).click();
		
		
		

	}
	public static void getCurrentDateMonthAndYear() {
		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
	}
	public static void getTargetDayMonthAndYear(String date) {
		int firstindex = date.indexOf("/");
		int lastIndex = date.lastIndexOf("/");
		String day = date.substring(0, firstindex);
		targetDay = Integer.parseInt(day);
		
		String month = date.substring(firstindex+1, lastIndex);
		targetMonth = Integer.parseInt(month);
		
		String year = date.substring(lastIndex+1, date.length());
		targetYear = Integer.parseInt(year);
		
	}
	public static void CalculateDifference() {
		if((targetMonth-currentMonth)>0) {
			jumpMonthsby = (targetMonth-currentMonth);
		}else {
			jumpMonthsby = (currentMonth-targetMonth);
			increment = false;
		}
	}

}
