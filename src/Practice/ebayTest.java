package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ebayTest {
	
	public WebDriver driver;
	Properties p;
	String email;
	String password;

	@BeforeMethod	
	
	public void BeforeMethod() throws IOException {
		
			FileInputStream fis = new FileInputStream("C:\\Users\\smitt\\eclipse-workspace\\Selenium_prectrice\\prop.properties");
			p =new Properties();
			p.load(fis);
			email = p.getProperty("email");
			password = p.getProperty("password");
			
			String browser = p.getProperty("browser");
			
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\chromedriver.exe");	
				driver =new ChromeDriver();
				
			}else {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.get(p.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("a[class='login']")).click();
			
	}

	@Test 
	public void createUser() throws InterruptedException {
		
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.cssSelector("label[for = \"id_gender1\"]")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("abcd");
		driver.findElement(By.id("customer_lastname")).sendKeys("xyzacc");
		String emailvalue = driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals(email, emailvalue);
		driver.findElement(By.id("passwd")).sendKeys("password");
		
		driver.findElement(By.id("days")).sendKeys("10");
		
		List<WebElement> monts = driver.findElements(By.cssSelector("select[id='months'] option"));
		Thread.sleep(2000L);
		for(WebElement m:monts) {
			if(m.getText().equals("January ")) {
				m.click();
			}
		}
		
		List<WebElement> years = driver.findElements(By.cssSelector("select[id='years'] option"));
		Thread.sleep(2000L);
		for(WebElement y:years) {
			if(y.getText().equals("2017  ")) {
				y.click();
			}
		}
		
		driver.findElement(By.id("firstname")).sendKeys("abcd");
		driver.findElement(By.id("lastname")).sendKeys("xyzacc");
		driver.findElement(By.id("address1")).sendKeys("abczzzzzzz");
		driver.findElement(By.id("city")).sendKeys("abczyx");
		
		List<WebElement> state = driver.findElements(By.cssSelector("select[id='id_state'] option"));
		Thread.sleep(2000L);
		for(WebElement s:state) {
			if(s.getText().equals("Arizona")) {
				s.click();
			}
		}
		
		driver.findElement(By.id("postcode")).sendKeys("12345");
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		
		driver.findElement(By.id("submitAccount")).click();

		//String expectederrorMessage = "Invalid email address."; 
		//String actualErrorMessage = driver.findElement(By.cssSelector("div[id='create_account_error'] ol li")).getText();
	}

//	@Test(priority = 2)
//	public void 
}
