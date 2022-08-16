package co.com.juanregala.StepDefinitions;

import co.com.juanregala.iterations.clickAleatorio;
import co.com.juanregala.tasks.EscogerAleatoriamente;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class seleccionAleatoriaStepDefinition {

    @Before
    public void antesDe() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero escoger un regalo para mi profesor$")
    public void quieroEscogerUnRegaloParaMiProfesor() {
        OnStage.theActorInTheSpotlight().attemptsTo(EscogerAleatoriamente.enJuanregala());
    }

    @Then("^selecciono una lista de productos para elegir cualquiera$")
    public void seleccionoUnaListaDeProductosParaElegirCualquiera() {

    }

}
