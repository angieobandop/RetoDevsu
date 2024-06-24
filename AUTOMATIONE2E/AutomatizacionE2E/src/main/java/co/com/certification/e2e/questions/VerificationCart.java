package co.com.certification.e2e.questions;

import co.com.certification.e2e.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class VerificationCart implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean compare= Cart.PRODUCT_CART.resolveFor(actor).getText().contains("Nokia lumia 1520");
        return compare;
    }

    public static VerificationCart withproduct(){
        return new VerificationCart();
    }

}
