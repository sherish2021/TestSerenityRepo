package starter.stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UserControllerStepDefinitions {

    @Steps
    UserControllerAPI api;

    @When("I create a new user with firstname {word}")
    public void lookUpAPostCode(String firstname) {
        api.create_new_user(firstname);
    }
    @Then("Confirm I get the correct responsecode {int} to indicate success")
    public void validateResponseCode(int responseCode)
    {
        api.validateResponseCode(responseCode);

    }
}
