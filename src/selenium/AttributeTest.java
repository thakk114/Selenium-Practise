package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder"); // to read default value in search box
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
	
		System.out.println(driver.findElement(By.id("gh-ac")).getAttribute("value")); // to read what you type
	
	}

}
