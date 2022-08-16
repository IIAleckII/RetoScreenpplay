package co.com.juanregala.iterations;

import co.com.juanregala.Driver.DriverSP;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class Scroll implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        DriverSP.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        JavascriptExecutor jse=(JavascriptExecutor) DriverSP.driver;
        jse.executeScript("window.scrollBy(0,650)");

    }
    public static Performable haciaAbajo(){
        return Instrumented.instanceOf(Scroll.class).withProperties();
    }
}
