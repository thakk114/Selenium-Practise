package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smitt\\OneDrive\\Desktop\\qa\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=rUFxO604fgU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiclVGeE82MDRmZ1UiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYxNTA1MzE1NSwiaWF0IjoxNjE1MDUxOTU1LCJqdGkiOiI1MDEyYmRlYi1hNjQyLTRhOTAtODdiNC1mNDIxMDJkZjRjYTIiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.gYaI40LFGdtZKFlbE7-qfZ2oQnwml1N3jXR_8xiIh_th2yDjRWOFIkMF2M2yn4jg1SsX_ucSiTmr9FkET7wKGRbt8AMwJ7RbaFTzQ81g8iYaMlMbhwlHyU5MvUziWS2lihyew0JFaKjU4w55xIPvKPKYoPp6Ys4NsweXXVXH5QxIUxc9MsS5NMZRpX7nAqZQxFNlQQYLk5CLx4qpIYX_A08WQlxuDRAZA5DKBRy7Ch2sBHx__Bifcs34LpyiBQS2nfz2Ly_a88qvBGPvK-WfT1R3BN9DfomwDhiU5pZnoYy8pwoF2vuWUq8h63vkz2xIjkqTdBAA-aYz65ZJTAEDsw&preferred_environment=");
		
		WebElement email = driver.findElement(By.id("usernameInput-input"));
		email.sendKeys("email");
		
		WebElement password = driver.findElement(By.id("password-input"));
		password.sendKeys("password");
		
		WebElement login = driver.findElement(By.id("signIn"));
		login.click();

	}

}
