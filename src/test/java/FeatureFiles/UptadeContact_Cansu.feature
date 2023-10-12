Feature: Update contact info
  Background:
  Scenario: Login with valid username and password
    Given Navigate to ParaBank
    When  Enter username and password and click login button
    Then welcome message should be  displayed

  Scenario: Update Contact Positive
    When Should be click update button
    Then SendKeys
      | firstName| nsl     |
      | lastname | cgl     |
      | address  | vietnam |
      | city     | bora    |
      | state    | thai    |
      | zipcode  | 33215   |
      | phone    | 68521483|
    And Click
      | buttonUpdateProfile |

    Then Should be see update message
    And Click
      | logout |
    When SendKeys
      | loginUser     | nsl    |
      | loginPassword | 123456 |
    Then Click
      | logInButton |
    When Should be click update button
    Then Checking the entered information



  Scenario: Update Contact Negative
    When Should be click update button
    Then Clear
    And Click
      | updateButton |
    Then Should be see errorMessage
    And Click
      | logout |
    When SendKeys
      | loginUser     | nsl    |
      | loginPassword | 123456 |
    Then Click
      | logInButton |
    When Should be click update button
    Then Checking the entered information