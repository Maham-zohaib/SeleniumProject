package seleniumTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {

	public static void main(String[] args) {
		
		//How to launch browser and  maximize window size

		WebDriver dr;

		WebDriverManager.chromedriver().setup();

		dr = new ChromeDriver();

		dr.manage().window().maximize();  	//to maximize window, add this code before web URL

		dr.get("https://login.salesforce.com/");
		
		WebElement username = dr.findElement(By.id("username"));
		username.sendKeys("maham.mar21@abc.com");
		
		
		WebElement pas = dr.findElement(By.id("password"));	
		pas.sendKeys("Haider123!");
		
		WebElement login = dr.findElement(By.xpath("//*[@id=\"Login\"]"));	
		login.click();
		
	}	

	}
