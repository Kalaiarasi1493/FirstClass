Feature: To validate the functionality of facebook

  Scenario Outline: To verify login with invalid credentials
    Given user is on facebook page
    When user enter the "<username>" and pass "<password>"
    Then user click the login button

    Examples: 
      | username | password |
      | kalai    | k12345   |
      | arasi    | a2345    |
      | dev      | d2345    |
