package tasks;

import interactions.WaitInteractions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static userinterfaces.AlertsFramesWindows.*;
import static userinterfaces.BookStroreUi.BTN_BOOK_STORE_APPLICATION;

public class AlertsFrameWindows implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_ALERTS_FRAME_WINDOWS),
                Scroll.to(BTN_ALERTS_FRAME_WINDOWS),
                Click.on(BTN_ALERTS_FRAME_WINDOWS),
                WaitInteractions.untilAppears(BTN_NESTED_FRAMES),
                Scroll.to(BTN_NESTED_FRAMES),
                Click.on(BTN_NESTED_FRAMES),
                //WaitInteractions.untilBeEnable(FRM_FATHER),
                Scroll.to(FRM_FATHER).andAlignToTop(),
                Switch.toFrame(3)
        );
        Serenity.recordReportData().withTitle("Texto iframe parent").andContents(String.valueOf(FRM_FATHER));
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(FRM_CHILD)
        );
        Serenity.recordReportData().withTitle("Texto iframe child").andContents(String.valueOf(FRM_CHILD));
        actor.attemptsTo(
                Switch.toParentFrame(),
                WaitInteractions.untilAppears(BTN_ALERTS),
                Scroll.to(BTN_ALERTS).andAlignToTop(),
                Click.on(BTN_ALERTS)
        );
    }

    public static AlertsFrameWindows inDemoQa() {
        return Tasks.instrumented(AlertsFrameWindows.class);
    }
}