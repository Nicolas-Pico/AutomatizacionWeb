package tasks;

import navigation.DemoQaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new DemoQaPage())
        );
    }

    public static OpenTheBrowser inDemoQa() {
        return Tasks.instrumented(OpenTheBrowser.class);
    }
}