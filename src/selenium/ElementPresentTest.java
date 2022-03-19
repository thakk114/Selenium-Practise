package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.ca/");
		//if(driver.findElement(By.partialLinkText("bou")).isDisplayed()) {    // Using Webelement we can not verify if element is present or not as it will give error if it is not present
			//System.out.println("Element is Present");
		//}else {
			//System.out.println("Element is not present");
		//}
		
		List<WebElement> element = driver.findElements(By.partialLinkText("b bdfb fdgbou")); // Always use list to check if Element is present or not
		if(element.size()>0) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is not present");
		}
	}

}
