package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_11 {

	public static void main(String[] args) throws InterruptedException {
		//Create new view
		/*
		 Launch and Login 
         Click on Accounts link on the home page
         Click on create new view link on accounts page
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
		
		WebElement account = dr.findElement(By.id("Account_Tab"));
		account.click();
		
		Thread.sleep(3000);
		
		WebElement viewaccount = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
		viewaccount.click();
		
		WebElement viewname = dr.findElement(By.id("fname"));
		viewname.sendKeys("abc");

		
		WebElement viewUname = dr.findElement(By.id("devname"));
		viewUname.sendKeys("defg");
		
		WebElement saveviewname = dr.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
		saveviewname.click();
		
	}

}
