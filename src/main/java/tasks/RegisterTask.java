package tasks;

import interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;

import static userinterfaces.BookStroreUi.*;
import static userinterfaces.BookStroreUi.BTN_REGISTER;

public class RegisterTask implements Task {

    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String password;

    public RegisterTask(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_NEW_USER),
                Scroll.to(BTN_NEW_USER),
                Click.on(BTN_NEW_USER),
                WaitInteractions.untilAppears(TXT_FIRST_NAME),
                Enter.theValue(firstName).into(TXT_FIRST_NAME),
                WaitInteractions.untilAppears(TXT_LAST_NAME),
                Enter.theValue(lastName).into(TXT_LAST_NAME),
                WaitInteractions.untilAppears(TXT_USER_NAME),
                Enter.theValue(userName).into(TXT_USER_NAME),
                WaitInteractions.untilAppears(TXT_PASSWORD),
                Scroll.to(TXT_PASSWORD),
                Enter.theValue(password).into(TXT_PASSWORD)
                /*Switch.toFrame("reCAPTCHA"),
                JavaScriptClick.on(BTN_CAPTCHA),*/
        );
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_REGISTER),
                Click.on(BTN_REGISTER)
        );
    }

    public static RegisterTask inDemoQa(String firstName, String lastName, String userName, String password) {
        return Tasks.instrumented(RegisterTask.class, firstName, lastName, userName, password);
    }
}