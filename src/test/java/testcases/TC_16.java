package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_16 {

	public static void main(String[] args) throws InterruptedException {
		//Create a new Opty
		/*
		 Launch and Login 
         Click on opportunities link
         Click on the New button to create new Opty
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
		
		WebElement oppo = dr.findElement(By.id("Opportunity_Tab"));
		oppo.click();
		
		Thread.sleep(3000);
		WebElement oppodropdown = dr.findElement(By.className("bFilter"));
		oppodropdown.click();
		
		WebElement newoppo = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		newoppo.click();
		
		WebElement newopponame = dr.findElement(By.id("opp3"));
		newopponame.sendKeys("hello01234");
		
		WebElement newoppoaccountname = dr.findElement(By.id("opp4"));
		newoppoaccountname.sendKeys("welcom123");
		
		WebElement closedate = dr.findElement(By.xpath("//*[@id=\"opp9\"]"));
		closedate.sendKeys("7/22/2021");
		
		WebElement stage = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[4]/td[4]/div/span/select/option[2]"));
		stage.click();
		
		WebElement Probability = dr.findElement(By.id("opp12"));
		Probability.clear();
		Probability.sendKeys("10");
	
		
		WebElement leadsource = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[6]/td[2]/span/select/option[2]"));
		leadsource.click();
		
		WebElement Campaignsource = dr.findElement(By.id("opp17"));
		Campaignsource.sendKeys("hello hi");
		
		
		
		
		
	}

}
