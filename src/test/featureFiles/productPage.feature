Feature: verifying complete products page functionality

 @link
  Scenario: verify productpage link
  Given OpenBrowser and Enter Url
  When User Entered valid username
  And User Entered valid password
  When User Click On Login Btn
  And User clicked on catalog link
  When User clicked on productlink
  Then it should display Products page
  
  
  @postiveTesting
 Scenario: verifying searchproduct Functionality
  Given OpenBrowser and Enter Url
  When User Entered valid username
  And User Entered valid password
  When User Click On Login Btn
  And User clicked on catalog link
  When User clicked on productlink
  And  User Enterd productname
  And user clicked on searchBtn
  Then particular product details should be displayed
