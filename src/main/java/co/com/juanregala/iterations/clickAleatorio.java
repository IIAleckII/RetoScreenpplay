package co.com.juanregala.iterations;

import co.com.juanregala.UserInterface.RegalosUI;
import co.com.juanregala.Utils.variableGlobal;
import co.com.juanregala.tasks.validarRegalos;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

public class clickAleatorio implements Interaction {

    RegalosUI regalosUI = new RegalosUI();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {Thread.sleep(2000);}catch (InterruptedException e){e.printStackTrace();}
        Random random=new Random();
        List<WebElementFacade> listaBtnProductos =regalosUI.BTN_BUSQUEDA_ALEATORIA.resolveAllFor(actor);
        List<WebElementFacade> listaLblProductos =regalosUI.LBL_TITLE.resolveAllFor(actor);
        int nRandom=random.nextInt(listaLblProductos.size());
        variableGlobal.productoAleatorio=listaLblProductos.get(nRandom).getText();
        listaBtnProductos.get(nRandom).click();
        try {Thread.sleep(2000);}catch (InterruptedException e){e.printStackTrace();}
    }
    public static Performable enJuanregala(){
        return Instrumented.instanceOf(clickAleatorio.class).withProperties();
    }
}
