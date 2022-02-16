Feature: Performance of MXReportes application and actions

 Background: 
    Given user is on home page of MobilityX application after entering valid login id and Password

  Scenario:  Verify MXReports Real Estate page load time and time required to performe differnt actions on Real Estate page
    Given He is on MXReports Real Estate Tab with default filter applied
    When He applies different filters and perform following actions on different sections in Real Estate tab
      | Screen Capture | Download |
    Then He should be able to see reports on Real Estate tab within expected time