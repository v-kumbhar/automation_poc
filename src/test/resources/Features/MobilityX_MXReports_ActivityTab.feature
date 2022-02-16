Feature: Performance of MXReportes application and actions

 Background: 
    Given user is on home page of MobilityX application after entering valid login id and Password

  Scenario: MXReports page load times
    Given He is on MXReports Activity Tab with default filter applied
    When He applies different filters and perform following actions on different sections
      | Screen Capture | Download |
    Then He should be able to see reports within expected time


