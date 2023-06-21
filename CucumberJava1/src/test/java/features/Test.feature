Feature: Test the login feature of the application

  @facebookTest
  Scenario Outline: positive test for facebook login page
    Given Browser is launched with "Chrome"
    And Hit the url
    Then Verify that login page is displayed
    When user puts in the valid credentials and hits enter <username> and <password>
    Then verify that the login is successful

    Examples: 
      | username | password      |
      | rakesh   | hakoonamatata |
