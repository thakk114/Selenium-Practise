package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.partialLinkText("Electronics"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(electronics).click().build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> electronicsCategories = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		
		System.out.println(electronicsCategories.size());
		for (WebElement e:electronicsCategories) {
			System.out.println(e.getText());
		}

	}

}
