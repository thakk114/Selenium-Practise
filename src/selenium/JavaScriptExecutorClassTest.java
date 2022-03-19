package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		WebElement aboutus = driver.findElement(By.linkText("About Us"));
		
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0,4000)");
		
	//	jse.executeScript("arguments[0].scrollIntoView(true)", aboutus);
		//aboutus.click();

		
		jse.executeScript("arguments[0].click()", aboutus);
		
	}

}
