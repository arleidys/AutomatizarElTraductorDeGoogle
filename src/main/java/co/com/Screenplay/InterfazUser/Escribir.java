package co.com.Screenplay.InterfazUser;

import net.serenitybdd.screenplay.Performable;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Escribir {

    public static final Target ENGOOGLE= Target.the("escribir en el buscador de google").located(By.name("q"));
    public static final Target BUSCAR= Target.the("clic en buscar").located(By.name("btnK"));
    public static final Target PALABRAINGLES=Target.the("PALABRA EN INGLES").located(By.xpath("//*[@id=\"tw-source-text-ta\"]"));
}
