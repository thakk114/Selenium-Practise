package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class factoryTest {

	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://factory.com/");
	
	List<WebElement> images = driver.findElements(By.xpath("//div[@class='holder']/div"));
	System.out.println(images.size());
	for(WebElement i:images) {
		System.out.println(i);
	}
	
		
	
	}

}
