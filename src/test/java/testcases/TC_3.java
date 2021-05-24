package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// Test the remember username check box 
/*
     Launch SFDC application
     Login to SFDC with remember username check box checked
     Log out of SFDC
     Check for Username field
 */
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		
		dr = new ChromeDriver();
		dr.get("https://login.salesforce.com");
		
		dr.manage().window().maximize();
		
		WebElement username = dr.findElement(By.id("username"));
		username.sendKeys("maham.mar21@abc.com");
		
	
		WebElement pas = dr.findElement(By.id("password"));
		 pas.sendKeys("Haider123!");
		 
		 
		 WebElement rembme = dr.findElement(By.name("rememberUn"));
		 rembme.click();
		
		
		WebElement login = dr.findElement(By.xpath("//*[@id=\"Login\"]"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement usermenu = dr.findElement(By.id("userNav"));
		usermenu.click();
		
		WebElement logout = dr.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		logout.click();
		
	
	
		
	
	
	
		
		
		
		
		
		
	}

}
