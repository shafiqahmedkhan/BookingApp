package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import testData.auth;

import static io.restassured.RestAssured.given;

public class myStepdefs {

    auth auth = new auth();

    @Given("I have created my first cucumber scenario")
    public void iHaveCreatedMyFirstCucumberScenario() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        given().log().all()
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
