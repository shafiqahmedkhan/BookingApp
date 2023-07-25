package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I have created my first cucumber scenario")
    public void iHaveCreatedMyFirstCucumberScenario() {
        System.out.println("I have created my first cucumber scenario");
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
