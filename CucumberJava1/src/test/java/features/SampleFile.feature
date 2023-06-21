Feature: To test the functionality of Facebook Login

  Scenario: Positive test to check if the error message is being displayed or not
    Given Browser is launched
    And User hits the facebook url
    When user enters incorrect credentials and click on Login button
    Then verify that the error message is displayed
