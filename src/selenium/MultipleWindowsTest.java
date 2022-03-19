package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[href='https://moodle.cestarcollege.com/moodle/mod/url/view.php?id=103521']")).click();
		Set<String> allwindows = driver.getWindowHandles();
		
		Iterator<String> it = allwindows.iterator();
		
		String parentwindow = it.next();
		String childwindow	= it.next();	
		 
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
	}

}
