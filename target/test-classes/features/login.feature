Feature: Login feature

  Scenario: Login succesfull
    Given user go to login page
    Then user enter the username
    And user enter the password as "password@123"
    And click the submit button

  Scenario: Login Failure
    Given user go to login page
    Then user enter the username
    And user enter the wrong password
    And click the submit button
