package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.reqresin;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class MyStepdefs {
    reqresin reqresin = new reqresin();

    @Given("user set GET request")
    public void userSetGETRequest() {
        reqresin.GetUser();
    }

    @When("user send GET request to reqres.in")
    public void userSendGETRequestToReqresIn() {
        reqresin.GetUser();

    }

    @Then("response status code should be 200")
    public void responseStatusCodeShouldBe(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("response structure should match json schema {string}")
    public void responseStructureShouldMatchJsonSchema(String arg0) {
        String path = String.format("schema/%s", schema);
        System.out.println(path);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }

    @Given("user set Post request")
    public void userSetPostRequest() {
    }

    @When("user send Post Create request to reqres.in")
    public void userSendPostCreateRequestToReqresIn() {
    }

    @And("user get the token")
    public void userGetTheToken() {
    }

    @When("user send Post Register request to reqres.in")
    public void userSendPostRegisterRequestToReqresIn() {
    }

    @And("user input email data")
    public void userInputEmailData() {
    }

    @And("user input password data")
    public void userInputPasswordData() {
    }
}
