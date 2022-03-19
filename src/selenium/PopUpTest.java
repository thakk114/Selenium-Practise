package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
		List<WebElement> popup1  = driver.findElements(By.cssSelector("img[class='btn-close']"));
		List<WebElement> popup2  = driver.findElements(By.cssSelector("img[class='_24EHh']"));
		if(popup1.size()>0) {
			popup1.get(0).click();
		}
		
		if(popup2.size()>0) {
			popup2.get(0).click();
		}

		driver.findElement(By.id("search-key")).sendKeys("laptop");
		
	}

}
