package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserMenuPage {
	
	
	public UserMenuPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath  = "//input[@id='username']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//*[@id='Login']")
	public WebElement Login;
	
	@FindBy(id = "userNav")
	public WebElement UserMenu;
	
	
	@FindBy(xpath =  "/html/body/div[1]/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[1]")
	public WebElement myprofile;
	
	@FindBy(className =  "vfButtonBarButton")
	public WebElement edit;
	
	@FindBy(id = "aboutTab")
	public WebElement aboutTab;
	
	
	@FindBy(id = "lastName")
	public WebElement LastName;

	
	@FindBy(xpath =   "/html/body/div/div/div/div[2]/form/div/input[1]")
	public WebElement AboutTabSaveButton;
	
	
	@FindBy(id = "publisherAttachTextPost")
	public WebElement post;
	
	
	@FindBy(xpath =   "/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/iframe")
	public WebElement postiframe;
	
	@FindBy(xpath =   "/html/body")
	public WebElement postbody;
	
	@FindBy(className =  "publisherShareButtonPlaceholder")
	public WebElement ShareButton;
	
	@FindBy(id =  "publisherAttachContentPost")
	public WebElement FileLink;
	
	
	@FindBy(id =  "chatterUploadFileAction")
	public WebElement SelectFile;
	
	@FindBy(name =  "chatterFile")
	public WebElement ChoseFile;
	
	
	@FindBy(xpath =  "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[2]")
	public WebElement mySettings;
	
	
	@FindBy(id =  "PersonalInfo")
	public WebElement personalLink;

	
	@FindBy(id =  "LoginHistory_font")
	public WebElement historyLink;

	
	@FindBy(className =  "pShowMore")
	public WebElement downloadHistory;
	
	

	@FindBy(id =  "DisplayAndLayout")
	public WebElement display;
	
	

	@FindBy(id =  "CustomizeTabs_font")
	public WebElement CustomiseTab;
	


	@FindBy(id =  "p4")
	public WebElement dropdown;
	
	@FindBy(xpath =  "/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[2]/table/tbody/tr[2]/td/select/option[9]")
	public WebElement sfChatter;
	
	
	@FindBy(xpath =  "/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[2]/table/tbody/tr[4]/td/div/table/tbody/tr/td[1]/select/option[72]")
	public WebElement report;
	

	@FindBy(id= "duel_select_0_right")
	public WebElement Add;
	
	
	
	@FindBy(xpath =  "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement tabSaveButton;
	
	
	@FindBy(id =  "EmailSetup")
	public WebElement email;
	
	@FindBy(id =  "EmailSettings_font")
	public WebElement emailsetting;
	
	@FindBy(id =  "sender_name")
	public WebElement emailName;
	
	@FindBy(xpath =    "//*[@id=\"sender_email\"]")
	public WebElement emailAddress;
	
	@FindBy(id =  "auto_bcc1")
	public WebElement bbcButton;
	
	@FindBy(name =  "save")
	public WebElement emailSaveButton;
	
	@FindBy(id =  "CalendarAndReminders")
	public WebElement Calender;
	
	@FindBy(id =  "Reminders_font")
	public WebElement ActivityReminder;
	
	@FindBy(id =  "testbtn")
	public WebElement OpenTestRem;
	
	@FindBy(xpath =    "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[3]")
	public WebElement devConsole;
	
	
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]")
	public WebElement Logout;
	
	
	
	
}
