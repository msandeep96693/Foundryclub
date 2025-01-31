package StepDefinitions;

import org.openqa.selenium.WebDriver;

import ObjectPage.PagecreateIncentives;
import io.cucumber.java.en.*;

public class StepCreateincentives {
	
	WebDriver driver;
	
	@When("user click on incentives from left navigation")
	public void user_click_on_incentives_from_left_navigation() {
		PagecreateIncentives as= new PagecreateIncentives(driver);
		
	}

	@And("user click on incentive+ button")
	public void user_click_on_incentive_button() {

	}

	@And("user validate the label name and select mini club name option")
	public void user_validate_the_label_name_and_select_mini_club_name_option() {
	    
	}

	@And("user validate the label name and enter the title name as {string}")
	public void user_validate_the_label_name_and_enter_the_title_name_as(String string) {
	    
	}

	@And("user validate the label name and select the start date from calender")
	public void user_validate_the_label_name_and_select_the_start_date_from_calender() {
	    
	}

	@And("user validate the label name and select the end date from calender")
	public void user_validate_the_label_name_and_select_the_end_date_from_calender() {
	   
	}

	@And("user validate the label name and Add an image")
	public void user_validate_the_label_name_and_add_an_image() {
	    
	}

	@And("user validate the label name and enter the max submission data as {int}")
	public void user_validate_the_label_name_and_enter_the_max_submission_data_as(Integer int1) {
	    
	}

	@And("user validate the label name and enter the Eligible winner data as {int}")
	public void user_validate_the_label_name_and_enter_the_eligible_winner_data_as(Integer int1) {
	    
	}

	@And("user validate the label name and enter the winner {int} Title as {string}")
	public void user_validate_the_label_name_and_enter_the_winner_title_as(Integer int1, String string) {
	  
	}

	@And("user validate the label name and enter the winner {int} amount {int}")
	public void user_validate_the_label_name_and_enter_the_winner_amount(Integer int1, Integer int2) {
	    
	}

	@And("user click on winner title+ icon")
	public void user_click_on_winner_title_icon() {
	    
	}

	@And("user validate the link {int} label name and enter the Link {string}")
	public void user_validate_the_link_label_name_and_enter_the_link(Integer int1, String string) {
	    
	}

	@And("user validate incentive details label name and enter the incentive details as {string}")
	public void user_validate_incentive_details_label_name_and_enter_the_incentive_details_as(String string) {
	    
	}

	@And("user validate the create button and click on it")
	public void user_validate_the_create_button_and_click_on_it() {
	   
	}

	@Then("user incentive is created successfully and navigate to incentive details page")
	public void user_incentive_is_created_successfully_and_navigate_to_incentive_details_page() {
	   
	}

	@Then("user validate the incentive details")
	public void user_validate_the_incentive_details() {
	    
	}

}
