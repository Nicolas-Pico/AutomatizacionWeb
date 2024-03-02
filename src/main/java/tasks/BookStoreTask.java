package tasks;

import interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.*;
import static userinterfaces.BookStroreUi.*;

public class BookStoreTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_BOOK_STORE),
                Click.on(BTN_BOOK_STORE),
                WaitInteractions.untilAppears(BTN_BOOK_ONE),
                Scroll.to(BTN_BOOK_ONE),
                Click.on(BTN_BOOK_ONE)
        );
    }

    public static BookStoreTask inDemoQa() {
        return instrumented(BookStoreTask.class);
    }
}