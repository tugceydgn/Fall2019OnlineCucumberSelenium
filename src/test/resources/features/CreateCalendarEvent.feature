@activities
Feature: Create calendar event
  As user, I want to be able to create calendar events.

  Scenario: Create calendar event as sales manager
    Given user is on the landing page
    When user logs is as a sales manager
  And user navigates to "Activities" and "Calendar Events"
