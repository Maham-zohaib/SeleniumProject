package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_36 {

	public static void main(String[] args) throws InterruptedException {
		//Blocking an event in the calender
		/*
		Click Home Tab
        Click on the current date link
        Click on '8:00PM' link
        Click on 'Subject Combo' icon
        Click 'Other' from Combobox
        Click on the 'End' time field
        Select '9:00 PM' from the dropdown.
        Click Save button
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

		
		Thread.sleep(3000);
		
		WebElement currentDateLink = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[2]/a"));
		currentDateLink.click();
		
		
		WebElement click8pm = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/table/tbody/tr/td[1]/form/div[1]/div/div[1]/table/tbody/tr[2]/td[1]/div[29]/a"));
		click8pm.click();

		
		WebElement subjectCombo = dr.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div[1]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a"));
		subjectCombo.click();
		
		
		Set<String> windowHandles = dr.getWindowHandles();
	String	currentHandle = dr.getWindowHandle();
	windowHandles.remove(currentHandle);
	String newHandle = windowHandles.iterator().next();
	  dr.switchTo().window(newHandle);
		
	  WebElement other = dr.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
	other.click();
	
	
	dr.switchTo().window(currentHandle);
	Thread.sleep(2000);
	
	
	WebElement endTime = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div[1]/div[2]/div[4]/table/tbody/tr[3]/td[4]/div/span/span/input"));
	 endTime.click();
	
	 
	 WebElement click9pm = dr.findElement(By.id("timePickerItem_42"));
	 click9pm.click();
	
	 
	 WebElement saveB = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div[1]/div[1]/table/tbody/tr/td[2]/input[1]"));
	 saveB.click();
	
	}

}
