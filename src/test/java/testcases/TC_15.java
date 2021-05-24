package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_15 {

	public static void main(String[] args) throws InterruptedException {
		//Select user menu for <username> drop down
		/*
		 Launch and Login 
         Click on opportunities link
         Verify opportunities drop down is present
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
		
		
		WebElement login = dr.findElement(By.xpath("//*[@id=\"Login\"]"));
		login.click();
		
		WebElement oppo = dr.findElement(By.id("Opportunity_Tab"));
		oppo.click();
		
		Thread.sleep(5000);
		WebElement oppodropdown = dr.findElement(By.className("bFilter"));
		oppodropdown.click();
	

	}

}
