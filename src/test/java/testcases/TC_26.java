package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_26 {

	public static void main(String[] args) throws InterruptedException {
		//Create new view in the Contact Page
		/*
		 * Launch and Login 
         Click Contact Tab
         Click Create new View
         Enter View Name
         Enter View Unique Name
         Click on Save
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
		
		WebElement creatNewView = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
		creatNewView.click();
		
		WebElement viewName = dr.findElement(By.id("fname"));
		viewName.sendKeys("efgh");
		
		WebElement viewUniqeName = dr.findElement(By.id("devname"));
		viewUniqeName.sendKeys("hijk");
		
		WebElement saveB = dr.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
		saveB.click();
		
		
	}

}
