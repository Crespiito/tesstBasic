package co.com.qvision.certiificacion.retotecnico.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.certiificacion.retotecnico.user_interface.FormularioUI.BTN_ENVIAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnviarFomularioIteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ENVIAR));
    }

    public static EnviarFomularioIteraction enviar(){
        return instrumented(EnviarFomularioIteraction.class);
    }
}
