package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

import static lippia.web.constants.ShopConstants.SHOP_BUTTON;

public class ShopSteps extends PageSteps {

     @And("Se clickea el boton {string} en la barra de navegacion superior")
    public void clickShopSuperiorBar() {
         WebActionManager.click(SHOP_BUTTON);
    }

    @When("Se ajusta el filtro de valores entre {string} y {string}")
    public void filtrarPorPrecio(int arg0, int arg1) {
    }
}
