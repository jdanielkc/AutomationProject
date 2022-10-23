package co.com.choucair.certification.PruebaSeleccion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage {
    public static final Target PASSWORD=Target.the("Password field")
            .located(By.cssSelector("#password"));
    public static final Target REPEAT_PASSWORD=Target.the("Password confirm")
            .located(By.cssSelector("#confirmPassword"));
    public static final Target CHECKBOX_STAY_INFORMED=Target.the("Checkbox to stay informed")
            .located(By.cssSelector(".checkmark.signup-consent__checkbox.signup-consent__checkbox--highlight"));
    public static final Target CHECKBOX_TERMS_OF_USE=Target.the("Checkbox to terms of use")
            .located(By.cssSelector("span[ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target CHECKBOX_PRIVACY=Target.the  ("Checkbox to terms of privacy")
            .located(By.cssSelector("span[ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target SETUP_BUTTON=Target.the("Button to complete")
            .located(By.xpath("//span[normalize-space()='Complete Setup']"));
}
