#Feature: Performance of MXReportes application and actions
#
  #Background: He is on Home page of MxReports
    #Given He is on home page of MobilityX application as a client user
#
  #Scenario Outline: MXReports page load times
    #Given He is on MXReports reports <specific page>
    #When He applies different filters and perform following actions
      #| Screen Capture | Download |
    #Then He should be able to see reports page within expected time as follows
#
    #Examples: 
      #| specific page |
      #| Activity      |
      #| Spending      |
      #| Real Estate   |
      #| Perfomance    |
