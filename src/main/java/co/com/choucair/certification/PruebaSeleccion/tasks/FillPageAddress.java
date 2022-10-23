package co.com.choucair.certification.PruebaSeleccion.tasks;

import co.com.choucair.certification.PruebaSeleccion.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.PruebaSeleccion.userinterface.AdressPage.*;

public class FillPageAddress implements Task {
    private List<Utest_Data> data;

    public FillPageAddress(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillPageAddress Page(List<Utest_Data> data) {
        return Tasks.instrumented(FillPageAddress.class,data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getStrPostalCode()).into(POSTAL_CODE),
                Click.on(CONTAINER_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(COUNTRY),
                Click.on(BUTTON_DEVICE)
                );
    }
}
