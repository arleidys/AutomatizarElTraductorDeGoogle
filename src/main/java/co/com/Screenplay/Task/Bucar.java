package co.com.Screenplay.Task;

import co.com.Screenplay.InterfazUser.Escribir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Bucar implements Task {

    public static Bucar traductorEnGoogle() {
        return Tasks.instrumented(Bucar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues("Traductor").into(Escribir.ENGOOGLE), Click.on(Escribir.BUSCAR),
                Enter.keyValues("table").into(Escribir.PALABRAINGLES));
    }
}
