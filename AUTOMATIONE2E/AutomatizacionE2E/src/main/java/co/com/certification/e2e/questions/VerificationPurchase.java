package co.com.certification.e2e.questions;

import co.com.certification.e2e.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class VerificationPurchase implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean compare= Cart.THANKS_FOR_PURCHASE.resolveFor(actor).getText().equals("Thank you for your purchase!");
        return compare;
    }

    public static VerificationPurchase products(){
        return new VerificationPurchase();
    }

}
