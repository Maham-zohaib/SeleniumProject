package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_6 {

	public static void main(String[] args) throws InterruptedException {
		//Select "My Profile" option from user menu for <username> drop down
		/*
		 Select user menu for <username> drop down[TC01]
         Click "My profile" option from user menu
         Click on edit profile button to edit contact information
         Click on About tab
         Click on post link
         Click on file link
         Click on Add photo link
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
		
		WebElement myprofile = dr.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		myprofile.click();
		
		/*
		 * click on about code 
		 *
		
		Thread.sleep(3000);
		
		WebElement edit = dr.findElement(By.className("vfButtonBarButton"));
		edit.click();
		
		
		Thread.sleep(3000);
		dr.switchTo().frame("contactInfoContentId");
		
		WebElement about = dr.findElement(By.id("aboutTab"));
		about.click();
		
		
		WebElement lname = dr.findElement(By.id("lastName"));
		lname.clear();
		
		lname.sendKeys("Sappal");
		
		Thread.sleep(2000);
		WebElement saveall = dr.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
		saveall.click();
		*/
		
		/*
		 *CLICK ON POST CODE 
		 *
		Thread.sleep(3000);
		WebElement postlink = dr.findElement(By.id("publisherAttachTextPost"));
		postlink.click();
		
		WebElement postiframe = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/iframe"));
		dr.switchTo().frame(postiframe);
		
		WebElement postbody = dr.findElement(By.xpath("/html/body"));
		postbody.click();
		postbody.sendKeys("hello everyone");
		
		dr.switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		WebElement shareb = dr.findElement(By.xpath("//*[@id=\"publishersharebutton\"]"));
		shareb.click();
		System.out.println("posted text is shared");
		*/
	/*
	 * CLICK ON FILE LINK
	 */
	Thread.sleep(3000);
		
		WebElement file = dr.findElement(By.id("publisherAttachContentPost"));
		file.click();
		
		WebElement selectfile = dr.findElement(By.id("chatterUploadFileAction"));
		selectfile.click();
		
		WebElement chosefileframe = dr.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/form"));
		
		dr.switchTo().frame("chatterFileForm");
		
		WebElement chosefile = dr.findElement(By.id("chatterFile"));
		chosefile.sendKeys("/Users/Maham/Desktop");
	
	}

}
