Feature: Test For google Application

  Scenario: Verify Title of google page
    Given Browser should open app should launch
    When User captures Title of google page
    Then Expected and Actual Title should match
