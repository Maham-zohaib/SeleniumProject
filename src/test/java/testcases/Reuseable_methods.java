package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reuseable_methods {

	public static void initialize() {
		
		
		WebDriver dr;
		
		WebDriverManager.chromiumdriver().setup();
		
		dr = new ChromeDriver();
		
		dr.get("https://login.salesforce.com");
	     dr.manage().window().maximize();	
	}
	
	  public static void login() {
		  
		 
		  
		  
	  }
	
	
	
	
	
	
	public static void main(String[] args) {
		
		initialize();
		

	}

}
