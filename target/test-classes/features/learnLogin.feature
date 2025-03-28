Feature: learn login feature

  #Scenario: login success
  #Given user enter into the login page
  #And user give the username as "student1"
  #Then user give the password as "Password123"
  #And user press the submit button
  Scenario Outline: login success
    Given user enter into the login page
    And user give the username as "<username>"
    Then user give the password as "<password>"
    And user press the submit button

    Examples: 
      | username | password     |
      | poongodi | poongodi123  |
      | ajai     | ajai12354654 |
