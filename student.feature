Feature: Student API Testing

  Scenario: Get student details
    Given url 'http://localhost:4003/students'
    When method GET
    Then status 200
    And match response.id == 1
    And match response.name == 'Deekshitha'

  Scenario: Get student name
    Given url 'http://localhost:4003/students/name'
    When method GET
    Then status 200
    And match response == 'Deekshitha'
