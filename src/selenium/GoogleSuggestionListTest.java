package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Canada");
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.)
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(suggestion.size());
		
		for(WebElement s:suggestion) {
			System.out.println(s.getText());
		}
	}

}
