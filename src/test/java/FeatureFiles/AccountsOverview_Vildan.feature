
Feature: Accounts Overview Functionality

  Background:
    Given Navigate to ParaBank
    When  Enter username and password and click login button
    Then welcome message should be  displayed

Scenario:  Accounts Overview
  And  Click on the accountsOverview button


  Then should see customer data details
  And click on an account number
  And should see activity list
  And click on credit, debit and All button
  And should see "Transaction Details" as mentioned in customer data


