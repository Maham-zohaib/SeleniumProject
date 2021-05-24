package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {

	
	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath  = "//input[@id='username']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//*[@id='Login']")
	public WebElement Login;
	
	@FindBy(xpath = "//*[@id=\"Opportunity_Tab\"]/a")
	public WebElement oppoTab;
	
	@FindBy(className  ="bFilter")
	public WebElement oppoDropDown;
	
	@FindBy(xpath  = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input")
	public WebElement newOppoBtn;
	
	@FindBy(id  = "opp3")
	public WebElement newOppoName;
	
	@FindBy(id  = "opp4")
	public WebElement newOppoAccName;
	
	@FindBy(id  = "opp9")
	public WebElement closeDate;

	@FindBy(xpath  = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[4]/td[4]/div/span/select/option[2]")
	public WebElement stage;
	
	@FindBy(id  = "opp12")
	public WebElement probability;

	@FindBy(xpath  = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[6]/td[2]/span/select/option[2]")
	public WebElement leadSource;

	@FindBy(id  = "opp17")
	public WebElement campaignSource;

	@FindBy(xpath  = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")
	public WebElement oppoPipeLine;

	@FindBy(xpath  = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")
	public WebElement StuckOppoLink;

	@FindBy(xpath  = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[1]/td/select/option[3]")
	public WebElement interval;

	@FindBy(xpath  = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[2]/td/select/option[3]")
	public WebElement include;

	@FindBy(xpath  = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[3]/td/input")
	public WebElement runReport;






}
