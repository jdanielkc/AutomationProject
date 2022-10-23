package co.com.choucair.certification.PruebaSeleccion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformationPage {
    public static final Target NAME=Target.the("field for user name")
            .located(By.cssSelector("#firstName"));
    public static final Target LAST_NAME=Target.the("field for user last name")
            .located(By.cssSelector("#lastName"));
    public static final Target EMAIL=Target.the("user email field")
            .located(By.cssSelector("#email"));
    public static final Target DAY_BIRTH=Target.the("field for day of birth")
            .located(By.cssSelector("#birthDay"));
    public static final Target MONTH_BIRTH=Target.the("field for month of birth")
            .located(By.cssSelector("#birthMonth"));
    public static final Target YEAR_BIRTH=Target.the("field for year of birth")
            .located(By.cssSelector("#birthYear"));
    public static final Target ADRESS_BUTTON=Target.the("Button to go to the address section")
            .located(By.cssSelector("a[aria-label='Next step - define your location'] span"));

}
