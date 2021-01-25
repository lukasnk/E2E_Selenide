Feature: Login Action

  Scenario Outline: User with login '<User>' correctly logs in
    Given The user is on the main page
    And The user clicks 'My Account'
    When The user write login ''
    And The user write password ''
    And The user clicks 'Sign in'
    Then The user can see main page as logged user

    Examples:
      | User |
      |      |