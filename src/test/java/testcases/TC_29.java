package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_29 {

	public static void main(String[] args) throws InterruptedException {
		//View a contact in the cotact Page
		/*
		 Launch and Login 
         Click Contact Tab
         Click on a contact name
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
		
		Thread.sleep(5000);
		
		WebElement contactName = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
		contactName.click();
		
		
	}

}
