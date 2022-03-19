package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");
		driver.findElement(By.partialLinkText("bou")).click();
		
		Thread.sleep(2000);
		
		String expectedtitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		
		String expectedURL = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String currentURL = driver.getCurrentUrl();
		
		if (expectedtitle.equals(actualTitle) & expectedURL.equals(currentURL)){
			System.out.println("Test pass");
		}
		
		else {
			System.out.println("Test fail");
		}
	
	}

}
