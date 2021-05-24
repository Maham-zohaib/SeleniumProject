package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_33 {

	public static void main(String[] args) throws InterruptedException {
		//Verify if the firstname and lastname of the loggedin user is displayed
		/*
		 Launch and Login 
         Click Home Tab
         Click on the FirstName LastName link in the home page
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
		
		Thread.sleep(5000);
		
		WebElement homeTab = dr.findElement(By.id("home_Tab"));
		homeTab.click();
		
		
		WebElement userNameLink = dr.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		userNameLink.click();
		
		
	}

}
