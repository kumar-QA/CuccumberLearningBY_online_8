Feature: Verify complete loginfunction 

Scenario: verify loginfunction with valid credentails
  Given OpenBrowser and Enter Url
  When User Entered valid username
  And User Entered valid password
  When User Click On Login Btn
  Then It should display Dashboardapage
  And close the browser
  
 #Scenario: verify loginfunction with invalid credentail
 #Given OpenBrowser and Enter Url
 #When User Entered invalid username
 #And User Entered invalid password
 #When User Click On Login Btn
 #Then It should display Error message
 #And close the browser


  
  
  

