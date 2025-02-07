package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Base.Drivertest;
import ObjectPage.PagecreateIncentives;
import io.cucumber.java.en.*;

public class StepCreateincentives {
	
	WebDriver driver;
	PagecreateIncentives incentives;
	
	@When("user click on incentives from left navigation")
	public void user_click_on_incentives_from_left_navigation() {
		driver = Drivertest.getDriver();
		incentives = new PagecreateIncentives(driver);
		
		incentives.LeftnvigationIncentiveButton();
		
	}

	@And("user click on incentive+ button")
	public void user_click_on_incentive_button() {
		incentives.clickonincentiveaddbutton();
		
	}

	@And("user validate the label name and select mini club name option")
	public void user_validate_the_label_name_and_select_mini_club_name_option() {
		incentives.Dropdownlabelnamevalidation("Mini Club");
		incentives.selectionofminiclubdropdownoptionlist("Investors Hub");
		
	}

	@And("user validate the label name and enter the title name as")
	public void user_validate_the_label_name_and_enter_the_title_name_as() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Title", "Automation Incentives", 0, 0, 0, null, null, null, null);
	    
	}

	@And("user validate the label name and select the start date from calender")
	public void user_validate_the_label_name_and_select_the_start_date_from_calender() {
		incentives.Actionsoncalenderstartandenddatefields("Start date", 2025, "FEB", 7);
	    
	}

	@And("user validate the label name and select the end date from calender")
	public void user_validate_the_label_name_and_select_the_end_date_from_calender() {
		incentives.Actionsoncalenderstartandenddatefields("Last date", 2025, "FEB", 10);
	}

	@And("user validate the label name and Add an image")
	public void user_validate_the_label_name_and_add_an_image() {
		incentives.Allcomponenttextfieldlabelnamevalidation(null, null, 0, 0, 0, null, null, null, "Add an Image");
	}

	@And("user validate the label name and enter the max submission data as")
	public void user_validate_the_label_name_and_enter_the_max_submission_data_as() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Max Submission", null, 30, 0, 0, null, null, null, null);
	}

	@And("user validate the label name and enter the Eligible winner data as")
	public void user_validate_the_label_name_and_enter_the_eligible_winner_data_as() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Eligible Winner", null, 0, 1, 0, null, null, null, null);
	}

	@And("user validate the label name and enter the winner Title as")
	public void user_validate_the_label_name_and_enter_the_winner_title_as() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Winner 1 Title",null, 0, 0, 0, "Level 1", null, null, null);
	}
	
	@When("user click on currency dropdown1 and select the option")
	public void user_click_on_currency_dropdown_and_select_the_option() {
		incentives.Dropdownlabelnamevalidation("Winner 1 Amount");
	   incentives.selectionofcurrencydropdownoptionlist(" INR ₹");
	}

	@And("user validate the label name and enter the winner amount")
	public void user_validate_the_label_name_and_enter_the_winner_amount() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Winner 1 Amount", null, 0, 0, 2000, null, null, null, null);
	}


	@And("user click on winner title+ icon")
	public void user_click_on_winner_title_icon() {
		incentives.addwinnerbuttonplusicon();
	}
	
	@And("user validate the label name and enter the winner Title2 as")
	public void user_validate_the_label_name_and_enter_the_winner_title2_as() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Winner 2 Title",null, 0, 0, 0, "Level 2", null, null, null);
	}
	
	
	@And("user validate the label name and enter the winner amount2")
	public void user_validate_the_label_name_and_enter_the_winner_amount2() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Winner 2 Amount", null, 0, 0, 1000, null, null, null, null);
	}

	@And("user validate the link label name and enter the Link")
	public void user_validate_the_link_label_name_and_enter_the_link() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Link 1", null, 0, 0, 0, null, "https://www.incentives.com", null, null);
	}

	@And("user validate incentive details label name and enter the incentive details as")
	public void user_validate_incentive_details_label_name_and_enter_the_incentive_details_as() {
		incentives.Allcomponenttextfieldlabelnamevalidation("Incentive Details", null, 0, 0, 0, null, null, "Incentives Automation", null);
	}

	@And("user validate the create button and click on it")
	public void user_validate_the_create_button_and_click_on_it() {
		incentives.clickoncreatebutton("Create");
	}

	@Then("user incentive is created successfully and navigate to incentive details page")
	public void user_incentive_is_created_successfully_and_navigate_to_incentive_details_page() {
		System.out.println("created successfully");
	}

	@Then("user validate the incentive details")
	public void user_validate_the_incentive_details() {
	    System.out.println("Validate incentive details");
	}

}
