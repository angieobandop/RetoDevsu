package co.com.certification.e2e.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cart.feature",
        glue = "co.com.certification.e2e.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CartRunner {
}
