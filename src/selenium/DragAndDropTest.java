package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions a = new Actions(driver);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(draggable, droppable).build().perform();
		String Expextedresult = "Dropped!";
		String result = droppable.getText(); 
		if (Expextedresult.equals(result)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail!!"); 
		}
		
		
	}

}
