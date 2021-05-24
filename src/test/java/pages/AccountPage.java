package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	public AccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath  = "//input[@id='username']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//*[@id='Login']")
	public WebElement Login;
	
	@FindBy(id = "Account_Tab")
	public WebElement Account;
	
	@FindBy(xpath =  "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input")
	public WebElement NewAccount;
	
	@FindBy(id = "acc2")
	public WebElement AccountName;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]")
	public WebElement NewAccSaveBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]")
	public WebElement ViewAcc;
	
	@FindBy(id = "fname")
	public WebElement ViewName;
	
	@FindBy(id = "devname")
	public WebElement ViewUniqueName;
	
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]")
	public WebElement NewViewSaveBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")
	public WebElement MergeAcc;
	
	@FindBy(id = "srch")
	public WebElement FindAccText;
	
	
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/input[2]")
	public WebElement FindAccount;
	
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[1]/div/input[1]")
	public WebElement NextBtn;
	
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[1]/div/input[2]")
	public WebElement Merge;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a")
	public WebElement AccReport;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/div/form/div/div[1]/img")
	public WebElement DateFieldDropDownIcon;
	
	@FindBy(xpath = "/html/body/div[15]/div/div[3]")
	public WebElement DateField;
	
	@FindBy(name = "startDate")
	public WebElement FromDate;
	
	@FindBy(name = "endDate")
	public WebElement ToDate;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement ReportSaveBtn;
	
	@FindBy(name = "reportName")
	public WebElement ReportName;
	
	@FindBy(name = "reportDevName")
	public WebElement ReportUniqueName;
	
	@FindBy(xpath = "/html/body/div[18]/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement SaveAndRun;
	
	
	
	
	
	
}
