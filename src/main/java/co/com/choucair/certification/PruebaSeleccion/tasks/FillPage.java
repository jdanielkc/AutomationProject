package co.com.choucair.certification.PruebaSeleccion.tasks;

import co.com.choucair.certification.PruebaSeleccion.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.PruebaSeleccion.userinterface.PersonalInformationPage.*;

public class FillPage implements Task {
    private List<Utest_Data> data;

    public FillPage(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillPage Page(List<Utest_Data> data) {
        return Tasks.instrumented(FillPage.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrDayBirth()).from(DAY_BIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonthBirth()).from(MONTH_BIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrYearBirth()).from(YEAR_BIRTH),
                Click.on(ADRESS_BUTTON));
    }
}
