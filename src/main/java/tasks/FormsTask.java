package tasks;

import interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static userinterfaces.AlertsFramesWindows.*;
import static userinterfaces.BookStroreUi.*;
import static userinterfaces.BookStroreUi.TXT_FIRST_NAME;
import static userinterfaces.BookStroreUi.TXT_LAST_NAME;
import static utils.Constants.PICTURE;

public class FormsTask implements Task {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String mobile;
    private final String month;
    private final String year;
    private final String subjects;
    private final String address;
    private final String state;
    private final String city;

    public FormsTask(String firstName, String lastName, String email, String mobile, String month, String year,
                     String subjects, String address, String state, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.month = month;
        this.year = year;
        this.subjects = subjects;
        this.address = address;
        this.state = state;
        this.city = city;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_FORMS),
                Scroll.to(BTN_FORMS),
                JavaScriptClick.on(BTN_FORMS),
                WaitInteractions.untilAppears(BTN_PRACTICE_FORMS),
                JavaScriptClick.on(BTN_PRACTICE_FORMS),
                WaitInteractions.untilAppears(TXT_FIRST_NAME),
                Scroll.to(TXT_FIRST_NAME),
                Enter.theValue(firstName).into(TXT_FIRST_NAME),
                WaitInteractions.untilAppears(TXT_LAST_NAME),
                Enter.theValue(lastName).into(TXT_LAST_NAME),
                WaitInteractions.untilAppears(TXT_EMAIL),
                Enter.theValue(email).into(TXT_EMAIL),
                WaitInteractions.untilAppears(BTN_GENDER),
                Scroll.to(BTN_GENDER),
                Click.on(BTN_GENDER),
                WaitInteractions.untilAppears(TXT_NUMBER),
                Enter.theValue(mobile).into(TXT_NUMBER),
                WaitInteractions.untilAppears(TXT_MONTH),
                SelectFromOptions.byVisibleText(month).from(TXT_MONTH),
                WaitInteractions.untilAppears(TXT_YEAR),
                SelectFromOptions.byVisibleText(year).from(TXT_YEAR),
                WaitInteractions.untilAppears(BTN_DAY),
                Click.on(BTN_DAY),
                WaitInteractions.untilAppears(TXT_SUBJECTS),
                Enter.theValue(subjects).into(TXT_SUBJECTS).thenHit(Keys.ENTER),
                WaitInteractions.untilAppears(BTN_MUSIC),
                Click.on(BTN_MUSIC),
                SendKeys.of(PICTURE).into(BTN_PICTURE),
                WaitInteractions.untilAppears(TXT_CURRENT_ADDRESS),
                Enter.theValue(address).into(TXT_CURRENT_ADDRESS),
                WaitInteractions.untilAppears(TXT_STATE),
                Enter.theValue(state).into(TXT_STATE).thenHit(Keys.ENTER),
                WaitInteractions.untilAppears(TXT_CITY),
                Enter.theValue(city).into(TXT_CITY).thenHit(Keys.ENTER),
                WaitInteractions.untilAppears(BTN_SUBMIT),
                Click.on(BTN_SUBMIT),
                WaitInteractions.untilAppears(BTN_CLOSE),
                Click.on(BTN_CLOSE),
                WaitInteractions.untilAppears(BTN_BOOK_STORE_APPLICATION),
                Scroll.to(BTN_BOOK_STORE_APPLICATION),
                Click.on(BTN_BOOK_STORE_APPLICATION),
                WaitInteractions.untilAppears(BTN_PROFILE),
                Click.on(BTN_PROFILE)
        );
    }

    public static FormsTask inDemoQa(String firstName, String lastName, String email, String mobile, String month,
                                     String year, String subjects, String address, String state, String city) {
        return Tasks.instrumented(FormsTask.class, firstName, lastName, email, mobile, month, year, subjects, address
                , state, city);
    }
}
