package co.com.certification.e2e.tasks;

import co.com.certification.e2e.interactions.EnterPress;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.certification.e2e.userinterfaces.Cart.*;
import static java.awt.event.KeyEvent.VK_ENTER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PRODUCT),
                Click.on(BTN_ADD_CART),EnterPress.Windows(VK_ENTER),
                Click.on(HOME),Click.on(PRODUCT2_CART),Click.on(BTN_ADD_CART),
                EnterPress.Windows(VK_ENTER),Click.on(BTN_CART));

    }
    public static AddCart theproduct(){
        return instrumented((AddCart.class));
    }
}
