package co.com.juanregala.tasks;

import co.com.juanregala.UserInterface.RegalosUI;
import com.openhtmltopdf.extend.UserInterface;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class validarRegalos implements Task {
    RegalosUI regalosUI = new RegalosUI();

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Target> listXpath = new ArrayList<>();
        listXpath.add(0, regalosUI.BTN_CONFIRMAR_BUSQUEDA_1);
//       for (int i = 0; i < listXpath.size(); i++) {
            actor.attemptsTo(
                    Click.on(listXpath.get(0))
            );
 //       }
    }
    public static Performable enJuanregala(){
        return Instrumented.instanceOf(validarRegalos.class).withProperties();
    }
}



