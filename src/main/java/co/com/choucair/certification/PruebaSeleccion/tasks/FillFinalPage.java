package co.com.choucair.certification.PruebaSeleccion.tasks;

import co.com.choucair.certification.PruebaSeleccion.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.PruebaSeleccion.userinterface.FinalPage.*;

public class FillFinalPage implements Task {
    private List<Utest_Data> data;

    public FillFinalPage(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillFinalPage Page(List<Utest_Data> data) {
        return Tasks.instrumented(FillFinalPage.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(REPEAT_PASSWORD),
                Click.on(CHECKBOX_STAY_INFORMED),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(CHECKBOX_PRIVACY),
                Click.on(SETUP_BUTTON)
        );

    }
}
