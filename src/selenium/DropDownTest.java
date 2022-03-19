package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		List<WebElement> option = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		System.out.println(option.size());

		for(WebElement dropdownoption : option) {
			
			if (dropdownoption.isSelected()) {
				System.out.println(dropdownoption.getText()+"-------"+dropdownoption.isSelected());
			}
		}
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);

			
				s.selectByIndex(2);
				Thread.sleep(2000);
				s.selectByValue("11232");
				Thread.sleep(2000);
				s.selectByVisibleText("Books");
				System.out.println("-----------After Select----------");
				for(WebElement dropdownoption : option) {
					if (dropdownoption.isSelected()) {
					System.out.println(dropdownoption.getText()+"-------"+dropdownoption.isSelected());
				}
		}
	
	}

}
