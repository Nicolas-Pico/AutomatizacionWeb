package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.DeleteAccountUi.LBL_FINAL;

public class ValidationAlertsFrameWindowQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_FINAL.resolveFor(actor).isVisible();
    }

    public static ValidationAlertsFrameWindowQuestion inDemoQa() {
        return new ValidationAlertsFrameWindowQuestion();
    }
}