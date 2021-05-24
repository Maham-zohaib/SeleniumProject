package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath  = "//input[@id='username']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//*[@id='Login']")
	public WebElement Login;
	
	@FindBy(xpath = "//*[@id='rememberUn']")
	public WebElement RememberMe;
	
	@FindBy(xpath = "//*[@id='error']")
	public WebElement Errormsg;
	
	@FindBy(id = "userNav")
	public WebElement UserMenu;
	
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]")
	public WebElement Logout;
	
	
	@FindBy(xpath = "//*[@id=\"forgot_password_link\"]")
	public WebElement FrgtPass;
	
	
	@FindBy(id = "un")
	public WebElement FpUsername;
	
	@FindBy(id = "continue")
	public WebElement Continue;
	
	@FindBy(className =  "loginError")
	public WebElement wrongUPerrormsg;
	

}