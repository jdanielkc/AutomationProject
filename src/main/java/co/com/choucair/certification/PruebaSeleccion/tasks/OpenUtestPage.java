package co.com.choucair.certification.PruebaSeleccion.tasks;

import co.com.choucair.certification.PruebaSeleccion.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUtestPage implements Task {
    private UtestPage Page;
    public static OpenUtestPage Page() {
        return Tasks.instrumented(OpenUtestPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(Page), Click.on(UtestPage.BOTON_JOIN));
    }
}
