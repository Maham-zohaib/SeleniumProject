package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_4B {

	public static void main(String[] args) {
		/*Launch the application
		 * Enter Wrong USerName
		 * Enter wrong PWd
		 * Click login
		 */
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		
		dr = new ChromeDriver();
		dr.get("https://login.salesforce.com");
		
		
		WebElement username = dr.findElement(By.id("username"));
		username.sendKeys("123");
		
	
		WebElement pas = dr.findElement(By.id("password"));
	     pas.sendKeys("22131");
		
		
		WebElement login = dr.findElement(By.xpath("//*[@id=\"Login\"]"));
		login.click();
		
	}

}
