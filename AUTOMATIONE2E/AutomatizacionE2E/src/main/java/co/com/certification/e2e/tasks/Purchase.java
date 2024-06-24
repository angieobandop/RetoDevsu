package co.com.certification.e2e.tasks;

import co.com.certification.e2e.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.e2e.userinterfaces.Cart.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Purchase implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_CART),
                Click.on(PLACE_ORDER),
                Enter.theValue(Data.NameUser).into(NAME),
                Enter.theValue(Data.Country).into(COUNTRY),
                Enter.theValue(Data.City).into(CITY),
                Enter.theValue(Data.CreditCard).into(CREDIT_CARD),
                Enter.theValue(Data.Month).into(MONTH),
                Enter.theValue(Data.Year).into(YEAR),
        Click.on(BTN_PURCHASE));

    }
    public static Purchase products(){
        return instrumented((Purchase.class));
    }
}
