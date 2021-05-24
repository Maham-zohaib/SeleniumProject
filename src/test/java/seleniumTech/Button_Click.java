package seleniumTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_Click {

	public static void main(String[] args) {
		// How to click button on website in automation and enter txt in txtbox
		
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
        dr.manage().window().maximize();
		dr.get("https://login.salesforce.com");
		
		//here we are sending txt to username txtfield
        WebElement username = dr.findElement(By.name("username"));
        username.sendKeys("Maham.Mar21abc.com");
       
      //here we are sending txt to passwoed txtfield
        WebElement psw = dr.findElement(By.name("pw"));
        psw.sendKeys("Haider123!");
        
        
        //clickking on button
		
		WebElement login = dr.findElement(By.name("Login"));
		login.click();
		
		
		
	}

}
