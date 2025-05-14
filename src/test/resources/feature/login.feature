@tag1
Feature: Validate the user login into instagram account

  Scenario: Login to Instagram
    Given User enter the username
    Given user enter the password
    Then user click on the login button

  #Examples:
  #| user | password | status|
  #| name1 |     5 | success |
  #| name2 |     7 | Fail    |
  Scenario: reset to Reels content
    Given Click on the save login info
    Then Click on the more button
    Then Click on the setting  button
    Then click on the content perferance button
    Then Click on the sensetive Content button
    Then Click on the Less radio button
    Then Click on the Save button
    Then Logout Instagram
