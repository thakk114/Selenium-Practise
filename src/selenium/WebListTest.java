package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a")) ;  // WebElements dose will not give any error if it is not present in the html 
		System.out.println(alllinks.size());
		for(int i =0 ; i<alllinks.size();i++) {
			// System.out.println(alllinks.get(i).getText());
			}
	
		 WebElement footer =	driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		 List<WebElement> footerlinks = footer.findElements(By.tagName("a"));
		 System.out.println(footerlinks.size());
		 
		 for(int i =0 ; i<footerlinks.size();i++) {
				// System.out.println(footerlinks.get(i).getText());
				}
		 
		 List<WebElement> leftfooterlinks =	driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
	//	 List<WebElement> leftfooterlinks = leftfooter.findElements(By.tagName("a"));
		 System.out.println(leftfooterlinks.size());
		 
		 for(int i =0 ; i<leftfooterlinks.size();i++) {
				 System.out.println(leftfooterlinks.get(i).getText());
				}
	}
}
