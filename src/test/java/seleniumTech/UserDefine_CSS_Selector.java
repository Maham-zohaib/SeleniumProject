package seleniumTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserDefine_CSS_Selector {

	public static void main(String[] args) {
		// we creat user define CSS-SELECTOR
		// tagname operator attribute
		// for example : tagname ----> a, input 
		// oper : there are 2 types of opr
		// # ---> id
		// . ---> classname, name 
		// attribute is the vale of that particuler attribute
		
		
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		 dr = new ChromeDriver();
		 dr.manage().window().maximize();
		 dr.get("https://login.salesforce.com");
		 
		 WebElement username = dr.findElement(By.cssSelector("input.username"));
		 username.sendKeys("maham.mar21@abc.com");
		 
		 WebElement login = dr.findElement(By.cssSelector("input#Login"));
		 login.click();
		 
	}

}
