package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("aahjj");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		WebElement monthbox = 	driver.findElement(By.id("month"));
		WebElement datebox = 	driver.findElement(By.id("day"));
		WebElement yearbox = 	driver.findElement(By.id("year"));
		Select month  = new Select(monthbox);
		Select date = new Select(datebox);
		Select year = new Select(yearbox);
		
		month.selectByValue("7");
		date.selectByIndex(9);
		year.selectByVisibleText("2000");
		
	//	driver.findElement(By.xpath("//input[@value='2']")).click();
		
		List<WebElement> a = driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
	
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getText().equals("Male")) {
				a.get(i).click();
			}
		}
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
