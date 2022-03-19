package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("vfdvfdbdvfdb");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("vfdvfdbdvfdb");
		driver.findElement(By.id("pass")).sendKeys("bbbbbbbb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'u_0_d_')]")).click();

		
	}

}
