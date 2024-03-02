package stepsdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import tasks.BookStoreTask;
import tasks.OpenTheBrowser;
import tasks.RegisterTask;
import utils.DataDrivenExcel;
import utils.Excel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utils.Constants.USER;

public class BookStoreStepsDefinition {

    @Managed
    public WebDriver driver;

    @Before
    public void setUp() {
        USER.can(BrowseTheWeb.with(driver));
    }

    public static Map<String, String> data = new HashMap<>();
    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();

    @Given("i am on the demoqa page {int}")
    public void iAmOnTheDemoqaPage(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestana"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        USER.wasAbleTo(OpenTheBrowser.inDemoQa());
    }

    @When("i create the user with my credentials")
    public void iCreateTheUserWithMyCredentials() {
        USER.attemptsTo(RegisterTask.inDemoQa(data.get("FirstName"), data.get("LastName"), data.get("UserName"),
                data.get("Password")));
    }

    @When("select the books to save them in my collection")
    public void selectTheBooksToSaveThemInMyCollection() {
        USER.attemptsTo(BookStoreTask.inDemoQa());
    }

    @Then("the deletion of the books and the profile will be validated")
    public void theDeletionOfTheBooksAndTheProfileWillBeValidated() {

    }
}
