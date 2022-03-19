package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwordTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.get("https://www.google.ca/");
		driver.findElement(By.partialLinkText("bou")).click();
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		wait.until(ExpectedConditions.titleIs("Google"));
	
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		
		System.out.println(driver.getTitle());
	}

}
