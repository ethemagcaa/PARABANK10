Feature: Register functionality

  Scenario: Register with user information
    Given Navigate to ParaBank
    When click register button
      |registerButton|
    And User sending the keys in RegisterDialogContent
      |firstname|rabia|
      |lastname|cete|
      |address|türkiye|
      |city|hatay|
      |state|iskenderun|
      |zipcode|1233|
      |phone|55555|
      |ssn|123qwe|
      |username|rabia|
      |password|rabia|
      |confirm|rabia|

    When click register button
      |registerButton2|

    Then User should registered successfully