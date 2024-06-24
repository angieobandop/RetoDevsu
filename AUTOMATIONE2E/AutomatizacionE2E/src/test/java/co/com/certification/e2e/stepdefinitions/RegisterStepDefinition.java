package co.com.certification.e2e.stepdefinitions;

import co.com.certification.e2e.questions.UserVerification;
import co.com.certification.e2e.tasks.Login;
import co.com.certification.e2e.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinition {
    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Angie");
    }

    @Given("^angie is a demoblaze user without credentials$")
    public void AngieIsADemoblazeUserWithoutCredentials() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/"));

    }

    @When("^she enters information necessary to create a user$")
    public void SheEntersInformationNecessaryToCreateAUser() {
     theActorInTheSpotlight().attemptsTo(Register.register());
     theActorInTheSpotlight().attemptsTo(Login.login());
    }

    @Then("^she should register successfully$")
    public void SheshouldRegisterSuccessfully() {

       theActorInTheSpotlight().should(seeThat(UserVerification.successfull(),
               Matchers.is(true)));
    }

}
