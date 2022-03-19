package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahhoSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.id("header-search-input")).sendKeys("canada");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@class='Bdc($c-fuji-grey-d) Bdts(n) Bds(s) Bdw(1px) M(0) P(0)']/li"));
		System.out.println(suggestion.size());
		
		for(WebElement s:suggestion) {
			System.out.println(s.getText());
		}

	}

}
