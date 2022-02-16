Feature: Login and Logout to MobilityX

  Background: 
    Given user is on login page of MobilityX application

  Scenario: Login to MobilityX Application
    Given user enters valid username and password
    When user clicks on Login button
    Then user should redirect to home page of MobilityX application

  Scenario: Logout from AiresRelonet
  	Given user enters valid username and password
  	And user clicks on Login button
    And user is on home page of MobilityX application
    When user clicks on Log out button
    Then user should redirect to login page 
    
    
    