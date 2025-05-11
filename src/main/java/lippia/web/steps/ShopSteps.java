package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

import static lippia.web.constants.ShopConstants.*;


public class ShopSteps extends PageSteps {

    @And("Se clickea el boton 'Shop' en la barra de navegacion superior")
    public void clickShopBarraSup() {
        WebActionManager.click(SHOP_BUTTON);
    }

    @When("Se clickea en {string}")
    public void seClickeaEnCategoria(String categoria) {
    }

    @Then("Solo se visualizan los productos de dicha categoria")
    public void productosFiltrados() {
    }

    @When("Se selecciona la opcion {string} en el menu depslegable")
    public void seleccionDeFiltro() {

    }

    @Then("Se visualizan los productos filtrados")
    public void visualizacionFiltrada() {
    }

    @When("Se clickea un producto con la etiqueta {string}")
    public void clickProductosOnSale() {
    }

    @Then("Se visualiza el precio antiguo tachado para los productos con esta etiqueta")
    public void seVisualizaDescuento() {
    }
}
