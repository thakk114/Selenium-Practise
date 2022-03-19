package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> rediobutton = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(rediobutton.size());
		for(int i=0;i<rediobutton.size();i++) {
			System.out.println(rediobutton.get(i).getAttribute("value")+"----------"+rediobutton.get(i).isSelected());
			
			if(rediobutton.get(i).getAttribute("value").equals("Cheese")) {
				rediobutton.get(i).click();
			}

		}
		// driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		 System.out.println("-------After select--------");
			for(int i=0;i<rediobutton.size();i++) {
				System.out.println(rediobutton.get(i).getAttribute("value")+"----------"+rediobutton.get(i).isSelected());
			}
	}

}
