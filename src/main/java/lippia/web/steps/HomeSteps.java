package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;

import static lippia.web.constants.PracticeHomeConstants.ARRIVAL_IMAGE;

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

    @Then("Se visualizan los detalles producto seleccionado")
    public void ValidarDetalleProducto() {
        HomeService.productPageTitleValidate();
    }
}
