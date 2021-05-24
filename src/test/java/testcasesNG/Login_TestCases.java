package testcasesNG;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import listeners.TestListeners;
import pages.LoginPage;


public class Login_TestCases extends BaseTest {

	
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
	public void VerifyLoginErrorMsg01(String BrowserName) throws IOException, InterruptedException {
		
		
		//-------------//
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);
		
		LoginPage lp = new LoginPage(driver);
		if(oCommonUtilities.waitForElementVisible(lp.Username))
		{
	    lp.Username.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
		}
	    sa.assertEquals(lp.Username.getText(), "maham.mar21@abc.com");
		test.info("Username is Entered");
		
		Thread.sleep(2000);
		if(oCommonUtilities.waitForElementVisible(lp.Password))
		{
			lp.Password.clear();
		}
		sa.assertEquals(lp.Password.getText(),"");
		test.info("password is empty");
		
	Thread.sleep(2000);
	    if(oCommonUtilities.waitForElementVisible(lp.Login))
	    {
	    	lp.Login.click();
	    }
	    	test.info("login button clicked");
	  
	    Thread.sleep(2000);	
	   //---------//
	    	
	   WebElement sErrorMsg = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("we.errormsg.xpath")));
	    	
	   
		sa.assertEquals(sErrorMsg.getText(), oDataUtils.ReadWebElementProperties("login.errormsg"));
	   sa.assertAll();
		
	   if(sErrorMsg.getText().equals(oDataUtils.ReadWebElementProperties("login.errormsg"))) {

			test.pass("TC01 Passed");
		
		} else {
			
			test.addScreenCaptureFromPath(oCommonUtilities.takeScreenshot());
			test.fail("TC01 FAILED");
		}
	   sa.assertAll();
	  
	}	
	
	
	//-----------------2nd TC Start-----------//
	
	@Parameters({"BrowserName"})
	@Test(priority = 2)
	public void VerifyLoginErrorMsg02(String BrowserName) throws IOException, InterruptedException {
	
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		LoginPage lp = new LoginPage(driver);
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
    	
    	sa.assertEquals(driver.getCurrentUrl(), "https://1992xyz-dev-ed.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom");
    	
    	if (driver.getCurrentUrl().equals("https://1992xyz-dev-ed.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom")) {

    		test.pass("TC02 PASSED");
    	} else {
    		test.addScreenCaptureFromPath(oCommonUtilities.takeScreenshot());
    		test.fail("TC02 FAILED");
    	}
    }
	
	//------------TestCase 03----------//
	
	@Parameters({"BrowserName"})
	@Test(priority = 3)
	public void RememberMe(String BrowserName) throws IOException, InterruptedException {
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);

		LoginPage lp = new LoginPage(driver);
	
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
    
	
    if(oCommonUtilities.waitForElementVisible(lp.RememberMe));
    {
    	lp.RememberMe.click();
    }
    sa.assertEquals(lp.RememberMe.isDisplayed(), lp.RememberMe.isSelected());
    test.info("clicked on Remember me button");
    	
	
	if(oCommonUtilities.waitForElementVisible(lp.Login))
    {
    	lp.Login.click();
    }
    test.info("login button clicked");
    Thread.sleep(3000); 
    
    if(oCommonUtilities.waitForElementVisible(lp.UserMenu))
    {
    	lp.UserMenu.click();
    }
    sa.assertEquals(lp.UserMenu.isDisplayed(), lp.UserMenu.isSelected());
    test.info("Clicked on user menu");
    Thread.sleep(3000);
    
    if(oCommonUtilities.waitForElementVisible(lp.Logout))
    {
    	lp.Logout.click();
    }
    test.info("Clicked on Logout");	
    test.pass("TC_03 is passed");
    
    
    
    
   /* if ( lp.RememberMe.isSelected() ) {

		test.pass("TC03 PASSED");
	} else {
		test.addScreenCaptureFromPath(oCommonUtilities.takeScreenshot());
		test.fail("TC03 FAILED");
	}
   */ 	
	}
    //---------TC 04(A)----------------//
    
	@Parameters({"BrowserName"})
	@Test(priority = 4)
	public void ForgetPassword_A(String BrowserName) throws IOException, InterruptedException {
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(3000);
    	
		LoginPage lp = new LoginPage(driver);
		 
		if(oCommonUtilities.waitForElementVisible(lp.FrgtPass))
		    {
		    	lp.FrgtPass.click();
		    }
		    //sa.assertEquals(lp.FrgtPass.isDisplayed(), lp.FrgtPass.isSelected());
		    test.info("Clicked on Forgetpassword");
		    Thread.sleep(3000);
   
		    
		    if(oCommonUtilities.waitForElementVisible(lp.FpUsername))
		    {
		    	lp.FpUsername.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
		    }
		    sa.assertEquals(lp.FpUsername.getText(),"maham.mar21@abc.com");
		    test.info("UserName again entered");
		    Thread.sleep(3000);
		    
		    
		    if(oCommonUtilities.waitForElementVisible(lp.Continue))
		    {
		    	lp.Continue.click();
		    }
		  
		    test.info("Clicked on Continue Button");
		    Thread.sleep(3000);
		
		   sa.assertEquals(driver.getCurrentUrl(), "https://login.salesforce.com/secur/forgotpassword.jsp");
	    	
	    	if (driver.getCurrentUrl().equals("https://login.salesforce.com/secur/forgotpassword.jsp")) {

	    		test.pass("TC04_A PASSED");
	    	} else {
	    		test.addScreenCaptureFromPath(oCommonUtilities.takeScreenshot());
	    		test.fail("TC04_A FAILED");
	    	}
		    
	}
    //--------------TC 04_B---------------//
	
	
	@Parameters({"BrowserName"})
	@Test(priority = 5)
	public void ForgetPassword_B(String BrowserName) throws IOException, InterruptedException {
		
		driver=getDriver(BrowserName);
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		driver.manage().window().maximize();
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(3000);
    	
		LoginPage lp = new LoginPage(driver);
		
		
		if(oCommonUtilities.waitForElementVisible(lp.Username))
		{
	    lp.Username.sendKeys(oDataUtils.ReadAccountProperties("wrong.uname"));
		}
	    sa.assertEquals(lp.Username.getText(), "mahamzohaib");
		test.info("wrong Username is Entered");
		
		Thread.sleep(2000);
		if(oCommonUtilities.waitForElementVisible(lp.Password))
		{
			lp.Password.sendKeys(oDataUtils.ReadAccountProperties("wrong.pass"));
		}
		sa.assertEquals(lp.Password.getText(),"harry123");
		test.info("wrong password is entered");
		
	Thread.sleep(2000);
	    if(oCommonUtilities.waitForElementVisible(lp.Login))
	    {
	    	lp.Login.click();
	    }
	    	test.info("login button clicked");
	  
	    Thread.sleep(2000);	
	    
	    
	    WebElement WrongUnPErrorMsg = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("wrong.Un.Pass.Errormsg.classname")));
    	
		  
			sa.assertEquals(WrongUnPErrorMsg.getText(), oDataUtils.ReadWebElementProperties("wrong.Un.Pass.Errormsg"));
		   sa.assertAll();
			
		  if(WrongUnPErrorMsg.getText().equals(oDataUtils.ReadWebElementProperties("wrong.Un.Pass.Errormsg"))) {
				test.pass("TC04_B Passed");
			
			} else {
				
				test.addScreenCaptureFromPath(oCommonUtilities.takeScreenshot());
				test.fail("TC04_B  FAILED");
			}
		
		
		
		
		
		
	}

	
		
	
}
