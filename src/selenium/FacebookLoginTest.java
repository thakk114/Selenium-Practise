package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("vfdvfdbdvfdb");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("vfdvfdbdvfdb");
		driver.findElement(By.id("pass")).sendKeys("bbbbbbbb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'u_0_d_')]")).click();

	}

}
