package starter.stepdefinitions;

import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.Assert;
import org.junit.Assert;
import Pages.GoogleHomePage;

public class GoogleSearchSteps extends UIInteractionSteps {

    GoogleHomePage googleHomePage;
    //@Managed
    //WebDriver driver;
    @Before
    public void beforeHook()
    {
        System.out.println("Before Hook");
    }

    @After
    public void afterHook()
    {
        System.out.println("After Hook");
    }

    @Given("the user is researching stuff on the internet")
    public void searching_on_google() {googleHomePage.open();
    }

    //the user looks up <lookupterm>
    @When("the user looks up {string}")
    public void lookup_a_term(String lookupterm) {googleHomePage.performSearch(lookupterm);};

    @Then("the user should see information about {string}")
    public void validate_correct_search_results(String searchTerm)
    {
        Assert.assertTrue(googleHomePage.checkCorrectResultsReturned(searchTerm));
    }

}
