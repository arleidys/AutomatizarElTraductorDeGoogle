package co.com.Screenplay.StepDefinition;

import co.com.Screenplay.Task.Abrir;
import co.com.Screenplay.Task.Bucar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class StepDefinitionTraductorGoogle {


    @Dado("^que arle quier usar el traductor de google$")
    public void que_arle_quier_usar_el_traductor_de_google() {
      OnStage.theActorCalled("arle").wasAbleTo(Abrir.laPaginaDeGoogle());
    }

    @Cuando("^ella traduce la palabra table de ingles a espanol$")
    public void ella_traduce_la_palabra_table_de_ingles_a_espanol() {
        OnStage.theActorInTheSpotlight().attemptsTo(Bucar.traductorEnGoogle());

    }

    @Entonces("^deberia ver la palabra mesa en la pantalla\\.$")
    public void deberia_ver_la_palabra_mesa_en_la_pantalla() {

    }


}
