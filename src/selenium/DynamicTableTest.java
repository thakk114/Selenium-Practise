package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		for(int i=2;i<=rows.size();i++) {
		//System.out.println(r.getText());
			for(int j=1;j<=columns.size();j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText()+"   |   ");
			}
			System.out.println();
		}

		

	}

}
