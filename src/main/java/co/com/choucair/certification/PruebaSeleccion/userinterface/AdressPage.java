package co.com.choucair.certification.PruebaSeleccion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdressPage{
    public static final Target CITY=Target.the("field for user city")
            .located(By.cssSelector("#city"));
    public static final Target POSTAL_CODE=Target.the("field for postal code")
            .located(By.cssSelector("#zip"));
    public static final Target CONTAINER_COUNTRY=Target.the("container fot user country")
            .located(By.cssSelector("span[class='ui-select-match-text pull-left']"));
    public static final Target COUNTRY=Target.the("User country")
            .located(By.cssSelector("input[placeholder='Select a country']"));
    public static final Target BUTTON_DEVICE=Target.the("Button to the device page")
            .located(By.cssSelector("a[aria-label='Next step - select your devices'] span[aria-hidden='true']"));
}
