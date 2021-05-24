package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_8 {

	public static void main(String[] args) throws InterruptedException {
		//Select "Developers Console" option from user menu for <username> drop down
		/*
		 Select user menu for <username> drop down[TC01]
         Click on Developer Console link from the drop down
         Click on close button the developer console browser
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
		
		WebElement usermenu = dr.findElement(By.id("userNav"));
		usermenu.click();
		
		WebElement devcon = dr.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]"));
		devcon.click();
	    
		Thread.sleep(3000);
	    
		dr.close();
	//last step incomplete
	
	}

}
