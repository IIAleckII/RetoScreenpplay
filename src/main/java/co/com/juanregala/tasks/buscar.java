package co.com.juanregala.tasks;

import co.com.juanregala.UserInterface.RegalosUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class buscar implements Task {
    RegalosUI regalosUI=new RegalosUI();
    private String regalo;

    public buscar(String regalo) {this.regalo = regalo;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(regalosUI.BTN_MEDELLIN),
                Click.on(regalosUI.LUPA),
                Enter.theValue(regalo).into(regalosUI.TXT_BARRA_DE_BUSQUEDA),
                Enter.keyValues(Keys.ENTER).into(regalosUI.TXT_BARRA_DE_BUSQUEDA)

        );
    }

    public static Performable enJuanregala(String regalo){

        return Instrumented.instanceOf(buscar.class).withProperties(regalo);
    }
}

