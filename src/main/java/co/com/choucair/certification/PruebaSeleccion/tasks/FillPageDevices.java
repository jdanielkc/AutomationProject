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

import static co.com.choucair.certification.PruebaSeleccion.userinterface.DevicePage.*;

public class FillPageDevices implements Task {
    private List<Utest_Data> data;

    public FillPageDevices(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillPageDevices Page(List<Utest_Data> data) {
        return Tasks.instrumented(FillPageDevices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTAINER_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(COMPUTER),
                Hit.the(Keys.ENTER).into(COMPUTER),

                Click.on(CONTAINER_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(VERSION),
                Hit.the(Keys.ARROW_DOWN).into(VERSION),
                Hit.the(Keys.ENTER).into(VERSION),

                Click.on(CONTAINER_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguage()).into(LANGUAGE),
                Hit.the(Keys.ARROW_DOWN).into(LANGUAGE),
                Hit.the(Keys.ENTER).into(LANGUAGE),

                Click.on(CONTAINER_MOBILE_DEVICE),
                Enter.theValue(data.get(0).getStrMobileDevice()).into(MOBILE_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(MOBILE_DEVICE),

                Click.on(CONTAINER_MODEL_DEVICE),
                Enter.theValue(data.get(0).getStrModel()).into(MODEL_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(MODEL_DEVICE),
                Hit.the(Keys.ENTER).into(MODEL_DEVICE),

                Click.on(CONTAINER_OS_MOBILE_DEVICE),
                Enter.theValue(data.get(0).getStrOS()).into(OS_MOBILE_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(OS_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(OS_MOBILE_DEVICE),

                Click.on(FINAL_BUTTON)
        );

    }
}
