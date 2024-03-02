package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class DeleteAccountUi extends PageObject {

    public static final Target BTN_LOGIN = Target.the("Button login")
            .located(xpath("//a[text()=\"login\"]"));

    public static final Target BTN_DELETE = Target.the("Button delete account")
            .located(xpath("//a[text()=\"Delete Account\"]"));

    public static final Target BTN_OK = Target.the("Button ok")
            .located(id("closeSmallModal-ok"));

    public static final Target LBL_FINAL = Target.the("Label final")
            .located(id("name"));
}