package stepsdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidationAlertsFrameWindowQuestion;
import tasks.AlertsFrameWindows;
import tasks.DeleteAccount;
import tasks.FormsTask;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static utils.Constants.USER;
import static stepsdefinition.BookStoreStepsDefinition.data;

public class AlertsFramesWindowsStepsDefinition {

    @When("select the alerts frams windows")
    public void selectTheAlertsFramsWindows() {
        USER.attemptsTo(AlertsFrameWindows.inDemoQa());
    }

    @When("fill out the form")
    public void fillOutTheForm() {
        USER.attemptsTo(FormsTask.inDemoQa(data.get("FirstNameTwo"), data.get("LastNameTwo"), data.get("Email"),
                data.get("Mobile"), data.get("Mounth"), data.get("Year"), data.get("Subjects"), data.get("Address"),
                data.get("State"), data.get("City")));
        USER.attemptsTo(DeleteAccount.inDemoQa(data.get("UserName"), data.get("Password")));
    }

    @Then("the deletion of the profile will be validated")
    public void theDeletionOfTheProfileWillBeValidated() {
        USER.should(seeThat(ValidationAlertsFrameWindowQuestion.inDemoQa()));
    }
}
