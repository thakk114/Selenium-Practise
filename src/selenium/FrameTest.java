package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
		List<WebElement> a = driver.findElements(By.xpath("//a[@href='https://jqueryui.com/sortable/']"));
		Thread.sleep(2000);
		System.out.println(a.size());
		if(a.size()>0) {
			System.out.println("sortable is present");
		}else {
			System.out.println("sortable is not present");
		}
	
		List<WebElement> b = driver.findElements(By.id("draggable"));
		Thread.sleep(2000);
		System.out.println(b.size());
		if(b.size()>0) {
			System.out.println("draggable is present");
		}else {
			System.out.println("draggable is not present");
		}
		
		
	//	WebElement frame1 = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(0); // with index
		//driver.switchTo().frame(frame1); // with WebElement
	
		System.out.println("----------After Switching to frame----------");
		
		Thread.sleep(2000);
		 a = driver.findElements(By.xpath("//a[@href='https://jqueryui.com/sortable/']"));
		Thread.sleep(2000);
		System.out.println(a.size());
		if(a.size()>0) {
			System.out.println("sortable is present");
		}else {
			System.out.println("sortable is not present");
		}
	
		 b = driver.findElements(By.id("draggable"));
		Thread.sleep(2000);
		System.out.println(b.size());
		if(b.size()>0) {
			System.out.println("draggable is present");
		}else {
			System.out.println("draggable is not present");
		}
	
		driver.switchTo().defaultContent();
		System.out.println("------------Switch to main----------------");
		
		Thread.sleep(2000);
		 a = driver.findElements(By.xpath("//a[@href='https://jqueryui.com/sortable/']"));
		Thread.sleep(2000);
		System.out.println(a.size());
		if(a.size()>0) {
			System.out.println("sortable is present");
		}else {
			System.out.println("sortable is not present");
		}
	
		 b = driver.findElements(By.id("draggable"));
		Thread.sleep(2000);
		System.out.println(b.size());
		if(b.size()>0) {
			System.out.println("draggable is present");
		}else {
			System.out.println("draggable is not present");
		}
		
		
		
		
		driver.switchTo().parentFrame(); // to go back to parent frame from child frame
	
	}

}
