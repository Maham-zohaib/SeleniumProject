package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_22{

	public static void main(String[] args) throws InterruptedException{
		//Functionality of the Go Button
		/*
		 Click leads tab link from Home Page
		 Select 'Todays leads'
         Login to salesforce again
         Click leads tab link from Home Page
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

		WebElement todaylead = dr.findElement(By.xpath("//*[@id=\"fcf\"]/option[4]"));
		todaylead.click();
		
		
		
		
		
		Thread.sleep(3000);
		
		WebElement usermenu = dr.findElement(By.id("userNav"));
		usermenu.click();
		
		WebElement logout = dr.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		logout.click();
		
		Thread.sleep(5000);
		
		WebElement uname = dr.findElement(By.id("username"));
		uname.sendKeys("maham.mar21@abc.com");
		
	
		WebElement pass = dr.findElement(By.id("password"));
		pass.sendKeys("Haider123!");
		
		
		WebElement Login = dr.findElement(By.xpath("//*[@id=\"Login\"]"));
		Login.click();
		
		Thread.sleep(3000);
		WebElement clickleadagain = dr.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		clickleadagain.click();
		
		Thread.sleep(3000);
		WebElement goButton = dr.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input"));
		goButton.click();
		
	}

}
