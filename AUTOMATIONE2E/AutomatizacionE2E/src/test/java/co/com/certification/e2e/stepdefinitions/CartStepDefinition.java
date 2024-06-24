package co.com.certification.e2e.stepdefinitions;

import co.com.certification.e2e.questions.*;
import co.com.certification.e2e.tasks.*;
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

public class CartStepDefinition {
    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Angie");
    }

    @Given("^angie is a demoblaze user with credentials$")
    public void angieIsADemoBlazeUserWithCredentials() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/"));
    }

    @When("^she enters credentials$")
    public void sheEntersCredentials() {
        theActorInTheSpotlight().attemptsTo(LoginCart.login());
    }

    @Then("^she should see the login successfully$")
    public void sheShouldSeeTheLoginSuccessfully() {
        theActorInTheSpotlight().should(seeThat(UserVerification.successfull(),
                Matchers.is(true)));

    }

    @When("^add a cell phone and Cell phone2 to cart$")
    public void addACellPhoneAndCellPhoneToCart() {
        theActorInTheSpotlight().attemptsTo(LoginCart.login(),
                AddCart.theproduct());
    }

    @Then("^verified that it is added$")
    public void verifiedThatItIsAdded() {
        theActorInTheSpotlight().should(seeThat(VerificationCart.withproduct(),
                Matchers.is(true)));

    }


    @When("^She looks at the cart and proceeds to fill out the purchase form$")
    public void sheLooksAtTheCartAndProceedsToFillOutThePurchaseForm() {
        theActorInTheSpotlight().attemptsTo(Purchase.products());
    }

    @Then("^finalize purchase and validate$")
    public void finalizePurchaseAndValidate() {
        theActorInTheSpotlight().should(seeThat(VerificationPurchase.products(),
                Matchers.is(true)));
    }
}
