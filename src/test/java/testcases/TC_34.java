package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_34 {

	public static void main(String[] args) throws InterruptedException {
		//Verify the edited lastname is updated at various places
		/*
		 Launch and login
		 Click Home Tab
         Click on the 'FirstName LastName' link in the home page
         Click on the 'Edit Profile' icon near Contact
         Click on the 'About' tab
         Edit 'Last Name' field.
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
		
		WebElement edit = dr.findElement(By.className("vfButtonBarButton"));
		edit.click();
		
		Thread.sleep(3000);
		dr.switchTo().frame("contactInfoContentId");
		
		Thread.sleep(3000);
		
		WebElement about = dr.findElement(By.id("aboutTab"));
		about.click();
		
		WebElement lname = dr.findElement(By.id("lastName"));
		lname.clear();
		
		lname.sendKeys("Abcd");
		
		Thread.sleep(2000);
		WebElement saveall = dr.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
		saveall.click();
	}

}
