package co.com.juanregala.UserInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;

public class RegalosUI {
    public final Target TXT_BARRA_DE_BUSQUEDA = Target
            .the("Barra de busqueda juanregala")
            .locatedBy("(//input[@class='search-field mb-0'])[1]");
    public final Target LUPA = Target
            .the("Lupa para que se muestre en pantalla la barra de busqueda")
            .locatedBy("(//i[@class='icon-search'])[1]");
    public final Target BTN_MEDELLIN = Target
            .the("boton para acceder a la seccion de medellin")
            .locatedBy("(//a[@href='https://juanregala.com.co/medellin/tienda/'])[1]");

    public final Target BTN_MAESTROS = Target
            .the("boton para identificar los regalos para maestros")
            .locatedBy("(//a[@href=\"https://juanregala.com.co/medellin/categoria/sorpresas/dia-del-maestro-medellin/\"])[1]");
    public final Target BTN_CONFIRMAR_BUSQUEDA_1 = Target
            .the("confirmar cual fue la primera buqueda")
            .locatedBy("(//a[@class=\"woocommerce-LoopProduct-link woocommerce-loop-product__link\"])[1]");

    public final Target BTN_BUSQUEDA_ALEATORIA = Target
            .the("confirmar cual fue la segunda buqueda")
            .locatedBy("//a[@class=\"woocommerce-LoopProduct-link woocommerce-loop-product__link\"]");

    public final Target LBL_TITLE=Target
            .the("Titulo de producto")
            .locatedBy("//div[@class=\"title-wrapper\"]");
}
