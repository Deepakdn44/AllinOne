import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotwithAshot {
	
	public static WebDriver driver;
	public static void takeScreenshot() throws IOException {
		Date d = new Date();
		String date = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		ru.yandex.qatools.ashot.Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "jpg", new File("E:\\Java Lectures\\SeleniumTesting\\New folder\\"+date));
	}
	public static void takeElementScreenshot(WebElement ele) throws IOException {
		Date d = new Date();
		String date = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		ru.yandex.qatools.ashot.Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver, ele);
		ImageIO.write(screenshot.getImage(), "jpg", new File("E:\\Java Lectures\\SeleniumTesting\\New folder\\"+date));
	}

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div/header/div[2]/div/div[1]/a/img"));
		//takeScreenshot();
		takeElementScreenshot(ele);
	}

}
