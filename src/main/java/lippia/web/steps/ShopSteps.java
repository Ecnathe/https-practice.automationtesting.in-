package lippia.web.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import static lippia.web.constants.ShopConstants.*;


public class ShopSteps extends PageSteps {

    @And("Se clickea el boton 'Shop' en la barra de navegacion superior")
    public void clickShopBarraSup() {
        WebActionManager.click(SHOP_BUTTON);
    }

    @When("Se hace click en (.*) del sidebar$")
    public void clickCategory(String category) {
        ShopService.clickOnCategory(category);
    }

    @Then("Solo se visualizan los productos de la categoria (.*)$")
    public void productosFiltrados(String category) {
        ShopService.validateCategoryProducts(category);
    }

    @When("Se selecciona la opcion (.*) en el menu depslegable$")
    public void sortedProducts(String sorted) {
        ShopService.clickSortProductsDropDown(sorted);
    }

    @Then("Se visualizan los productos filtrados")
    public void verifiedSortedProducts() {
        ShopService.compareList();
    }

    @When("Se clickea el primer producto con la etiqueta On Sale")
    public void clickOnSaleProduct() {
        ShopService.clickProductOnSale();
    }

    @Then("Se visualiza el precio antiguo tachado para los productos con esta etiqueta")
    public void verifyOldPrizeScratched() {
        ShopService.validateScratchedPrize();
    }
}
