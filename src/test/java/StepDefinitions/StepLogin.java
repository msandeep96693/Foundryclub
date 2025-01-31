package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Base.Drivertest;
import Hooks.Myhooks;
import ObjectPage.PageLogin;
import io.cucumber.java.en.*;

public class StepLogin {	
	

		 WebDriver driver;
		 PageLogin login;
	

	@Given("user should navigate to the login page")
	public void user_should_navigate_to_the_login_page() {
		driver = Drivertest.getDriver();
		login = new PageLogin(driver);
		
		System.out.println("User navigate to login page");
		
	}
	
	@When("user enter url as {string}")
	public void user_enter_url_as(String url) {
		driver.get(url);
		
	}
	
	@When("user enter the valid email address {string}")
	public void user_enter_the_valid_email_address(String mail) {
		login.validateemailaddresslabel();
	    login.Emailfield(mail);
	}
	
	@When("user enter the valid password {string}")
	public void user_enter_the_valid_password(String pass) {
		login.validatepasswordlabel();
	    login.Passwordfield(pass);
	}
	
	@When("user click on remember me check box")
	public void user_click_on_remember_me_check_box() {
	   login.validateremembermelabel();
	   login.rememberme();
	}
	
	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
	  login.validatesigninbuttonlabel();
	  login.SigninButton();
	}
	
	@Then("user successfully logged into the application")
	public void user_successfully_logged_into_the_application() throws InterruptedException {
	  System.out.println("SUCCESSFUL");
	  login.navigatevalidationdashboard();
	}
	
	@Then("user validate the dashboard")
	public void user_validate_the_dashboard() {
//		System.out.println("SUCCESSFUL");
		login.dashboardtextvalidation();
	}
	

	
		}						
	
	
	
	
	
	
						
	
	
	
	
	
	
