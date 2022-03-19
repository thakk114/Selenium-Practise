package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(suggestion.size());
		
		for(WebElement s:suggestion) {
			System.out.println(s.getText());
		}


	}

}
