package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		FileInputStream f = new FileInputStream("C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		
		
		
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("vfdvfdbdvfdb");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("vfdvfdbdvfdb");
		driver.findElement(By.id("pass")).sendKeys("bbbbbbbb");
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_d_')]")).click();


	}

}
