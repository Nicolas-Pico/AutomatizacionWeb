package tasks;

import interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static userinterfaces.BookStroreUi.*;
import static userinterfaces.DeleteAccountUi.*;

public class DeleteAccount implements Task {

    private final String userName;
    private final String password;

    public DeleteAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_LOGIN),
                Click.on(BTN_LOGIN),
                WaitInteractions.untilAppears(TXT_USER_NAME),
                Enter.theValue(userName).into(TXT_USER_NAME),
                WaitInteractions.untilAppears(TXT_PASSWORD),
                Enter.theValue(password).into(TXT_PASSWORD),
                WaitInteractions.untilAppears(BTN_LOGIN_TWO),
                Click.on(BTN_LOGIN_TWO),
                WaitInteractions.untilAppears(BTN_DELETE),
                Scroll.to(BTN_DELETE),
                Click.on(BTN_DELETE),
                WaitInteractions.untilAppears(BTN_OK),
                Click.on(BTN_OK),
                Switch.toAlert().andAccept(),
                WaitInteractions.untilAppears(TXT_USER_NAME),
                Enter.theValue(userName).into(TXT_USER_NAME),
                WaitInteractions.untilAppears(TXT_PASSWORD),
                Enter.theValue(password).into(TXT_PASSWORD),
                WaitInteractions.untilAppears(BTN_LOGIN_TWO),
                Click.on(BTN_LOGIN_TWO)
        );
    }

    public static DeleteAccount inDemoQa(String userName, String password) {
        return Tasks.instrumented(DeleteAccount.class, userName, password);
    }
}