Feature: Login flow functionality

  Background: 
    Given user should navigate to the login page
    When user enter url as "https://tfc.tech-active.com/sign-in"

  Scenario: Login by valid credentials
    And user enter the valid email address "admin@foundry.com"
    And user enter the valid password "1234"
    And user click on remember me check box
    And user click on sign in button
    Then user successfully logged into the application
    Then user validate the dashboard

  #Scenario: Login by invalid credentials
    #And user enter the invalid email address "admin@foundry.in"
    #And user enter the invalid password "12341234"
    #And user click on remember me check box
    #And user click on sign in button
    #Then proper error message should display for a particular field
#
  #Scenario: Login by valid email address and invalid password
    #And user enter the valid email address "admin@foundry.com"
    #And user enter the invalid password "12341234"
    #And user click on remember me check box
    #And user click on sign in button
    #Then proper error message should display for a particular field
#
  #Scenario: Login by invalid email address and valid password
    #And user enter the invalid email address "admin@foundry.in"
    #And user enter the valid password "1234"
    #And user click on remember me check box
    #And user click on sign in button
    #Then proper error message should display for a particular field
