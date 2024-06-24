package co.com.certification.e2e.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class Home extends PageObject {

    public static final Target BTN_SIGNUP = the("Boton de registro ").located(By.id("signin2"));
    public static final Target INPUT_USERNAME = the("Campo de texto para usuario").located(By.id("sign-username"));
    public static final Target INPUT_PASSWORD = the("Campo de texto para contraseña").located(By.id("sign-password"));
    public static final Target BTN_REGISTER = the("Boton de registro ").located(By.className("btn btn-primary"));

    //login Targets
    public static final Target LOGIN = the("Boton de login ").located(By.id("login2"));
    public static final Target LOGIN_USERNAME = the("Nombre de usuario de login ").located(By.id("loginusername"));
    public static final Target LOGIN_PASSWORD = the("contraseña usuario de login ").located(By.id("loginpassword"));
    public static final Target LOG_IN = the("btn log in ").located(By.className("btn btn-primary"));
    public static final Target AUTHENTICATED_USER= the("Usuario autenticado o Welcome").located(By.className("btn btn-primary"));

}
