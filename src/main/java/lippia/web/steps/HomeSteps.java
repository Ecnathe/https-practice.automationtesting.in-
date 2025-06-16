package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @Given("Se ingresa a la web de practica")
    public void ingresoALaPaginaDePractica() {
        HomeService.navegarWeb();
    }

    @Then("Se valida que solo haya '(.*)' sliders")
    public void CheckCantidadSliders(int qSliders) {
        HomeService.checkSliders(qSliders);
    }

    @Then("Se valida que solo haya '(.*)' arrivals")
    public void CheckCantidadArrivals(int qArrivals) {
        HomeService.checkArrivals(qArrivals);
    }

    @When("Se clickea la imagen del arrival en la posicion '(.*)'")
    public void ClickArrivalsImage(String position) {
        HomeService.getArrivalTitle(position);
        HomeService.selectArrivals(position);
    }

    @And("Se visualizan los detalles producto seleccionado")
    public void ValidarDetalleProducto() {
        HomeService.productPageTitleValidate();
    }

    @And("Se clickea en Add To Basket")
    public void clickAddToBasket() {
        HomeService.addToBasket();
    }

    @And("Se visualiza el texto confirmando que se ha agregado al carrito y se clickea en View Basket")
    public void viewBasket() {
        HomeService.validateAddedProduct();
        HomeService.clickViewBasket();
        HomeService.validateBasketUrl();
    }

    @And("Se selecciona el boton Proceed to Checkout")
    public void clickCheckoutButton() {
        HomeService.clickCheckoutButton();
    }

    @And("Se valida que en la seccion Your order el Total sea mayor al Subtotal")
    public void compareTotalAndSubtotal() {
        HomeService.compareTotals();
    }
}
