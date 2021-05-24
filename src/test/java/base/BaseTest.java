package base;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utilities.AppConstants;
import utilities.CommenUtilities;
import utilities.DataUtilities;

public class BaseTest {

	
		//in baseTest we will save all our variables
		//to access these  variable accross other packages 
		//we use public static
		
	    static String sReportTime;
		
		public static WebDriver driver =null;
		
		public static ExtentReports extent = null;
		
		public static ExtentHtmlReporter htmlreporter;
		
		public static com.aventstack.extentreports.ExtentTest test = null;
		
		public static Properties sProperties;
		
		private String sBrowserName;
		
		public CommenUtilities oCommonUtilities = new CommenUtilities();
		public DataUtilities oDataUtils = new DataUtilities();
		
		//object for assertion
		public SoftAssert sa = new SoftAssert();
		
		
		
		
		
		
		@BeforeSuite
		public void Setup() {
			Initializereports();
		}
		
		
		
		@AfterSuite
		public void tearDown() {
			extent.flush();
		}
		
		
	
		
		
		
		public void Initializereports() {
			sReportTime = new SimpleDateFormat("yyyymmddhhmm").format(new Date());
			extent = new ExtentReports();
			htmlreporter = new ExtentHtmlReporter(AppConstants.EXTENT_HTML_REPORT_PATH + "//" + sReportTime + ".html");
			extent.attachReporter(htmlreporter);
		}
		
		public WebDriver getDriver(String BrowserName) {
			
			sBrowserName = BrowserName.toLowerCase();
			
			switch(sBrowserName) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			
				default:
					driver= null;
					
			
			}
			return driver;
			
		}

	}


