package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import resources.utilities;
import testData.auth;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class myStepdefs {

    auth auth = new auth();

    @Given("I have created my first cucumber scenario")
    public void iHaveCreatedMyFirstCucumberScenario() throws IOException {
        //RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        System.out.println(utilities.getGlobalValue("baseURL"));
        given().log().all()
                .baseUri(utilities.getGlobalValue("baseUrl"))
                .header("Content-Type", "application/json")
                .body(auth.authPayload())
                .when()
                .post("/auth")
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }

    @When("I add steps")
    public void iAddSteps() {
        System.out.println("I add steps");
    }

    @Then("I will be successful")
    public void iWillBeSuccessful() {
        System.out.println("I will be successful");
    }
}
