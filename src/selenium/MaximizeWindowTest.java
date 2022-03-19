package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.ca/");
		driver.findElement(By.partialLinkText("bou")).click();
		driver.manage().window().maximize();

	}

}
