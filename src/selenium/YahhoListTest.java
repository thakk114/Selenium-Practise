package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahhoListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		WebElement Trendinglist = driver.findElement(By.xpath("//li[@class='trending-list']"));
		List<WebElement> Trendinglistlink = Trendinglist.findElements(By.tagName("a"));
		System.out.println(Trendinglistlink.size());
	//	for (int i=0; i<Trendinglistlink.size();i++) {
		//	System.out.println(Trendinglistlink.get(i).getText());
			
			
		for (WebElement links : Trendinglistlink)	{
			
			System.out.println(links.getText());
		}
			
			
	//	}
	}

}
