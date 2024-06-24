package co.com.certification.e2e.questions;

import co.com.certification.e2e.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class UserVerification implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String User=actor.recall("User");
        boolean compare= Home.AUTHENTICATED_USER.resolveFor(actor).getText().equals("Welcome "+User);
        return compare;
    }

    public static UserVerification successfull(){
        return new UserVerification();
    }

}
