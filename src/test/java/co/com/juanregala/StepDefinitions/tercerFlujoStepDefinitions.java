package co.com.juanregala.StepDefinitions;

import co.com.juanregala.Driver.DriverSP;
import co.com.juanregala.tasks.buscar;
import co.com.juanregala.tasks.buscarExcel;
import co.com.juanregala.tasks.validarRegalos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class tercerFlujoStepDefinitions {

    @Before
    public void antesDe() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero encontrar regalos$")
    public void quieroEncontrarRegalos() {
        OnStage.theActorInTheSpotlight().attemptsTo(buscarExcel.enJuanregala());
    }

    @Then("^verifico el regalo$")
    public void verificoElRegalo() {

    }

}
