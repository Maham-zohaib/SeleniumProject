package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_4A {

	public static void main(String[] args) {
		//Test forgot password
		/*
		 * Launch SFDC application
		 * Click on Forgot password
		 * test forget password
		 */
		
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		
		dr = new ChromeDriver();
		dr.get("https://login.salesforce.com");
		
		WebElement frgtpas = dr.findElement(By.id("forgot_password_link"));
				frgtpas.click();
		
		
				WebElement username = dr.findElement(By.id("un"));
				username.sendKeys("maham.mar21@abc.com");
				
				WebElement cont  = dr.findElement(By.id("continue"));
				cont.click();
		
		
	}

}
