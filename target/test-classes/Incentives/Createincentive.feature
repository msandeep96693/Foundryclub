Feature: Mini club 

Scenario: Create mini club 
Given user should navigate to the login page
When user enter url as "https://tfc.tech-active.com/sign-in"
And user enter the valid email address "admin@foundry.com"
And user enter the valid password "1234"
And user click on remember me check box
And user click on sign in button
Then user successfully logged into the application
Then user validate the dashboard
When user click on incentives from left navigation
And user click on incentive+ button
And user validate the label name and select mini club name option
And user validate the label name and enter the title name as " Automation Incentives"
And user validate the label name and select the start date from calender
And user validate the label name and select the end date from calender
And user validate the label name and Add an image 
And user validate the label name and enter the max submission data as 10
And user validate the label name and enter the Eligible winner data as 2
And user validate the label name and enter the winner 1 Title as "LEVEL 1"
And user validate the label name and enter the winner 1 amount 1500
And user click on winner title+ icon 
And user validate the label name and enter the winner 2 Title as "LEVEL 2"
And user validate the label name and enter the winner 2 amount 2500
And user validate the link 1 label name and enter the Link "https://www.incentives.com"
And user validate incentive details label name and enter the incentive details as " Automation incentives"
And user validate the create button and click on it
Then user incentive is created successfully and navigate to incentive details page
Then user validate the incentive details 