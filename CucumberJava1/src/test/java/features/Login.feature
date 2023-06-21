@e2e
Feature: Application Login Test

  @WebTest @SR-12127
  Scenario: Home page default login test
    Given User is on NetBanking landing page
    When User login into application with "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"

  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
      | jenny | abcd | john@abcd.com | Australia | 3242353 |
    Then Home page is populated
    And Cards displayed are "false"

  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"

  @MobileTest @dataTable
  Scenario: Datatable feature
    Given User is on NetBanking landing page
    When User sign up with following details
      | jenny | abcd | john@abcd.com | Australia | 3242353 |
    Then Home page is populated
    And Cards displayed are "false"

  @WebTest @Rakesh
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login in to application with <Username> and password <password>
    Then Home page is populated
    And Cards displayed are "true"

  @WebTest @ScenarioOutline
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login in to application with <Username> and password <password>
    Then Home page is populated
    And Cards displayed are "true"

    Examples: 
      | Username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |
      | user5    | pass5    |
      | user6    | pass6    |
      | user7    | pass7    |
      | user8    | pass8    |
      | user9    | pass9    |
