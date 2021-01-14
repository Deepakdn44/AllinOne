import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShineVote {

	public static WebDriver driver;

	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (Throwable t) {
			return false;
		}

	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		while (true) {
			driver = new ChromeDriver();

			driver.get(
					"https://www.voot.com/voting/bigg-boss-kannada-season-7-voting-online/webview/?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVSUQiOiIzOWY2MTAwYzIwYjk0YWQ4YTFhY2ZlMzRjMTFlOWI2ZiIsInVzZXJOYW1lIjoiRGVlcGFrIiwibG9naW5Qcm92aWRlciI6IlRyYWRpdGlvbmFsIiwiZ2VuZGVyIjoiTSIsImFnZSI6IjExLTA4LTE5OTUiLCJuYW1lIjoiRGVlcGFrIiwiZW1haWwiOiJkZWVwYWtkbjQ0NEBnbWFpbC5jb20iLCJVRElEIjoiMzlmNjEwMGMyMGI5NGFkOGExYWNmZTM0YzExZTliNmYiLCJzZXgiOiJNIiwiZXh0cmFEYXRhIjoidm9vdCIsImlhdCI6MTU4MDMxNTA1M30.3w6g_JBC3aqIa1_cymhfG75zag-Ao3xF2mpxXPru-js&uid=39f6100c20b94ad8a1acfe34c11e9b6f");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[6]/div[1]/div[1]/div/div/div/button[4]/span[1]/span/span")).click();
			/*
			 * driver.findElement(By.xpath("/html/body/div/header/div/div[3]/div[1]/img")).
			 * click(); driver.findElement(By.xpath(
			 * "/html/body/div/header/div/div[3]/div[2]/div/nav[1]/li/div/span")).click();
			 * driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(
			 * "deepakdn444@gmail.com"); driver.findElement(By.xpath(
			 * "/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/button")).click();
			 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Virat18@444")
			 * ; driver.findElement(By.xpath(
			 * "/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/button")).click();
			 * driver.findElement(By.xpath(
			 * "/html/body/div[1]/div[1]/div[6]/div[1]/div[1]/div/div/div/button[4]")).click
			 * (); driver.findElement(By.xpath(
			 * "/html/body/div[1]/div[1]/div[6]/div[2]/div/div[2]/div/div/div/div/div/div/div/div/button"
			 * )).click();
			 */

			for (int j = 0; j < 5; j++) {
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[4]/label/div/img")).click();
				driver.findElement(By.xpath("//*[@id=\"vote-submit\"]")).click();
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/a")).click();
			}
			driver.quit();

		}

	}

}
