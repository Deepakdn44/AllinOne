import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementScreenShot {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div/section[3]/div/div[2]/ul/li[3]/div/p"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		BufferedImage Fullimg = ImageIO.read(screenshot);
		Point point = ele.getLocation();
		int width = ele.getSize().getWidth();
		int height = ele.getSize().getHeight();
		BufferedImage secondimage = Fullimg.getSubimage(point.getX(), point.getY(), width, height);
		ImageIO.write(secondimage, "jpg", screenshot);
		
		File f = new File("E:\\Java Lectures\\SeleniumTesting\\New folder\\logo.jpg");
		FileUtils.copyFile(screenshot, f);
	}

}
