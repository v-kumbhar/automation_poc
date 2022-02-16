Feature: Performance of MXReportes application and actions

 Background: 
    Given user is on home page of MobilityX application after entering valid login id and Password

  Scenario: Verify MXReports Spending page load time and time required to performe differnt actions on Spending page
    Given He is on MXReports Spending Tab with default filter applied
    When He applies different filters and perform following actions on different sections in Spending tab
      | Screen Capture | Download |
    Then He should be able to see reports on Spending tab within expected time