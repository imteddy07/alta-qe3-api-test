Feature: reqresin
cek cek
  Scenario: Success Get Users
    Given user set GET request
    When user send GET request to reqres.in
    Then response status code should be 200
    And response structure should match json schema "user.json"

  Scenario: Success Post Create
    Given user set Post request
    When user send Post Create request to reqres.in
    Then response status code should be 200
    And user get the token

  Scenario: Success Register User
    When user send Post Register request to reqres.in
    And user input email data
    And user input password data
    Then response status code should be 200
    And user get the token