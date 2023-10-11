Feature: New Account Functionality

  Background:
    Given Navigate to ParaBank
    When  Enter username and password and click login button
    Then welcome message should be  displayed

  Scenario: Creating a checking account
    When the user clicks on the Open New Account link
    And the user selects checking as the type of account to be opened from the Drop-Down menu
    And the user observes a notification regarding the minimum initial deposit requirement
    And the user clicks the Open New Account button
    Then the user should successfully create a Checking Account
    And the user should see the account number

  Scenario: Creating a saving account
    When the user clicks on the Open New Account link
    And the user selects savings as the type of account to be opened from the Drop-Down menu
    And the user observes a notification regarding the minimum initial deposit requirement
    And the user clicks the Open New Account button
    Then the user should successfully create a Saving Account
    And the user should see the account number