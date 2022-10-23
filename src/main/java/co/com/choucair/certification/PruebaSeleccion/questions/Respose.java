package co.com.choucair.certification.PruebaSeleccion.questions;

import co.com.choucair.certification.PruebaSeleccion.model.Utest_Data;
import co.com.choucair.certification.PruebaSeleccion.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Respose implements Question<Boolean> {
    private List<Utest_Data> data;

    public Respose(List<Utest_Data> data) {
        this.data = data;
    }

    public static Respose to(List<Utest_Data> data) {
        return new Respose(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text_final_button = Text.of(FinalPage.SETUP_BUTTON).viewedBy(actor).asString();
        System.out.print("\n\nAQUIIIIIIIIIIIIII "+text_final_button+"   AQUIIIIIIIIIIIIII\n\n");
        return data.get(0).getStrFinalText().equals(text_final_button);
    }
}
