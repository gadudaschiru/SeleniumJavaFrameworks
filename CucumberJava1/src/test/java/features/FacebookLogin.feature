@WebTest
Feature: Application Login Test

  @FacebookLoginTest @Regression  @Smoke @TAC-2415 @rakesh
  Scenario: Verify that the Error Message is displayed for invalid credentials
    Given Login to the Facebook Application
    Then Verify that the error message is displayed
    And Close the Browser