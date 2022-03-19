package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en/account-login");
		
		driver.findElement(By.id("login-email")).sendKeys("somethimg@something.com");
		driver.findElement(By.id("login-password")).sendKeys("Password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		String expectederror = "Incorrect email/password – please check and retry";
		String actualerror = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();

		if(expectederror.equals(actualerror)) {
			
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fail");
		}
	}

}
