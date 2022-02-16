Feature: Performance of MXReportes application and actions

 Background: 
    Given user is on home page of MobilityX application after entering valid login id and Password

  Scenario: Verify MXReports My Reports page load time and time required to perform differnt actions on My Reports page
    Given He is on MXReports My Reports Tab with default filter applied
    When He applies different filters and perform following actions on different sections in Performance tab
      | Screen Capture | Download |
    Then He should be able to see reports on Performance tab within expected time