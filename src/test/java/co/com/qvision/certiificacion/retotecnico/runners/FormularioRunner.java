package co.com.qvision.certiificacion.retotecnico.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/formulario.feature",
glue = "co.com.qvision.certiificacion.retotecnico.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class FormularioRunner {
}
