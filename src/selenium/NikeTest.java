package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		
		WebElement men = driver.findElement(By.linkText("Men"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(men).build().perform();

		Thread.sleep(2000);
		
	//	List<WebElement> shoes = driver.findElements(By.xpath("(//div[@class='pre-columns-container ncss-row'])[2]/div[2]/a"));
		List<WebElement> shoes = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		
		
		System.out.println(shoes.size());
		for(WebElement s:shoes) {
			System.out.println(s.getText());
		}
		
	}

}
