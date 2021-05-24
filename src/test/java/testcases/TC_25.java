package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_25 {

	public static void main(String[] args) throws InterruptedException {
		//Create new contact
		/*
		 Launch and Login 
         Click Contact Tab
         Click New Button
         Enter Last name
         Enter Account Name
         Click On Save
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
	
		WebElement newContact = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		newContact.click();
		
		
		WebElement lastName = dr.findElement(By.id("name_lastcon2"));
		lastName.sendKeys("sappal");
		
		WebElement accountName = dr.findElement(By.id("con4"));
		accountName.sendKeys("jan 2021 account");
		
		Thread.sleep(4000);
		WebElement saveB = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
		saveB.click();
	
	}

}
