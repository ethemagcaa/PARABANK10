Feature: Update contact info
  Background:
  Scenario: Login with valid username and password
    Given Navigate to ParaBank
    When  Enter username and password and click login button


  Scenario: Apply for the Loan Request
    When User clicks on the button of request loan
    Then User fills money data
    And User selects an account number
    Then User clicks on the button of apply now
    And Loan request processed information is verified
    And Approved message is displayed
    And User clicks on new account number
    Then Account details information is verified
