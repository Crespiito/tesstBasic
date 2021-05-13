package co.com.qvision.certiificacion.retotecnico.tasks;

import co.com.qvision.certiificacion.retotecnico.interactions.EnviarFomularioIteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormularioVacioTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnviarFomularioIteraction.enviar());
    }

    public static FormularioVacioTask FormularioVacio(){
        return instrumented(FormularioVacioTask.class);
    }
}
