package co.com.juanregala.StepDefinitions;

import co.com.juanregala.Driver.DriverSP;
import co.com.juanregala.UserInterface.RegalosUI;
import co.com.juanregala.tasks.buscar;
import co.com.juanregala.tasks.validarRegalos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;

public class segundoFlujoStepDefinitions {
RegalosUI regalosUI =new RegalosUI();
    @Before
    public void antesDe() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^estoy en la pagina de juanregala (.*)$")
    public void estoyEnLaPaginaDeJuanregalaHttpsJuanregalaComCo(String Url) {
    OnStage.theActorCalled("").can(BrowseTheWeb.with(DriverSP.chromeDrive(Url)));
    }

    @When("^quiero buscar regalos(.*)$")
    public void quieroBuscarRegalosFlores(String  regalo) {
        OnStage.theActorInTheSpotlight().attemptsTo(buscar.enJuanregala(regalo));
        OnStage.theActorInTheSpotlight().attemptsTo(validarRegalos.enJuanregala());
    }

    @Then("^valido que el regalo sea el correcto(.*)$")
    public void validoQueElRegaloSeaElCorrecto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(regalosUI.BTN_CONFIRMAR_BUSQUEDA_1.of()), WebElementStateMatchers.containsText("Flores")));
    }
}
