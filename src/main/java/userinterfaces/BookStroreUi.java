package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static net.serenitybdd.core.annotations.findby.By.*;

public class BookStroreUi extends PageObject {

    public static final Target BTN_NEW_USER = Target.the("Button new user")
            .located(id("newUser"));

    public static final Target TXT_FIRST_NAME = Target.the("Write first name")
            .located(id("firstname"));

    public static final Target TXT_LAST_NAME = Target.the("Write last name")
            .located(id("lastname"));

    public static final Target TXT_USER_NAME = Target.the("Write user name")
            .located(id("userName"));

    public static final Target TXT_PASSWORD = Target.the("Write password")
            .located(id("password"));

    public static final Target BTN_REGISTER = Target.the("Button register")
            .located(id("register"));

    public static final Target BTN_LOGIN_TWO = Target.the("Button login")
            .located(id("login"));

    public static final Target BTN_CAPTCHA = Target.the("Button captcha")
            .located(id("recaptcha-anchor"));

    public static final Target BTN_BOOK_STORE_APPLICATION = Target.the("Button book store application")
            .located(xpath("//*[text()=\"Book Store Application\"]"));

    public static final Target BTN_BOOK_STORE = Target.the("Button book store")
            .located(xpath("//span[text()=\"Book Store\"]"));

    public static final Target BTN_PROFILE= Target.the("Button profile")
            .located(xpath("//span[text()=\"Profile\"]"));

    public static final Target BTN_BOOK_ONE = Target.the("Button book one")
            .located(xpath("//a[normalize-space()='Programming JavaScript Applications']"));
}