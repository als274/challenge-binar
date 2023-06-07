@Register
Feature: Register
  Login in swaglabs
 @Login1
 Scenario: Login with correct credential
    Then user input correct nama "alda fajrin"
    Then user input correct email "alda@yahoo.com"
    Then user input correct password "12345678"
    Then user click submit button
@Login2
  Scenario: User submit data to register with wrong email
    Then user input correct name "alda fajrin"
    Then user input wrong format email "alda.com"
    Then user input correct password "1234578"
 @Login3
  Scenario: User submit data to register with blank password
    Then user input correct name "alda fajrin"
    Then user input correct email "alda@yahoo.com"
    Then user input blank password ""
 @Login4
 Scenario: User submit data to register with blank password
    Then user input blank name ""
    Then user input blank email ""
    Then user input blank password ""
    
    
  