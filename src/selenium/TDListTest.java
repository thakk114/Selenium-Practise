package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		System.out.println(links.size());
		
		for(WebElement l:links) {
			System.out.println(l.getText());
		}
		
	}

}
