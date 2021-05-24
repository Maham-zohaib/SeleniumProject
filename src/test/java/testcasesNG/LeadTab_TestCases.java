package testcasesNG;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.LeadsPage;

public class LeadTab_TestCases extends BaseTest{

	@BeforeMethod
	public void CreateReport(Method sTestMethod) {
		test = extent.createTest(sTestMethod.getName());
	}
	
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		Thread.sleep(4000);
	driver.close();
	}
	
	
	
	//--------TC_20---------//
	@Parameters({"BrowserName"})
	@Test(priority = 1)

	
	public void LeadTab(String BrowserName) throws IOException, InterruptedException {
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		LeadsPage  lp = new LeadsPage(driver);
		
	 if(oCommonUtilities.waitForElementVisible(lp.Username))
	{
    lp.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
	}
	 sa.assertEquals(lp.Username.getText(), "maham.mar21@abc.com");
	test.info("Username is Entered");
	
	Thread.sleep(2000);
	
	if(oCommonUtilities.waitForElementVisible(lp.Password))
	{
    lp.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
	}
	sa.assertEquals(lp.Password.getText(), "Haider123!");
	test.info("Password is Entered");
	
	Thread.sleep(2000);
    if(oCommonUtilities.waitForElementVisible(lp.Login))
    {
    	lp.Login.click();
    }
    	test.info("login button clicked");
		
	
	
	 if(oCommonUtilities.waitForElementVisible(lp.LeadTab))
		{
	    lp.LeadTab.click();
		}
		test.info("Clicked on Leads Tab");
		Thread.sleep(3000);
		}
	
	//--------TC_21--------//
		@Parameters({"BrowserName"})
		@Test(priority = 2)

		
		public void LeadTab_02(String BrowserName) throws IOException, InterruptedException {
			
			driver=getDriver(BrowserName);
			driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
			driver.manage().window().maximize();
			sa.assertEquals(driver.getTitle(), "Login | Salesforce");
			test.info("Application is launched");
			Thread.sleep(4000);

			LeadsPage  lp = new LeadsPage(driver);
			
		 if(oCommonUtilities.waitForElementVisible(lp.Username))
		{
	    lp.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
		}
		 sa.assertEquals(lp.Username.getText(), "maham.mar21@abc.com");
		test.info("Username is Entered");
		
		Thread.sleep(2000);
		
		if(oCommonUtilities.waitForElementVisible(lp.Password))
		{
	    lp.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
		}
		sa.assertEquals(lp.Password.getText(), "Haider123!");
		test.info("Password is Entered");
		
		Thread.sleep(2000);
	    if(oCommonUtilities.waitForElementVisible(lp.Login))
	    {
	    	lp.Login.click();
	    }
	    	test.info("login button clicked");
			
		
		
		 if(oCommonUtilities.waitForElementVisible(lp.LeadTab))
			{
		    lp.LeadTab.click();
			}
			test.info("Clicked on Leads Tab");
			Thread.sleep(3000);
			
		if(oCommonUtilities.waitForElementVisible(lp.LeadTabDropDown))
			{
		    lp.LeadTabDropDown.click();
			}
		test.info("Clicked on Leads Tab View DropDown");
		Thread.sleep(3000);	
		
		test.pass("TC_21 passed");
		}
		
		//--------TC_22---------//
				@Parameters({"BrowserName"})
				@Test(priority = 3)

				
				public void LeadTab_03(String BrowserName) throws IOException, InterruptedException {
					
					driver=getDriver(BrowserName);
					driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
					driver.manage().window().maximize();
					sa.assertEquals(driver.getTitle(), "Login | Salesforce");
					test.info("Application is launched");
					Thread.sleep(4000);

					LeadsPage  lp = new LeadsPage(driver);
					
				 if(oCommonUtilities.waitForElementVisible(lp.Username))
				{
			    lp.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
				}
				 sa.assertEquals(lp.Username.getText(), "maham.mar21@abc.com");
				test.info("Username is Entered");
				
				Thread.sleep(2000);
				
				if(oCommonUtilities.waitForElementVisible(lp.Password))
				{
			    lp.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
				}
				sa.assertEquals(lp.Password.getText(), "Haider123!");
				test.info("Password is Entered");
				
				Thread.sleep(2000);
			    if(oCommonUtilities.waitForElementVisible(lp.Login))
			    {
			    	lp.Login.click();
			    }
			    	test.info("login button clicked");
					
				
				
				 if(oCommonUtilities.waitForElementVisible(lp.LeadTab))
					{
				    lp.LeadTab.click();
					}
					test.info("Clicked on Leads Tab");
					Thread.sleep(3000);
			
					if(oCommonUtilities.waitForElementVisible(lp.LeadTabDropDown))
					{
				    lp.LeadTabDropDown.click();
					}
				test.info("Clicked on Leads Tab View DropDown");
				
				
			
			
			//logging out 
			lp.UserMenu.click();
			Thread.sleep(3000);
			lp.Logout.click();
			test.info("logging out");
			
			//logging in again
			Thread.sleep(2000);
			lp.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
			Thread.sleep(2000);
			lp.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
			Thread.sleep(2000);
			lp.Login.click();
			test.info("logging In again");
			
			
			lp.LeadTab.click();
			test.info("Clicked on lead tab again");
			
			
			if(oCommonUtilities.waitForElementVisible(lp.LeadGoBtn))
			{
		    lp.LeadGoBtn.click();
			}
		test.info("Clicked on Go button");
		
		test.pass("TC_22 Passed");
			
				}	
			
				//--------TC_23---------//
				@Parameters({"BrowserName"})
				@Test(priority = 4)

				
				public void LeadTab_04(String BrowserName) throws IOException, InterruptedException {
					
					driver=getDriver(BrowserName);
					driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
					driver.manage().window().maximize();
					sa.assertEquals(driver.getTitle(), "Login | Salesforce");
					test.info("Application is launched");
					Thread.sleep(4000);

					LeadsPage  lp = new LeadsPage(driver);
					
				 if(oCommonUtilities.waitForElementVisible(lp.Username))
				{
			    lp.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
				}
				 sa.assertEquals(lp.Username.getText(), "maham.mar21@abc.com");
				test.info("Username is Entered");
				
				Thread.sleep(2000);
				
				if(oCommonUtilities.waitForElementVisible(lp.Password))
				{
			    lp.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
				}
				sa.assertEquals(lp.Password.getText(), "Haider123!");
				test.info("Password is Entered");
				
				Thread.sleep(2000);
			    if(oCommonUtilities.waitForElementVisible(lp.Login))
			    {
			    	lp.Login.click();
			    }
			    	test.info("login button clicked");
					
				
				
				 if(oCommonUtilities.waitForElementVisible(lp.LeadTab))
					{
				    lp.LeadTab.click();
					}
					test.info("Clicked on Leads Tab");
					Thread.sleep(3000);
			
			
			 if(oCommonUtilities.waitForElementVisible(lp.TodayLead))
				{
			    lp.TodayLead.click();
				}
			test.info("Clicked on todays lead");
			 
			
			
	}
}