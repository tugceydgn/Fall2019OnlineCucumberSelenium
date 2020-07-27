@view_calendar_events
Feature: View all calendar events
  As user, I want to be able to see all calendar events as a table

  Scenario: User permission
    Given user is on the landing page
    When user logs is as a sales manager
    And user navigates to "Activities" and "Calendar Events"
    Then View Per Page menu should have following options
      | 10  |
      | 25  |
      | 50  |
      | 100 |