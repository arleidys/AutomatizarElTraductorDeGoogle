package co.com.Screenplay.TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/feature/traducir_Ingles_Espanol.feature",
        glue= {"co.com.Screenplay.StepDefinition", "co.com.Screenplay.Util"})
public class TradurcirPalbrasInglesEspanolRunn {



}
