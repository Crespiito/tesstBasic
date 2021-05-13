package co.com.qvision.certiificacion.retotecnico.stepdefinitions;

import co.com.qvision.certiificacion.retotecnico.tasks.FormularioVacioTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioSteps {

    @Before
    public void preparacion(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que el usuario ingresa a la pagina Demo Qa")
    public void queElUsuarioIngresaALaPaginaDemoQa() {
        theActorCalled("susan").wasAbleTo(Open.url("https://demoqa.com/automation-practice-form"));
    }

    @Cuando("Envia el formulario vacio")
    public void enviaElFormularioVacio() {
        theActorInTheSpotlight().attemptsTo(FormularioVacioTask.FormularioVacio());
    }

    @Entonces("me alerta de los campos necesarios")
    public void meAlertaDeLosCamposNecesarios() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Cuando("Envia el formulario completamente diligenciado")
    public void enviaElFormularioCompletamenteDiligenciado() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Entonces("me muestra una pantalla de verificacion")
    public void meMuestraUnaPantallaDeVerificacion() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    
}
