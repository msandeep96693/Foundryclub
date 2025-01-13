package ObjectPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;					
import org.openqa.selenium.WebElement;					
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

					
					
public class PageLogin {                              // extends Elementutils 
					
//	WebDriver driver;				
					
	private WebDriver driver;

	public PageLogin(WebDriver driver) {				
	super();
	this.driver = driver;		
	PageFactory.initElements(driver, this);	
	}	
				
	@FindBy(xpath = "//input[@id='email'] ") private WebElement emailaddress;
	@FindBy(xpath = "mat-label[.='Email address'] ") private WebElement emailvalidation;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "// mat-label[.='Password'] ") private WebElement passwordvalidation;
	@FindBy(xpath = "//label[.=' Remember me ']") private WebElement remembermecheckbox;
	@FindBy(xpath = "label[.=' Remember me '] ") private WebElement remembermevalidation;
	@FindBy(xpath = "//span[.=' Sign in ']/span") private WebElement signinbutton;
	@FindBy(xpath = "//span[.=' Sign in ']/span") private WebElement signinbuttonvalidation;
	
	@FindBy(xpath = "(//div[.='Hello, Admin'])[2]") private WebElement dashboardvalidation;
	@FindBy(xpath = "//div[contains(text(),'Welcome')]") private WebElement navigatevalidation;

	
	// ERROR MESSAGES 
	
	@FindBy(xpath = "//div[contains(text(), 'Invalid')]") private WebElement invalidemailaddressandpassworderrormessage;
		
	
	


	String emaillabel = "Email address";
	public void validateemailaddresslabel() {
		emailvalidation.equals(emaillabel);
		System.out.println("EMAIL ADDRESS FIELD NAME :- "+emailvalidation.getText());
	}
					
	public void Emailfield(String Mail) {				
		emailaddress.clear();			
		emailaddress.sendKeys(Mail);			
	}				
	
	String passwordlabel = "Password";
	public void validatepasswordlabel() {
		passwordvalidation.equals(passwordlabel);
		System.out.println("PASSWROD FIELD LABEL NAME :- "+passwordvalidation.getText());
	}
	
	public void Passwordfield(String Pass) {				
		password.clear();			
		password.sendKeys(Pass);			
	}	
	
	String remembermelabel = "Remember me";
	public void validateremembermelabel() {
		remembermevalidation.equals(remembermelabel);
		System.out.println("CHECK BOX NAME :- "+remembermevalidation.getText());
	}
	
	public void rememberme() {
		remembermecheckbox.click();
	}
	
	String signinbuttonlabel = " Sign in ";
	public void validatesigninbuttonlabel() {
		signinbuttonvalidation.equals(signinbuttonlabel);
		System.out.println("SIGN IN BUTTON NAME :- "+signinbuttonvalidation.getText());
	}
	
	public void SigninButton() {				
		signinbutton.click();			
	}
	
	public void invaliderrormessage() {
		invalidemailaddressandpassworderrormessage.getText();
	}
	
	public void invalidemailfield(String Mail) {				
		emailaddress.clear();			
		emailaddress.sendKeys(Mail);			
	}
	
	public void navigatevalidationdashboard() {
		String welcometext = "Welcome! You have successfully logged into your account.";
		String welcomevalidation = navigatevalidation.getText();
		if(welcometext.equals(welcomevalidation)) {
			System.out.println("Welcome! You have successfully logged into your account.");
		} else {
			System.out.println("WELCOME TO FOUNDRY CLUB");
		}
		System.out.println(dashboardvalidation.getText());
	}
	
	
}					
						
						


