package testcasesNG;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.UserMenuPage;

public class UserAccount_TestCases extends BaseTest {
	
	@BeforeMethod
	public void CreateReport(Method sTestMethod) {
		test = extent.createTest(sTestMethod.getName());
	}
	
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		Thread.sleep(4000);
	driver.close();
	}
	
	
	
	//--------TC_10---------//
	@Parameters({"BrowserName"})
	@Test(priority = 1)

	
	public void CreatAccount(String BrowserName) throws IOException, InterruptedException {
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		AccountPage  ap = new AccountPage (driver);
		
	 if(oCommonUtilities.waitForElementVisible(ap.Username))
	{
    ap.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
	}
	 sa.assertEquals(ap.Username.getText(), "maham.mar21@abc.com");
	test.info("Username is Entered");
	
	Thread.sleep(2000);
	
	if(oCommonUtilities.waitForElementVisible(ap.Password))
	{
    ap.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
	}
	sa.assertEquals(ap.Password.getText(), "Haider123!");
	test.info("Password is Entered");
	
	Thread.sleep(2000);
    if(oCommonUtilities.waitForElementVisible(ap.Login))
    {
    	ap.Login.click();
    }
    	test.info("login button clicked");
		
	
	
	 if(oCommonUtilities.waitForElementVisible(ap.Account))
		{
	    ap.Account.click();
		}
		test.info("Clicked on Accounts Tab");
		Thread.sleep(3000);
		 if(oCommonUtilities.waitForElementVisible(ap.NewAccount))
			{
		    ap.NewAccount.click();
			}
			test.info("Clicked on Create new Account");
			
			
			
	if(oCommonUtilities.waitForElementVisible(ap.AccountName))
	{
	ap.AccountName.sendKeys(oDataUtils.ReadAccountProperties("Account.name1"));
	}
	 sa.assertNotNull(ap.AccountName.getText(), "Aqib Sappal");
	test.info("Account name Added");	
		
				
	Thread.sleep(2000);
	if(oCommonUtilities.waitForElementVisible(ap.NewAccSaveBtn))
					{
				    ap.NewAccSaveBtn.click();
					}
	test.info("New Account Added");	
	test.pass("TC_10 passed");
	}
	
	//------------TC_11------------//
	
	@Parameters({"BrowserName"})
	@Test(priority = 2)

	
	public void CreatNewView(String BrowserName) throws IOException, InterruptedException {
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		AccountPage  ap = new AccountPage (driver);
		
	 if(oCommonUtilities.waitForElementVisible(ap.Username))
	{
    ap.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
	}
	 sa.assertEquals(ap.Username.getText(), "maham.mar21@abc.com");
	test.info("Username is Entered");
	
	Thread.sleep(2000);
	
	if(oCommonUtilities.waitForElementVisible(ap.Password))
	{
    ap.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
	}
	sa.assertEquals(ap.Password.getText(), "Haider123!");
	test.info("Password is Entered");
	
	Thread.sleep(2000);
    if(oCommonUtilities.waitForElementVisible(ap.Login))
    {
    	ap.Login.click();
    }
    	test.info("login button clicked");
		
	
	
	 if(oCommonUtilities.waitForElementVisible(ap.Account))
		{
	    ap.Account.click();
		}
		test.info("Clicked on Accounts Tab");
		Thread.sleep(3000);
	
	if(oCommonUtilities.waitForElementVisible(ap.ViewAcc))
			{
		    ap.ViewAcc.click();
			}
			test.info("Clicked on Create new View");
			Thread.sleep(3000);
	
	
			
	if(oCommonUtilities.waitForElementVisible(ap.ViewName))
			{
		    ap.ViewName.sendKeys("bnm");
			}
	sa.assertEquals(ap.ViewName.getText(), "bnm");
	test.info("View name Entered");
	
	
	if(oCommonUtilities.waitForElementVisible(ap.ViewUniqueName))
	{
		ap.ViewUniqueName.clear();
    ap.ViewUniqueName.sendKeys("mno");
	}
	sa.assertEquals(ap.ViewUniqueName.getText(), "mno");
	test.info("Unique name Entered");
	
	
	if(oCommonUtilities.waitForElementVisible(ap.NewViewSaveBtn))
	{
    ap.NewViewSaveBtn.click();
	}
	test.info("saved new view");
	Thread.sleep(3000);
	
	test.pass("TC_11 passed");
	}
	
	
	//------------TC_12------------//
	
		@Parameters({"BrowserName"})
		@Test(priority = 3)

		
		public void MergeAccount (String BrowserName) throws IOException, InterruptedException {
			
			driver=getDriver(BrowserName);
			driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
			driver.manage().window().maximize();
			sa.assertEquals(driver.getTitle(), "Login | Salesforce");
			test.info("Application is launched");
			Thread.sleep(4000);

			AccountPage  ap = new AccountPage (driver);
			
		 if(oCommonUtilities.waitForElementVisible(ap.Username))
		{
	    ap.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
		}
		 sa.assertEquals(ap.Username.getText(), "maham.mar21@abc.com");
		test.info("Username is Entered");
		
		Thread.sleep(2000);
		
		if(oCommonUtilities.waitForElementVisible(ap.Password))
		{
	    ap.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
		}
		sa.assertEquals(ap.Password.getText(), "Haider123!");
		test.info("Password is Entered");
		
		Thread.sleep(2000);
	    if(oCommonUtilities.waitForElementVisible(ap.Login))
	    {
	    	ap.Login.click();
	    }
	    	test.info("login button clicked");
			
		
		
		 if(oCommonUtilities.waitForElementVisible(ap.Account))
			{
		    ap.Account.click();
			}
			test.info("Clicked on Accounts Tab");
			Thread.sleep(3000);
	
	 if(oCommonUtilities.waitForElementVisible(ap.MergeAcc))
				{
			    ap.MergeAcc.click();
				}
	test.info("Clicked on Merge button");
	Thread.sleep(3000);
	
	 if(oCommonUtilities.waitForElementVisible(ap.FindAccText))
		{
	    ap.FindAccText.sendKeys("march");
		}
test.info("Searching for Accounts");
Thread.sleep(3000);
	
if(oCommonUtilities.waitForElementVisible(ap.FindAccount))
{
ap.FindAccount.click();
}
test.info("Finding Matchin Account");
Thread.sleep(3000);
	
if(oCommonUtilities.waitForElementVisible(ap.NextBtn))
{
ap.NextBtn.click();
}
Thread.sleep(3000);

if(oCommonUtilities.waitForElementVisible(ap.Merge))
{
ap.Merge.click();
}
test.info("Mergging two accounts");
Thread.sleep(3000);

test.pass("TC_13 Passed");
		}
		
		//------------TC_13------------//
		
			@Parameters({"BrowserName"})
			@Test(priority = 4)

			
			public void AccountReport (String BrowserName) throws IOException, InterruptedException {
				
				driver=getDriver(BrowserName);
				driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
				driver.manage().window().maximize();
				sa.assertEquals(driver.getTitle(), "Login | Salesforce");
				test.info("Application is launched");
				Thread.sleep(4000);

				AccountPage  ap = new AccountPage (driver);
				
			 if(oCommonUtilities.waitForElementVisible(ap.Username))
			{
		    ap.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
			}
			 sa.assertEquals(ap.Username.getText(), "maham.mar21@abc.com");
			test.info("Username is Entered");
			
			Thread.sleep(2000);
			
			if(oCommonUtilities.waitForElementVisible(ap.Password))
			{
		    ap.Password.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
			}
			sa.assertEquals(ap.Password.getText(), "Haider123!");
			test.info("Password is Entered");
			
			Thread.sleep(2000);
		    if(oCommonUtilities.waitForElementVisible(ap.Login))
		    {
		    	ap.Login.click();
		    }
		    	test.info("login button clicked");
				
			
			
			 if(oCommonUtilities.waitForElementVisible(ap.Account))
				{
			    ap.Account.click();
				}
				test.info("Clicked on Accounts Tab");
				Thread.sleep(3000);
				
			 if(oCommonUtilities.waitForElementVisible(ap.AccReport))
					{
				    ap.AccReport.click();
					}
					test.info("Clicked on Accounts Report");
					Thread.sleep(3000);	
					
					
					ap.DateFieldDropDownIcon.click();
					
					
		if(oCommonUtilities.waitForElementVisible(ap.DateField))
					{
				    ap.DateField.click();
					}
		test.info("Create Date Selected");
					Thread.sleep(3000);	
					
					
					if(oCommonUtilities.waitForElementVisible(ap.FromDate))
					{
				    ap.FromDate.clear();
				    ap.FromDate.sendKeys("5/23/2021");
					}
		test.info("From Date Entered");
		Thread.sleep(3000);
		
		if(oCommonUtilities.waitForElementVisible(ap.ToDate))
		{
	    ap.ToDate.clear();
	    ap.ToDate.sendKeys("5/23/2021");
		}
test.info("To Date Entered");

if(oCommonUtilities.waitForElementVisible(ap.ReportSaveBtn))
{
ap.ReportSaveBtn.click();
}
test.info("Clicked on save button");
Thread.sleep(3000);	


//----
if(oCommonUtilities.waitForElementVisible(ap.ReportName))
{
ap.ReportName.sendKeys(oDataUtils.ReadAccountProperties("report.name1"));
}
 sa.assertEquals(ap.ReportName.getText(), "ashraf");
test.info("Report name is Entered");

if(oCommonUtilities.waitForElementVisible(ap.ReportUniqueName))
{
	ap.ReportUniqueName.clear();
ap.ReportUniqueName.clear();
	ap.ReportUniqueName.sendKeys(oDataUtils.ReadAccountProperties("report.unique.name1"));
}

 sa.assertEquals(ap.ReportUniqueName.getText(), "sappal");
test.info("Report Unique name is Entered");

Thread.sleep(3000);
if(oCommonUtilities.waitForElementVisible(ap.SaveAndRun))
{
ap.SaveAndRun.click();
}
test.info("Clicked on save And run report button");
Thread.sleep(3000);	

	}
}
