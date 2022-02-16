Feature: Add an new authorization

  Background: 
    Given user is on home page of MobilityX application after entering valid login id and Password

  Scenario: Adding a new authorization
    Given user clicks on Create an Authorization menu 
    When user clicks on Submit to Aires option after filling all mandetory information
    Then user should get submit to AIRES message
    
    

    
    
