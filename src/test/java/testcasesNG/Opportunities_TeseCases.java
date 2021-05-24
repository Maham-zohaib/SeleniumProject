package testcasesNG;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.OpportunitiesPage;

public class Opportunities_TeseCases extends BaseTest{

	
	@BeforeMethod
	public void CreateReport(Method sTestMethod) {
		test = extent.createTest(sTestMethod.getName());
	}
	
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		Thread.sleep(4000);
	driver.close();
	}
	
	//--------TC_15---------//
		@Parameters({"BrowserName"})
		@Test(priority = 1)

		
		public void OpportunitiesLink (String BrowserName) throws IOException, InterruptedException {
			
			driver=getDriver(BrowserName);
			driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
			driver.manage().window().maximize();
			sa.assertEquals(driver.getTitle(), "Login | Salesforce");
			test.info("Application is launched");
			Thread.sleep(4000);

			OpportunitiesPage  op = new OpportunitiesPage(driver);
			
		 if(oCommonUtilities.waitForElementVisible(op.Username))
		{
	    op.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
		}
		 sa.assertEquals(op.Username.getText(), "maham.mar21@abc.com");
		test.info("Username is Entered");
		
		Thread.sleep(2000);
		
		if(oCommonUtilities.waitForElementVisible(op.Password))
		{
	    op.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
		}
		sa.assertEquals(op.Password.getText(), "Haider123!");
		test.info("Password is Entered");
		
		Thread.sleep(2000);
	    if(oCommonUtilities.waitForElementVisible(op.Login))
	    {
	    	op.Login.click();
	    }
	    	test.info("login button clicked");
			
	    	 if(oCommonUtilities.waitForElementVisible(op.oppoTab))
	 		{
	 	    op.oppoTab.click();
	 		}
	 		test.info("Clicked on Opportunities Tab");
	 		Thread.sleep(3000);
	 		 
	 		
	 		if(oCommonUtilities.waitForElementVisible(op.oppoDropDown))
	 			{
	 		    op.oppoDropDown.click();
	 			}
	 			test.info("Clicked on Opportunities Dropdown");
		
	 			test.pass("TC_15 passed");
		}




		//--------TC_16---------//
				@Parameters({"BrowserName"})
				@Test(priority = 2)

				
				public void CreateNewOppo(String BrowserName) throws IOException, InterruptedException {
					
					driver=getDriver(BrowserName);
					driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
					driver.manage().window().maximize();
					sa.assertEquals(driver.getTitle(), "Login | Salesforce");
					test.info("Application is launched");
					Thread.sleep(4000);

					OpportunitiesPage  op = new OpportunitiesPage(driver);
					
				 if(oCommonUtilities.waitForElementVisible(op.Username))
				{
			    op.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
				}
				 sa.assertEquals(op.Username.getText(), "maham.mar21@abc.com");
				test.info("Username is Entered");
				
				Thread.sleep(2000);
				
				if(oCommonUtilities.waitForElementVisible(op.Password))
				{
			    op.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
				}
				sa.assertEquals(op.Password.getText(), "Haider123!");
				test.info("Password is Entered");
				
				Thread.sleep(2000);
			    if(oCommonUtilities.waitForElementVisible(op.Login))
			    {
			    	op.Login.click();
			    }
			    	test.info("login button clicked");
					
			    	 if(oCommonUtilities.waitForElementVisible(op.oppoTab))
			 		{
			 	    op.oppoTab.click();
			 		}
			 		test.info("Clicked on Opportunities Tab");
			 		Thread.sleep(3000);

op.newOppoBtn.click();

if(oCommonUtilities.waitForElementVisible(op.newOppoName))
	{
 op.newOppoName.sendKeys("programming tools 1");
	}
	test.info("Entered new Opportunity name");
	Thread.sleep(3000);

	if(oCommonUtilities.waitForElementVisible(op.newOppoAccName))
	{
 op.newOppoAccName.sendKeys("programmer 1");
	}
	test.info("Entered new Opportunity Account name");
	Thread.sleep(3000);

	if(oCommonUtilities.waitForElementVisible(op.closeDate))
	{
		op.closeDate.clear();
 op.closeDate.sendKeys("6/23/2021");
	}
	test.info("Entered close date");
	Thread.sleep(3000);



	if(oCommonUtilities.waitForElementVisible(op.stage))
	{
 op.stage.click();
	}
	test.info("Clicked on stage");
	Thread.sleep(3000);

	if(oCommonUtilities.waitForElementVisible(op.probability))
	{
		op.probability.clear();
 op.probability.sendKeys("40");
	}
	test.info("Entered probability");
	Thread.sleep(3000);
	
op.leadSource.click();
Thread.sleep(2000);
op.campaignSource.click();
test.pass("TC_16 passed");
				}
				
				//--------TC_17---------//
				@Parameters({"BrowserName"})
				@Test(priority = 3)

				
				public void OppoetunityPipelineReport(String BrowserName) throws IOException, InterruptedException {
					
					driver=getDriver(BrowserName);
					driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
					driver.manage().window().maximize();
					sa.assertEquals(driver.getTitle(), "Login | Salesforce");
					test.info("Application is launched");
					Thread.sleep(4000);

					OpportunitiesPage  op = new OpportunitiesPage(driver);
					
				 if(oCommonUtilities.waitForElementVisible(op.Username))
				{
			    op.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
				}
				 sa.assertEquals(op.Username.getText(), "maham.mar21@abc.com");
				test.info("Username is Entered");
				
				Thread.sleep(2000);
				
				if(oCommonUtilities.waitForElementVisible(op.Password))
				{
			    op.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
				}
				sa.assertEquals(op.Password.getText(), "Haider123!");
				test.info("Password is Entered");
				
				Thread.sleep(2000);
			    if(oCommonUtilities.waitForElementVisible(op.Login))
			    {
			    	op.Login.click();
			    }
			    	test.info("login button clicked");
					
			    	 if(oCommonUtilities.waitForElementVisible(op.oppoTab))
			 		{
			 	    op.oppoTab.click();
			 		}
			 		test.info("Clicked on Opportunities Tab");
			 		Thread.sleep(3000);
			 		

			    	 if(oCommonUtilities.waitForElementVisible(op.oppoPipeLine))
			 		{
			 	    op.oppoPipeLine.click();
			 		}
			 		test.info("Clicked on Opportunities PipeLine Report Link");
			 		Thread.sleep(3000);
			 		
			 		test.pass("TC_17 passed");
			
				}
				//--------TC_18---------//
				@Parameters({"BrowserName"})
				@Test(priority = 4)

				
				public void StuckOppoReportLink(String BrowserName) throws IOException, InterruptedException {
					
					driver=getDriver(BrowserName);
					driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
					driver.manage().window().maximize();
					sa.assertEquals(driver.getTitle(), "Login | Salesforce");
					test.info("Application is launched");
					Thread.sleep(4000);

					OpportunitiesPage  op = new OpportunitiesPage(driver);
					
				 if(oCommonUtilities.waitForElementVisible(op.Username))
				{
			    op.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
				}
				 sa.assertEquals(op.Username.getText(), "maham.mar21@abc.com");
				test.info("Username is Entered");
				
				Thread.sleep(2000);
				
				if(oCommonUtilities.waitForElementVisible(op.Password))
				{
			    op.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
				}
				sa.assertEquals(op.Password.getText(), "Haider123!");
				test.info("Password is Entered");
				
				Thread.sleep(2000);
			    if(oCommonUtilities.waitForElementVisible(op.Login))
			    {
			    	op.Login.click();
			    }
			    	test.info("login button clicked");
					
			    	 if(oCommonUtilities.waitForElementVisible(op.oppoTab))
			 		{
			 	    op.oppoTab.click();
			 		}
			 		test.info("Clicked on Opportunities Tab");
			 		Thread.sleep(3000);
			 		
			 		if(oCommonUtilities.waitForElementVisible(op.StuckOppoLink))
			 		{
			 	    op.StuckOppoLink.click();
			 		}
			 		test.info("Clicked on Stuck Opportunities Report Link");
			 		Thread.sleep(3000);
			 		
			 		test.pass("TC_18 passed");
				}
				
				
				
				//--------TC_19---------//
				@Parameters({"BrowserName"})
				@Test(priority = 5)

				
				public void QuarterlySummaryReport(String BrowserName) throws IOException, InterruptedException {
					
					driver=getDriver(BrowserName);
					driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
					driver.manage().window().maximize();
					sa.assertEquals(driver.getTitle(), "Login | Salesforce");
					test.info("Application is launched");
					Thread.sleep(4000);

					OpportunitiesPage  op = new OpportunitiesPage(driver);
					
				 if(oCommonUtilities.waitForElementVisible(op.Username))
				{
			    op.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
				}
				 sa.assertEquals(op.Username.getText(), "maham.mar21@abc.com");
				test.info("Username is Entered");
				
				Thread.sleep(2000);
				
				if(oCommonUtilities.waitForElementVisible(op.Password))
				{
			    op.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
				}
				sa.assertEquals(op.Password.getText(), "Haider123!");
				test.info("Password is Entered");
				
				Thread.sleep(2000);
			    if(oCommonUtilities.waitForElementVisible(op.Login))
			    {
			    	op.Login.click();
			    }
			    	test.info("login button clicked");
					
			    	 if(oCommonUtilities.waitForElementVisible(op.oppoTab))
			 		{
			 	    op.oppoTab.click();
			 		}
			 		test.info("Clicked on Opportunities Tab");
			 		Thread.sleep(3000);
			 		
			 		 if(oCommonUtilities.waitForElementVisible(op.interval))
				 		{
				 	    op.interval.click();
				 		}
				 		test.info("Selected Next FQ");
				 		Thread.sleep(3000);	

				 		 if(oCommonUtilities.waitForElementVisible(op.include))
					 		{
					 	    op.include.click();
					 		}
					 		test.info("Selected Closed Opportunities");
					 		Thread.sleep(3000);	
				 		
					 		op.runReport.click();
					 		
					 		test.info("Clicked on Run Report Button");
					 		test.pass("TC_19 Passed");
					 		
				 		
}
}	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

