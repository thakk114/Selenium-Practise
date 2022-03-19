package Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpidiaTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait web = new WebDriverWait(driver, 10);
		
		driver.get("https://www.expedia.ca/");
		driver.findElement(By.xpath("//a[@href='?pwaLob=wizard-flight-pwa']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Leaving from']")).click();
		driver.findElement(By.id("location-field-leg1-origin")).sendKeys("yyz");
		//Thread.sleep(2000);
		List<WebElement> origincities = driver.findElements(By.xpath("//div[@class='truncate']/span/strong"));
		//System.out.println(cities);
		for(WebElement origincity:origincities) {
		//	System.out.println(city.getText());
		if(origincity.getText().contains("YYZ")) {
			System.out.println(origincity.getText());
			origincity.click();
			}
		}
	
		driver.findElement(By.xpath("//button[@aria-label='Going to']")).click();
		driver.findElement(By.id("location-field-leg1-destination")).sendKeys("amd");
		List<WebElement> destinationcities = driver.findElements(By.xpath("//div[@class='truncate']/span/strong"));

		Thread.sleep(2000);

		for(WebElement destinationcity:destinationcities) {
		//	System.out.println(city.getText());
		if(destinationcity.getText().contains("AMD")) {
			System.out.println(destinationcity.getText());
			destinationcity.click();
			}
		}
		
		driver.findElement(By.xpath("//a[@data-testid='travelers-field']")).click();
		//Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='uitk-flex uitk-flex-align-items-center uitk-flex-justify-content-space-between uitk-step-input adultStepInput uitk-step-input-mounted']/div/button[2]")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='guests-done-button']")).click();

		
		driver.findElement(By.id("d1-btn")).click();
		//Thread.sleep(2000);
			
		String startdate =  driver.findElement(By.cssSelector("td[class='uitk-date-picker-day-number start startSelected']")).getText();
		
		System.out.println(startdate);
		
		
		/*List<WebElement> dates = driver.findElements(By.xpath("//td[@class='uitk-date-picker-day-number']"));
		
		for(WebElement date:dates) {
			if(date.getAttribute("aria-label").contains("Mar 31, 2021"))
			System.out.println(date.getAttribute("aria-label"));
			//date.click();
		//	Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
		}*/
		
		//driver.findElement(By.xpath("//button[@data-testid='submit-button']")).click();
		
		
	File scr  = driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr , new File("C:\\Users\\smitt\\eclipse-workspace\\Selenium_prectrice/ScreenShots/screeshot.png"));
	}

}
