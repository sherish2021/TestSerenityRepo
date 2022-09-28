package starter.stepdefinitions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

@RunWith(CucumberWithSerenity.class)
public class UserControllerAPI  {


    private Response response;

    private static String LOCATION_CREATEUSERS_POST = "http://localhost:8080//api/users/";



    @Step
    public void create_new_user(String firstname) {

        HashMap<String,String> map = new HashMap<String,String>();
        map.put("email", "interfaceshane@gmail.com");
        map.put("firstName", firstname);
        map.put("lastName", "APIINTERFACE");

        response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .baseUri("http://localhost:8080")
                .basePath("/api/users/")
                .body(map).log().all().post();
        ;
        System.out.println("SERENITY BASE PATH "+ SerenityRest.getDefaultBasePath());
        response.prettyPrint();
        System.out.println ("response body status code " + response.statusCode());
        System.out.println(response.toString());


    }

    //@Step("Get location by postcode {0} in country {1}")
    public void validateResponseCode(int responseCode)
    {
        restAssuredThat(response -> response.statusCode(responseCode));

    }


    }
