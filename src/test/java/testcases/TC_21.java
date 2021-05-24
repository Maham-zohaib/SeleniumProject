package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_21 {

	public static void main(String[] args) throws InterruptedException {
		//Validate 'View' drop down list contents
		/*
		 Click leads tab link from Home Page
         click drop down list
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
		
		WebElement leaddropdown = dr.findElement(By.className("bFilter"));
		leaddropdown.click();
	
	
	}

}
