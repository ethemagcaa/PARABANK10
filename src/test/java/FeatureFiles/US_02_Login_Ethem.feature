Feature: Login functionality

  Scenario Outline: Login with invalid username and password
    Given Navigate to ParaBank
    When Click sign-in button and enter "<userName>" and "<password>" and click sign-in button
    Then Error message should be displayed

    Examples:
      | userName    | password |
      | eto      |  |
      |          | 123qw |
      | teamzxc     | 1234 |
      | asd     | asd123 |
      | Mr eto   | 12345 |
      | user | password |

  Scenario: Login with valid username and password
    Given Navigate to ParaBank
    When  Enter username and password and click login button
    Then welcome message should be  displayed
    When click logout button
