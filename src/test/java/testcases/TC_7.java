package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_7 {

	public static void main(String[] args) throws InterruptedException {
		//Select "My settings" option from user menu for <username> drop down
		/*
		  Select user menu for <username> drop down[TC01]
          Click "My Settings" option from user menu
          Click on personal link and select Login History link. 
          Click on Display & Layout link
          Click on Email link and click on my email settings link under that
          Click on Calendar & Remainders
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
		
		WebElement mysettings = dr.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
		mysettings.click();
		
		Thread.sleep(3000);
		/* 
		 * Click on Personal 
		 * 
		WebElement personal = dr.findElement(By.id("PersonalInfo"));
		personal.click();
		
		WebElement loghistory = dr.findElement(By.id("LoginHistory_font"));
		loghistory.click();
		
		WebElement downloadh = dr.findElement(By.className("pShowMore"));
		downloadh.click();
	*/
		/*
		 * Click on Display and layout
		 *
		
		WebElement display = dr.findElement(By.id("DisplayAndLayout"));
		display.click();
	
		WebElement custamizetab = dr.findElement(By.id("CustomizeTabs_font"));
		custamizetab.click();
		
		WebElement dropdown = dr.findElement(By.id("p4"));
		dropdown.click();
		
		WebElement sfchatter = dr.findElement(By.xpath("//*[@id=\"p4\"]/option[9]\n"));
		sfchatter.click();
		
		WebElement report = dr.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[72]"));
		report.click();
		
		WebElement add = dr.findElement(By.id("duel_select_0_right"));
		add.click();
		
		
		WebElement save = dr.findElement(By.name("save"));
		save.click();
		
		*/
		
	   /*
		* Click on Email and Email setting
		*  
		WebElement email = dr.findElement(By.id("EmailSetup"));
		 
		email.click();
		
		WebElement emailsetting = dr.findElement(By.id("EmailSettings_font"));
		emailsetting.click();
		
		WebElement emailname = dr.findElement(By.id("sender_name"));
		emailname.sendKeys("Maham Sappal");;
		
		WebElement emailadd = dr.findElement(By.id("sender_email"));
		emailadd.sendKeys("zohaibmaham@gmail.com");
		
		WebElement clickb = dr.findElement(By.id("auto_bcc1"));
		clickb.click();
		
		WebElement save = dr.findElement(By.name("save"));
		save.click();
		*/
	
		/*
		 * Click on Calendar & Remainders
		 * 
		 */
		
		WebElement calender = dr.findElement(By.id("CalendarAndReminders"));
		calender.click();
		
		WebElement activityrem = dr.findElement(By.id("Reminders_font"));
		activityrem.click();
		
		WebElement opentestrem = dr.findElement(By.id("testbtn"));
		opentestrem.click();
		
		
	}

}
