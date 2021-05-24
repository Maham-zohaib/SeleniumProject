package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_32 {

	public static void main(String[] args) throws InterruptedException {
		//Check the Save and New button works in New Contact page
		/*
		Login
        Home Page
        Contacts: Home Page
        Contact Edit: New Contact Page
        Click Save & New button
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
		
		
		WebElement contact = dr.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		contact.click();
	
		Thread.sleep(3000);
		
		WebElement contactEdit = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[1]"));
		contactEdit.click();
		
		//when click on edit there is no last name and account name txt box
	}

}
