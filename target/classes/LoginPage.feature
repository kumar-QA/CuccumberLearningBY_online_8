Feature: Verify complete loginfunction 

Background:
Given OpenBrowser and Enter Url

#@postiveTesting
#Scenario: verify loginfunction with valid credentails
  #When User Entered valid username
  #And User Entered valid password
  #When User Click On Login Btn
  #Then It should display Dashboardapage
  #And close the browser
  #
  #@NegativeTesting
 #Scenario: verify loginfunction with invalid credentail
 #When User Entered invalid username
 #And User Entered invalid password
 #When User Click On Login Btn
 #Then It should display Error message
 #And close the browser
@multiple
#Scenario Outline: verify loginfunction with multiple sets of data
  #When User Entered valid username as<username>
  #And User Entered valid password as<password>
  #When User Click On Login Btn
  #Then It should display Dashboardapage
  #And close the browser
  #
  #Examples:
   #|     username        | password |
   #|     abc             |  abc123  | 
   #|     def             |  def123  | 
   #|     xyz             |  xyz123  |
   #|  admin@yourstore.com|  admin   |
#
  #
  

