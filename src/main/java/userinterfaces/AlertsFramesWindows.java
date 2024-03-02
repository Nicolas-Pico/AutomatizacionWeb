package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class AlertsFramesWindows extends PageObject {

    public static final Target BTN_ALERTS_FRAME_WINDOWS = Target.the("Button alerts, frame y windows")
            .located(xpath("//*[contains(text(), \"Alerts, Frame & Windows\")]"));

    public static final Target BTN_NESTED_FRAMES = Target.the("Button nested frames")
            .located(xpath("//*[contains(text(), \"Nested Frames\")]"));

    public static final Target FRM_FATHER = Target.the("Parent frame")
            .located(xpath("//iframe[@id='frame1']"));

    public static final Target FRM_CHILD = Target.the("Child Iframe")
            .located(xpath("//*[@srcdoc='<p>Child Iframe</p>']"));

    public static final Target BTN_FORMS = Target.the("Button forms")
            .located(xpath("//*[contains(text(), \"Forms\")]"));

    public static final Target BTN_ALERTS = Target.the("Button alerts")
            .located(xpath("//*[text()=\"Frames\"]"));

    public static final Target BTN_BROWSER = Target.the("Button browser")
            .located(xpath("//*[text()=\"Browser Windows\"]"));

    public static final Target BTN_PRACTICE_FORMS = Target.the("Button practice forms")
            .located(xpath("//*[contains(text(), \"Practice Form\")]"));

    public static final Target TXT_FIRST_NAME = Target.the("Write first name")
            .located(id("firstName"));

    public static final Target TXT_LAST_NAME = Target.the("Write last name")
            .located(id("lastName"));

    public static final Target TXT_EMAIL = Target.the("Write user email")
            .located(id("userEmail"));

    public static final Target BTN_GENDER = Target.the("Button gender")
            .located(xpath("//label[normalize-space()='Female']"));

    public static final Target TXT_NUMBER = Target.the("Write user number")
            .located(id("userNumber"));

    public static final Target TXT_MONTH = Target.the("Button month")
            .located(xpath("//select[@class='react-datepicker__month-select']"));

    public static final Target TXT_YEAR = Target.the("Button year")
            .located(xpath("//select[@class='react-datepicker__year-select']"));

    public static final Target BTN_DAY = Target.the("Button day")
            .located(xpath("(//div[text()=\"27\"])[2]"));

    public static final Target TXT_SUBJECTS = Target.the("Write subjects")
            .located(id("subjectsInput"));

    public static final Target BTN_MUSIC = Target.the("Button music")
            .located(xpath("//label[normalize-space()='Music']"));

    public static final Target BTN_PICTURE = Target.the("Button picture")
            .located(id("uploadPicture"));

    public static final Target TXT_CURRENT_ADDRESS = Target.the("Write current address")
            .located(id("currentAddress"));

    public static final Target TXT_STATE = Target.the("Write state")
            .located(id("react-select-3-input"));

    public static final Target TXT_CITY = Target.the("Write state")
            .located(id("react-select-4-input"));

    public static final Target BTN_SUBMIT = Target.the("Button submit")
            .located(id("Submit"));

    public static final Target BTN_CLOSE = Target.the("Button close")
            .located(xpath("closeLargeModal"));
}
