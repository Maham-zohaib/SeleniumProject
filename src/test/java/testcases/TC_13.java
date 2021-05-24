package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_13 {

	public static void main(String[] args) throws InterruptedException {
		//Merge accounts
		/*
		 * Launch and Login 
         Click on Accounts link on the home page
         Select accounts to merge
         Merge accounts
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
		
		
		WebElement mergeacc = dr.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
		mergeacc.click();
	
		Thread.sleep(3000);
		
		WebElement findaccounttxt = dr.findElement(By.id("srch"));
		findaccounttxt.sendKeys("jan");
		
		
		WebElement findaccount = dr.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]"));
		findaccount.click();
	
		WebElement nextb = dr.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]"));
		nextb.click();

		WebElement merge = dr.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[2]"));
		merge.click();	
		
		
	}

}
