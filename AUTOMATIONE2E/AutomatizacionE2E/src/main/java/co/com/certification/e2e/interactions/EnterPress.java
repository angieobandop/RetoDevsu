package co.com.certification.e2e.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.awt.*;
import java.awt.event.KeyEvent;

public class EnterPress implements Interaction {


	@Override
	public <T extends Actor> void performAs(T Actor) {

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ENTER); //press enter key
		robot.keyRelease(KeyEvent.VK_ENTER); //release enter key
		robot.delay(200);

	}

	public static EnterPress Windows(int vkEnter) {

		return Tasks.instrumented(EnterPress.class);
	}
}
