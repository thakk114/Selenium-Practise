package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("vfdvfdbdvfdb");
		driver.findElement(By.id("pass")).sendKeys("bbbbbbbb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'u_0_d_')]")).click();
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scr, new File("C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\testing\\screenshot.png"));

	}

}
