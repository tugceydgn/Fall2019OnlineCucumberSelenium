package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.activities.CalendarEventPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateCalendarEventStepDefinitons {

    CalendarEventPage calendarEventPage = new CalendarEventPage();

    @Then("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {
        calendarEventPage.clickToCreateCalendarEvent();
    }

    @Then("user enters {string} as title")
    public void user_enters_as_title(String string) {
        System.out.println("User enters title: " + string);
        calendarEventPage.enterCalendarEventTitle(string);
    }

    @Then("user enters {string} as description")
    public void user_enters_as_description(String string) {
        System.out.println("User enters description: " + string);
        calendarEventPage.enterCalendarEventDescription(string);
    }

    @Then("user clicks on save and close button")
    public void user_clicks_on_save_and_close_button() {
        System.out.println("User click on save and close button");
        calendarEventPage.clickOnSaveAndClose();
    }

    @Then("user verifies that description of new calendar event is {string}")
    public void user_verifies_that_description_of_new_calendar_event_is(String string) {
        Assert.assertEquals(string, calendarEventPage.getGeneralInfoDescription());
    }

    @Then("user verifies that title of new calendar event {string}")
    public void user_verifies_that_title_of_new_calendar_event(String string) {
        Assert.assertEquals(string, calendarEventPage.getGeneralInfoTitleText());
    }

}
