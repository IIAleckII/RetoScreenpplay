package co.com.juanregala.tasks;

import co.com.juanregala.UserInterface.RegalosUI;
import co.com.juanregala.Utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class buscarExcel implements Task {
    RegalosUI regalosUI=new RegalosUI();
    private static ArrayList<Map<String,String>> leerExcel =new ArrayList<Map<String, String>>();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try{
            leerExcel= Excel.readExcel("excel.xlsx","Hoja1");
        }catch (IOException e){e.printStackTrace();}
        for(int i=0;i<leerExcel.size();i++) {
        actor.attemptsTo(
            Click.on(regalosUI.BTN_MEDELLIN),
                    Click.on(regalosUI.LUPA),
                    Enter.theValue(leerExcel.get(i).get("Producto")).into(regalosUI.TXT_BARRA_DE_BUSQUEDA),
                    Enter.keyValues(Keys.ENTER).into(regalosUI.TXT_BARRA_DE_BUSQUEDA)

        );
        }
    }

    public static Performable enJuanregala(){

        return Instrumented.instanceOf(buscarExcel.class).withProperties();
    }
}
