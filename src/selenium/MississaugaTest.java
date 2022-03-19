package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.mississauga.ca/");
		
		driver.findElement(By.xpath("(//button[@class=\"dropdown-toggle\"])[3]")).click();
	    List<WebElement> organization = driver.findElements(By.xpath("//li[@class='dropdown nav-link show']/ul/li"));
	    System.out.println(organization.size());
	    for(WebElement o:organization) {
	    	System.out.println(o.getText());
	    	if(o.getText().equals("Jobs and volunteer")) {
	    		o.click();
	    		break;
	    	}
	    }
		

	}

}
