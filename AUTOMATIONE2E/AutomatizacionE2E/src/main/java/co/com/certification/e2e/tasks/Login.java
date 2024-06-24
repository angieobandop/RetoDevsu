package co.com.certification.e2e.tasks;

import co.com.certification.e2e.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.e2e.userinterfaces.Home.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String user= actor.recall("User");
        actor.attemptsTo(Click.on(LOGIN),Enter.theValue(user).into(LOGIN_USERNAME),
                Enter.theValue(Data.Password).into(LOGIN_PASSWORD),
                Click.on(LOG_IN));
    }
    public static Login login(){
        return instrumented((Login.class));
    }
}
