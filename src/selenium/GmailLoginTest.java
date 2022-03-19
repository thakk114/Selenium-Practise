package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("AXACVWVERV");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		String actualerrormsg = driver.findElement(By.xpath("//div[@jsname='B34EJ']")).getText();
		//System.out.println(errormsg);
		
	 	String expectederrormsg = "Couldn't find your Google Account";
	 	
	 	if (expectederrormsg.equals(actualerrormsg)) {
	 		System.out.println("test pass");
	 	}
	 	
	 	else {
	 		System.out.println("Test fail");
	 	}
	}

}
