package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_24 {

	public static void main(String[] args) throws InterruptedException {
		//Check "New" button on Leads Home
		/*
		 Link should navigate to Leads Home page
         click on the new button displayed in the Recent Leads frame
         enter "ABCD" in the last name field 
         enter "ABCD" in the company name field
         click on the save button
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
		
		WebElement lead = dr.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		lead.click();
		
		Thread.sleep(5000);
		
		WebElement newlead = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		newlead.click();
				
		
		WebElement lastname = dr.findElement(By.id("name_lastlea2"));
		lastname.sendKeys("ABCD");
				
		WebElement companyname = dr.findElement(By.id("lea3"));
		companyname.sendKeys("ABCD");
		
		
		WebElement saveB = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
		saveB.click();
		
		
		
		
	}

}
