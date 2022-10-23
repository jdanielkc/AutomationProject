package co.com.choucair.certification.PruebaSeleccion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Utest_Register.feature",
                 tags="@Stories",
                 glue="co.com.choucair.certification.PruebaSeleccion.stepdefinitions",
                 snippets=SnippetType.CAMELCASE)
public class RunnerTags {
}
