package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("http://www.echoecho.com/javascript4.htm");

		driver.findElement(By.xpath("//input[@value='confirm box']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();
	}

}
