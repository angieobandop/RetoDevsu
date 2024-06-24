package co.com.certification.e2e.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class Cart extends PageObject {

    //Cart Targets
    public static final Target PRODUCT= the("producto a seleccionar").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
    public static final Target BTN_ADD_CART= the("agregar producto al carro").located(By.className("btn btn-success btn-lg"));
    public static final Target BTN_CART= the("boton carro").located(By.id("cartur"));
    public static final Target PRODUCT_CART= the("Producto en el carro").located(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[2]"));
    public static final Target HOME= the("Home").located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
    public static final Target PRODUCT2_CART= the("Producto dos en el carro").located(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a"));
    public static final Target PLACE_ORDER= the("btn de Place order").located(By.className("btn btn-success"));

    //form Targets
    public static final Target NAME= the("nombre usuario").located(By.id("name"));
    public static final Target COUNTRY= the("pais del usuario").located(By.id("country"));
    public static final Target CITY = the("cuidad de usuario").located(By.id("city"));
    public static final Target CREDIT_CARD = the("Tarjeta de credito").located(By.id("card"));
    public static final Target MONTH= the("mes").located(By.id("month"));
    public static final Target YEAR = the("año").located(By.id("year"));
    public static final Target BTN_PURCHASE= the("btn de compra").located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));

    public static final Target THANKS_FOR_PURCHASE= the("Thank you for your purchase!").located(By.xpath("/html/body/div[12]/h2"));


}
