package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_10 {

	public static void main(String[] args) throws InterruptedException {
		//Create an Account
       /*
        Launch and Login 
        Click on Accounts link on the home page
        Click on the New button to create new account
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
		
		WebElement newaccount = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		newaccount.click();
		
		WebElement accountname = dr.findElement(By.id("acc2"));
		accountname.sendKeys("Momal Sappal");
		
		
		WebElement savenewacc = dr.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
		savenewacc.click();
		
		
		
		
		
		
	}

}
