package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/"); //Driver.get and driver.navigate.to() is the same method.
		//We can use .navigate for some other things like forward the page refresh the page while Driver.get is final method
	}

}
