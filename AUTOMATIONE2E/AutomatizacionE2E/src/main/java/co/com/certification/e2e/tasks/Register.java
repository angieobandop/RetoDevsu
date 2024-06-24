package co.com.certification.e2e.tasks;

import co.com.certification.e2e.interactions.EnterPress;
import co.com.certification.e2e.models.Data;
import co.com.certification.e2e.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static co.com.certification.e2e.userinterfaces.Home.*;
import static java.awt.event.KeyEvent.VK_ENTER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        int value=new Random().nextInt(10000+1)+1;
        actor.attemptsTo(Click.on(Home.BTN_SIGNUP),Enter.theValue(Data.Name+value).into(INPUT_USERNAME),
                Enter.theValue(Data.Password).into(INPUT_PASSWORD),
                Click.on(BTN_REGISTER),
                EnterPress.Windows(VK_ENTER));
        actor.remember("User",Data.Name+value);
    }

    public static Register register (){
        return instrumented((Register.class));
    }
}
