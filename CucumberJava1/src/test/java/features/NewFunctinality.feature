Feature: Testing the Login page of Faacebook Application

@TestcaseAplha
  Scenario: Positive scenario with valid credentials
    Given that the user has lauched the application
    And User have provided the valid credentials and clicked on login button
    Then verify that the Timeline is displayed for invalid login