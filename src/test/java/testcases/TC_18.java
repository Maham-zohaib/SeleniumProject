package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_18 {

	public static void main(String[] args) throws InterruptedException {
		//Test Stuck Opportunities Report
		/*
		 Launch and Login 
         Click on opportunities link
         Click on Stuck Opportunities link  
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
		
		Thread.sleep(3000);
		
		WebElement Stuckoppolink = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
		Stuckoppolink.click();
		
		
	
		
		
		
		
	}

}
