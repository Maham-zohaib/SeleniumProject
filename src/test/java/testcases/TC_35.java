package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_35 {

	public static void main(String[] args) throws InterruptedException {
		//Verify the tab customization
		/*
		 Launch and Login
		 Click + tab
         Click 'Customize My Tabs' button
         Remove any tab
         Click on Save
         Click on Logout.
         Launch and Login 
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
		
		WebElement plusIcon = dr.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[9]/a"));
		plusIcon.click();
		
		Thread.sleep(3000);
		WebElement customizeMyTab = dr.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/table/tbody/tr/td[2]/input"));
		customizeMyTab.click();
		
		
		WebElement selectedTab = dr.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[2]/table/tbody/tr[4]/td/div/table/tbody/tr/td[3]/select/option[4]"));
		selectedTab.click();
		
		WebElement remove = dr.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[2]/table/tbody/tr[4]/td/div/table/tbody/tr/td[2]/div[3]/a"));
		remove.click();
		
		
		WebElement saveB = dr.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		saveB.click();

		Thread.sleep(3000);
		
		WebElement usermenu = dr.findElement(By.id("userNav"));
		usermenu.click();
		
		WebElement logout = dr.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		logout.click();
		
		
		Thread.sleep(3000);
		
		WebElement uname = dr.findElement(By.id("username"));
		uname.sendKeys("maham.mar21@abc.com");
		
	
		WebElement pass = dr.findElement(By.id("password"));
		 pass.sendKeys("Haider123!");
		
		
		WebElement Login = dr.findElement(By.xpath("//*[@id=\"Login\"]"));
		Login.click();
}

}
