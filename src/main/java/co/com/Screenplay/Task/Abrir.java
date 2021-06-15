package co.com.Screenplay.Task;

import co.com.Screenplay.InterfazUser.LaPaginaDeInicioGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

private LaPaginaDeInicioGoogle lapaginaDeInicioGoogle;

    public static Abrir laPaginaDeGoogle() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(lapaginaDeInicioGoogle));
    }
}
