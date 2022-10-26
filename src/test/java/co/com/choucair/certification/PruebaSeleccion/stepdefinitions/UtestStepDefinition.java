package co.com.choucair.certification.PruebaSeleccion.stepdefinitions;

import co.com.choucair.certification.PruebaSeleccion.model.Utest_Data;
import co.com.choucair.certification.PruebaSeleccion.questions.Respose;
import co.com.choucair.certification.PruebaSeleccion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    /*
        Es lo que el actor debió de haber hecho o las precondiciones antes empezar a realizar la tarea de llenar el formulario
        En este caso, sería el abrir la página y dar clic en el botón de "Join Today".
    */
    @Given("^that a new user wants to register on the Utest page$")
    public void thatANewUserWantsToRegisterOnTheUtestPage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUtestPage.Page());
    }

    @When("^all fields are completed$")
    public void allFieldsAreCompleted(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillPage.Page(data), FillPageAddress.Page(data), FillPageDevices.Page(data), FillFinalPage.Page(data));
    }

    @Then("^the registration is successfully completed$")
    public void theRegistrationIsSuccessfullyCompleted(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respose.to(data)));
    }
}
