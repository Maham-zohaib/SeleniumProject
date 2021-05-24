package testcasesNG;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.UserMenuPage;

public class UserMenu_TestCasses extends BaseTest{

	@BeforeMethod
	public void CreateReport(Method sTestMethod) {
		test = extent.createTest(sTestMethod.getName());
	}
	
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		Thread.sleep(4000);
	driver.close();
		
	}
	
	@Parameters({"BrowserName"})
	@Test(priority = 1)
	public void SelectUserMenu (String BrowserName) throws IOException, InterruptedException {
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		UserMenuPage up = new UserMenuPage(driver);
		
	 if(oCommonUtilities.waitForElementVisible(up.Username))
	{
    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
	}
	 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
	test.info("Username is Entered");
	
	Thread.sleep(2000);
	
	if(oCommonUtilities.waitForElementVisible(up.Password))
	{
    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
	}
	sa.assertEquals(up.Password.getText(), "Haider123!");
	test.info("Password is Entered");
	
	Thread.sleep(2000);
    if(oCommonUtilities.waitForElementVisible(up.Login))
    {
    	up.Login.click();
    }
    	test.info("login button clicked");
    	
    	
    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
        {
        	up.UserMenu.click();
        }
        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
        test.info("Clicked on user menu");
        Thread.sleep(3000);
        
        test.pass("TC05 Passed");
        
    	}
	
	
	//----------TC 06---------//
	
	@Parameters({"BrowserName"})
	@Test(priority = 2)
	public void MyProfile_01(String BrowserName) throws IOException, InterruptedException {
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		UserMenuPage up = new UserMenuPage(driver);
		
		 if(oCommonUtilities.waitForElementVisible(up.Username))
			{
		    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
			}
			 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
			test.info("Username is Entered");
			
			Thread.sleep(2000);
			
			if(oCommonUtilities.waitForElementVisible(up.Password))
			{
		    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
			}
			sa.assertEquals(up.Password.getText(), "Haider123!");
			test.info("Password is Entered");
			
			Thread.sleep(2000);
		    if(oCommonUtilities.waitForElementVisible(up.Login))
		    {
		    	up.Login.click();
		    }
		    	test.info("login button clicked");
		    	
		    	
		    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
		        {
		        	up.UserMenu.click();
		        }
		        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
		        test.info("Clicked on user menu");
		        Thread.sleep(3000);
		        

		    	if(oCommonUtilities.waitForElementVisible(up.myprofile))
		        {
		        	up.myprofile.click();
		        }
		        sa.assertEquals(up.myprofile.isDisplayed(), up.myprofile.isSelected());
		        test.info("Clicked on myProfile");
		        Thread.sleep(3000);   
		        
		        
		        if(oCommonUtilities.waitForElementVisible(up.edit))
		        {
		        	up.edit.click();
		        }
		       test.info("Clicked on Edit icon");
		        Thread.sleep(3000);  
		        
		        
				driver.switchTo().frame("contactInfoContentId");
				
				
				 if(oCommonUtilities.waitForElementVisible(up.aboutTab))
			        {
			        	up.aboutTab.click();
			        }
			       test.info("Clicked on AboutTab");
		        Thread.sleep(2000);
		        
		        if(oCommonUtilities.waitForElementVisible(up.LastName))
		        {
		        	up.LastName.clear();
		        	up.LastName.sendKeys("Sappal");
		        	
		        }
		       test.info("Lastname Changed");
	              Thread.sleep(3000);
		       
	              if(oCommonUtilities.waitForElementVisible(up.AboutTabSaveButton))
		        {
		        	up.AboutTabSaveButton.click();
		        }
	             
		       test.info("Clicked on SavedButton");
		       Thread.sleep(2000);
		       //test.pass("TC06_A Passed");
	sa.assertAll();
	      WebElement UnTital = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("Username.tital.xpath")));
	      
	      if(UnTital.getText().endsWith("Sappal")) {
	    	  test.pass("TC06_A Passed");
	      }else {
	    	  test.fail("TC06_A Failed");
	    	  
	      }
	}
	
	//-----------TC-06_2
	@Parameters({"BrowserName"})
	@Test(priority = 3)
	public void MyProfile_02(String BrowserName) throws InterruptedException, IOException {
		
		
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		UserMenuPage up = new UserMenuPage(driver);
		
		 if(oCommonUtilities.waitForElementVisible(up.Username))
			{
		    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
			}
			 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
			test.info("Username is Entered");
			
			Thread.sleep(2000);
			
			if(oCommonUtilities.waitForElementVisible(up.Password))
			{
		    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
			}
			sa.assertEquals(up.Password.getText(), "Haider123!");
			test.info("Password is Entered");
			
			Thread.sleep(2000);
		    if(oCommonUtilities.waitForElementVisible(up.Login))
		    {
		    	up.Login.click();
		    }
		    	test.info("login button clicked");
		
		
    	
		if(oCommonUtilities.waitForElementVisible(up.UserMenu))
        {
        	up.UserMenu.click();
        }
        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
        test.info("Clicked on user menu");
        Thread.sleep(3000);
        

    	if(oCommonUtilities.waitForElementVisible(up.myprofile))
        {
        	up.myprofile.click();
        }
        sa.assertEquals(up.myprofile.isDisplayed(), up.myprofile.isSelected());
        test.info("Clicked on myProfile");
        Thread.sleep(3000); 
        
        if(oCommonUtilities.waitForElementVisible(up.post))
        {
        	up.post.click();
        }
        sa.assertEquals(up.post.isDisplayed(), up.post.isSelected());
        test.info("Clicked on post link");
        Thread.sleep(3000); 
        
        WebElement postiframe = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/iframe"));
		driver.switchTo().frame(postiframe);
		Thread.sleep(2000);
		
		if(oCommonUtilities.waitForElementVisible(up.postbody))
        {
        	up.postbody.click();
        	up.postbody.sendKeys("hello beautiful world");
        }
        sa.assertNotNull(up.postbody.getText(), "hello beautiful world");
        test.info("Entered Text in post body");
        Thread.sleep(3000); 
        
        driver.switchTo().parentFrame();
        Thread.sleep(4000);
        
        if(oCommonUtilities.waitForElementVisible(up.ShareButton))
        {
        	up.ShareButton.click();
        }
        sa.assertEquals(up.ShareButton.isDisplayed(), up.ShareButton.isSelected());
        test.info("Post Got Shared");
        Thread.sleep(3000); 
	
	test.pass("TC_06-2 passed");
	}
	
	
	//---------TC_06-03------------//
	@Parameters({"BrowserName"})
	@Test(priority = 4)
	public void MyProfile_03(String BrowserName) throws InterruptedException, IOException {
		
		
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		UserMenuPage up = new UserMenuPage(driver);
		
		 if(oCommonUtilities.waitForElementVisible(up.Username))
			{
		    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
			}
			 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
			test.info("Username is Entered");
			
			Thread.sleep(2000);
			
			if(oCommonUtilities.waitForElementVisible(up.Password))
			{
		    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
			}
			sa.assertEquals(up.Password.getText(), "Haider123!");
			test.info("Password is Entered");
			
			Thread.sleep(2000);
		    if(oCommonUtilities.waitForElementVisible(up.Login))
		    {
		    	up.Login.click();
		    }
		    	test.info("login button clicked");

		    	
		    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
		        {
		        	up.UserMenu.click();
		        }
		        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
		        test.info("Clicked on user menu");
		        Thread.sleep(3000);
		        

		    	if(oCommonUtilities.waitForElementVisible(up.myprofile))
		        {
		        	up.myprofile.click();
		        }
		        sa.assertEquals(up.myprofile.isDisplayed(), up.myprofile.isSelected());
		        test.info("Clicked on myProfile");
		        Thread.sleep(3000); 
		        
		        if(oCommonUtilities.waitForElementVisible(up.FileLink))
		        {
		        	up.FileLink.click();
		        }
		    	test.info("Clicked on file link");
		    	Thread.sleep(2000);
		    	
		    	 if(oCommonUtilities.waitForElementVisible(up.SelectFile))
			        {
			        	up.SelectFile.click();
			        }
			    	test.info("Clicked on SelectFile ");
			    	Thread.sleep(3000);
			    	
			    	WebElement chosefileframe = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/form"));
					
					driver.switchTo().frame("chosefileframe");
			    	 
			    	if(oCommonUtilities.waitForElementVisible(up.ChoseFile))
				        {
				        	up.ChoseFile.click();
				        up.ChoseFile.sendKeys("/Users/Maham/Desktop/IMG_8259.jpeg");
				        }
				    	test.info("Clicked on ChooseFile ");
				    	
				    	test.pass("TC_06-04 passed");
		    	
				    	}
	
	
	//------------TC_07-1--------//
	
	@Parameters({"BrowserName"})
	@Test(priority = 5)
	public void MySettings_01(String BrowserName) throws InterruptedException, IOException {
		
		
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		UserMenuPage up = new UserMenuPage(driver);
		
		 if(oCommonUtilities.waitForElementVisible(up.Username))
			{
		    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
			}
			 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
			test.info("Username is Entered");
			
			Thread.sleep(2000);
			
			if(oCommonUtilities.waitForElementVisible(up.Password))
			{
		    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
			}
			sa.assertEquals(up.Password.getText(), "Haider123!");
			test.info("Password is Entered");
			
			Thread.sleep(2000);
		    if(oCommonUtilities.waitForElementVisible(up.Login))
		    {
		    	up.Login.click();
		    }
		    	test.info("login button clicked");

		    	
		    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
		        {
		        	up.UserMenu.click();
		        }
		        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
		        test.info("Clicked on user menu");
		        Thread.sleep(3000);

		        if(oCommonUtilities.waitForElementVisible(up.mySettings))
		        {
		        	up.mySettings.click();
		        }
		        sa.assertEquals(up.mySettings.isDisplayed(), up.mySettings.isSelected());
		        test.info("Clicked on My Setting");
		        Thread.sleep(3000);
	
		        if(oCommonUtilities.waitForElementVisible(up.personalLink))
		        {
		        	up.personalLink.click();
		        }
		        sa.assertEquals(up.personalLink.isDisplayed(), up.personalLink.isSelected());
		        test.info("Clicked on Personal link");
		        Thread.sleep(3000);
	
		        if(oCommonUtilities.waitForElementVisible(up.historyLink))
		        {
		        	up.historyLink.click();
		        }
		        sa.assertEquals(up.historyLink.isDisplayed(), up.historyLink.isSelected());
		        test.info("Clicked on Login Histry");
		        Thread.sleep(3000);
	
		        

		        if(oCommonUtilities.waitForElementVisible(up.downloadHistory))
		        {
		        	up.downloadHistory.click();
		        }
		        sa.assertEquals(up.downloadHistory.isDisplayed(), up.downloadHistory.isSelected());
		        test.info("Downloaded Login Histry");
		        Thread.sleep(3000);
	}
	
	
	//------------TC_07-2--------//
	@Parameters({"BrowserName"})
	@Test(priority = 6)
	public void MySettings_02(String BrowserName) throws InterruptedException, IOException {
		
		
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		UserMenuPage up = new UserMenuPage(driver);
		
		 if(oCommonUtilities.waitForElementVisible(up.Username))
			{
		    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
			}
			 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
			test.info("Username is Entered");
			
			Thread.sleep(2000);
			
			if(oCommonUtilities.waitForElementVisible(up.Password))
			{
		    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
			}
			sa.assertEquals(up.Password.getText(), "Haider123!");
			test.info("Password is Entered");
			
			Thread.sleep(2000);
		    if(oCommonUtilities.waitForElementVisible(up.Login))
		    {
		    	up.Login.click();
		    }
		    	test.info("login button clicked");

		    	
		    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
		        {
		        	up.UserMenu.click();
		        }
		        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
		        test.info("Clicked on user menu");
		        Thread.sleep(3000);

		        if(oCommonUtilities.waitForElementVisible(up.mySettings))
		        {
		        	up.mySettings.click();
		        }
		        sa.assertEquals(up.mySettings.isDisplayed(), up.mySettings.isSelected());
		        test.info("Clicked on My Setting");
		        Thread.sleep(3000);

	 
		        if(oCommonUtilities.waitForElementVisible(up.display))
		        {
		        	up.display.click();
		        }
		        sa.assertEquals(up.display.isDisplayed(), up.display.isSelected());
		        test.info("Clicked on Display And LayOut");
		        Thread.sleep(3000);
		        
		        if(oCommonUtilities.waitForElementVisible(up.CustomiseTab))
		        {
		        	up.CustomiseTab.click();
		        }
		        sa.assertEquals(up.CustomiseTab.isDisplayed(), up.CustomiseTab.isSelected());
		        test.info("Clicked on Customise Tab");
		        Thread.sleep(3000);
	
		        
		        if(oCommonUtilities.waitForElementVisible(up.dropdown))
		        {
		        	up.dropdown.click();
		        }
		        
		        if(oCommonUtilities.waitForElementVisible(up.sfChatter))
		        {
		        	up.sfChatter.click();
		        }
		        Thread.sleep(3000);
	           test.info("SalesForce Chatter selected");
	
	
	

		        if(oCommonUtilities.waitForElementVisible(up.report))
		        {
		        	up.report.click();
		        }
		        
		        if(oCommonUtilities.waitForElementVisible(up.Add))
		        {
		        	up.Add.click();
		        }
		        Thread.sleep(3000);
	           test.info("Report Selected");
	
	           if(oCommonUtilities.waitForElementVisible(up.tabSaveButton))
		        {
		        	up.tabSaveButton.click();
		        }
	           test.info("Report Added to tab");
	test.pass("TC_07 Passed");
	}
	//---------TC_07-03--------//

	@Parameters({"BrowserName"})
	@Test(priority = 7)
	public void MySettings_03(String BrowserName) throws InterruptedException, IOException {
		
		
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		UserMenuPage up = new UserMenuPage(driver);
		
		 if(oCommonUtilities.waitForElementVisible(up.Username))
			{
		    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
			}
			 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
			test.info("Username is Entered");
			
			Thread.sleep(2000);
			
			if(oCommonUtilities.waitForElementVisible(up.Password))
			{
		    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
			}
			sa.assertEquals(up.Password.getText(), "Haider123!");
			test.info("Password is Entered");
			
			Thread.sleep(2000);
		    if(oCommonUtilities.waitForElementVisible(up.Login))
		    {
		    	up.Login.click();
		    }
		    	test.info("login button clicked");

		    	
		    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
		        {
		        	up.UserMenu.click();
		        }
		        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
		        test.info("Clicked on user menu");
		        Thread.sleep(3000);

		        if(oCommonUtilities.waitForElementVisible(up.mySettings))
		        {
		        	up.mySettings.click();
		        }
		        sa.assertEquals(up.mySettings.isDisplayed(), up.mySettings.isSelected());
		        test.info("Clicked on My Setting");
		        Thread.sleep(3000);
	

		        if(oCommonUtilities.waitForElementVisible(up.email))
		        {
		        	up.email.click();
		        }
		        sa.assertEquals(up.email.isDisplayed(), up.email.isSelected());
		        test.info("Clicked on Email");
		        Thread.sleep(3000);
		        
		        if(oCommonUtilities.waitForElementVisible(up.emailsetting))
		        {
		        	up.emailsetting.click();
		        }
		        sa.assertEquals(up.emailsetting.isDisplayed(), up.emailsetting.isSelected());
		        test.info("Clicked on Email Setting");
		        Thread.sleep(3000);
	
	
		        if(oCommonUtilities.waitForElementVisible(up.emailName))
				{
		        	up.emailName.clear();
			    up.emailName.sendKeys(oDataUtils.ReadAccountProperties("email.name"));
				}
				sa.assertNotNull(up.emailName.getText(), "zohaib abdullah");
				test.info("Email name is Entered");
				Thread.sleep(3000);
				
				if(oCommonUtilities.waitForElementVisible(up.emailAddress))
				{
					up.emailAddress.clear();
			    up.emailAddress.sendKeys(oDataUtils.ReadAccountProperties("email.add"));
				}
				sa.assertNotNull(up.emailAddress.getText(), "zohaibabdullah@yahoo.com");
				test.info("Email Address is Entered");
	
	
				if(oCommonUtilities.waitForElementVisible(up.bbcButton))
		        {
		        	up.bbcButton.click();
		        }
	           test.info("Selected BBC Button");
				Thread.sleep(2000);
				
				
				
				
				if(oCommonUtilities.waitForElementVisible(up.emailSaveButton))
		        {
		        	up.emailSaveButton.click();
		        }
	           test.info("Saved Email");
	test.pass("TC_07 Passed");
				
				
	}
	
	///---------TC_07-04--------//

		@Parameters({"BrowserName"})
		@Test(priority = 8)
		public void MySettings_04(String BrowserName) throws InterruptedException, IOException {
			
			
			
			driver=getDriver(BrowserName);
			driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
			driver.manage().window().maximize();
			sa.assertEquals(driver.getTitle(), "Login | Salesforce");
			test.info("Application is launched");
			Thread.sleep(4000);

			UserMenuPage up = new UserMenuPage(driver);
			
			 if(oCommonUtilities.waitForElementVisible(up.Username))
				{
			    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
				}
				 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
				test.info("Username is Entered");
				
				Thread.sleep(2000);
				
				if(oCommonUtilities.waitForElementVisible(up.Password))
				{
			    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
				}
				sa.assertEquals(up.Password.getText(), "Haider123!");
				test.info("Password is Entered");
				
				Thread.sleep(2000);
			    if(oCommonUtilities.waitForElementVisible(up.Login))
			    {
			    	up.Login.click();
			    }
			    	test.info("login button clicked");

			    	
			    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
			        {
			        	up.UserMenu.click();
			        }
			        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
			        test.info("Clicked on user menu");
			        Thread.sleep(3000);

			        if(oCommonUtilities.waitForElementVisible(up.mySettings))
			        {
			        	up.mySettings.click();
			        }
			        sa.assertEquals(up.mySettings.isDisplayed(), up.mySettings.isSelected());
			        test.info("Clicked on My Setting");
			        Thread.sleep(3000);	
	
			        if(oCommonUtilities.waitForElementVisible(up.Calender))
			        {
			        	up.Calender.click();
			        }
		           test.info("Clicked on calender");
					Thread.sleep(2000);
					
					if(oCommonUtilities.waitForElementVisible(up.ActivityReminder))
			        {
			        	up.ActivityReminder.click();
			        }
		           test.info("Clicked on activity reminder");
					Thread.sleep(2000);
					
					if(oCommonUtilities.waitForElementVisible(up.OpenTestRem))
			        {
			        	up.OpenTestRem.click();
			        }
		           test.info("Test Reminder window popup");
					Thread.sleep(2000);
					
					test.pass("TC_07 Passed");
}
	
		//---------TC_08--------//

				@Parameters({"BrowserName"})
				@Test(priority = 8)
				public void DeveloperConsole (String BrowserName) throws InterruptedException, IOException {
					
					
					
					driver=getDriver(BrowserName);
					driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
					driver.manage().window().maximize();
					sa.assertEquals(driver.getTitle(), "Login | Salesforce");
					test.info("Application is launched");
					Thread.sleep(4000);

					UserMenuPage up = new UserMenuPage(driver);
					
					 if(oCommonUtilities.waitForElementVisible(up.Username))
						{
					    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
						}
						 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
						test.info("Username is Entered");
						
						Thread.sleep(2000);
						
						if(oCommonUtilities.waitForElementVisible(up.Password))
						{
					    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
						}
						sa.assertEquals(up.Password.getText(), "Haider123!");
						test.info("Password is Entered");
						
						Thread.sleep(2000);
					    if(oCommonUtilities.waitForElementVisible(up.Login))
					    {
					    	up.Login.click();
					    }
					    	test.info("login button clicked");

					    	
					    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
					        {
					        	up.UserMenu.click();
					        }
					        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
					        test.info("Clicked on user menu");
					        Thread.sleep(3000);
				
					        if(oCommonUtilities.waitForElementVisible(up.devConsole))
					        {
					        	up.devConsole.click();
					        }
					     
					        
		                   sa.assertEquals(driver.getCurrentUrl() , "https://1992xyz-dev-ed.my.salesforce.com/_ui/common/apex/debug/ApexCSIPage");
					        test.info("Clicked on developer console");
					        Thread.sleep(3000);
					        }
				
				//--------TC_09----------//
				@Parameters({"BrowserName"})
				@Test(priority = 8)
				public void Logout (String BrowserName) throws InterruptedException, IOException {
					
					
					
					driver=getDriver(BrowserName);
					driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
					driver.manage().window().maximize();
					sa.assertEquals(driver.getTitle(), "Login | Salesforce");
					test.info("Application is launched");
					Thread.sleep(4000);

					UserMenuPage up = new UserMenuPage(driver);
					
					 if(oCommonUtilities.waitForElementVisible(up.Username))
						{
					    up.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
						}
						 sa.assertEquals(up.Username.getText(), "maham.mar21@abc.com");
						test.info("Username is Entered");
						
						Thread.sleep(2000);
						
						if(oCommonUtilities.waitForElementVisible(up.Password))
						{
					    up.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
						}
						sa.assertEquals(up.Password.getText(), "Haider123!");
						test.info("Password is Entered");
						
						Thread.sleep(2000);
					    if(oCommonUtilities.waitForElementVisible(up.Login))
					    {
					    	up.Login.click();
					    }
					    	test.info("login button clicked");

					    	
					    	if(oCommonUtilities.waitForElementVisible(up.UserMenu))
					        {
					        	up.UserMenu.click();
					        }
					        sa.assertEquals(up.UserMenu.isDisplayed(), up.UserMenu.isSelected());
					        test.info("Clicked on user menu");
					        Thread.sleep(3000);
					        
					        if(oCommonUtilities.waitForElementVisible(up.Logout))
					        {
					        	up.Logout.click();
					        }
					        test.info("Clicked on Logout");	
					        sa.assertEquals(up.Logout.isDisplayed(), up.Logout.isSelected());
					        
	                         test.pass("TC_09 Passed");
}
}