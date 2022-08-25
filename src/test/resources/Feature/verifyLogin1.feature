Feature: Validation of Login scenario

  #Author:Aniket
  Scenario: Login with valid credential
    Given Open the browser
    When Enter valid username "<login.username>" and Password "<login.password>"
    Then execute successfully
    
  Examples:
  |login.username|login.password|
    |username|password|
    |username1|password1|
