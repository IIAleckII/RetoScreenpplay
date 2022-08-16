package co.com.juanregala.StepDefinitions;

import co.com.juanregala.Utils.Models;
import co.com.juanregala.tasks.buscar;
import co.com.juanregala.tasks.validarRegalos;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class primerFlujoStepDefinition {

    @When("^quiero buscar un regalo$")
    public void quieroBuscarUnRegalo(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(buscar.enJuanregala(arg1.get(0).getObsequio()));
        OnStage.theActorInTheSpotlight().attemptsTo(validarRegalos.enJuanregala());
    }

    @Then("^valido el regalo$")
    public void validoElRegalo() {

    }

}
