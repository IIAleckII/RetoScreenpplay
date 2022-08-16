package co.com.juanregala.tasks;

import co.com.juanregala.UserInterface.RegalosUI;
import co.com.juanregala.iterations.Scroll;
import co.com.juanregala.iterations.clickAleatorio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.hamcrest.Matcher;

public class EscogerAleatoriamente implements Task {
    RegalosUI regalosUI = new RegalosUI();
    Scroll scroll=new Scroll();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(regalosUI.BTN_MEDELLIN),
                Scroll.haciaAbajo(),
          //      WaitUntil.the(regalosUI.BTN_MAESTROS,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(regalosUI.BTN_MAESTROS),
                clickAleatorio.enJuanregala()
        );
    }



    public static Performable enJuanregala(){
        return Instrumented.instanceOf(EscogerAleatoriamente.class).withProperties();
    }
}
