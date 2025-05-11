package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @Given("Se ingresa a la web de practica")
    public void ingresoALaPaginaDePractica() {
        HomeService.navegarWeb();
    }

    @Then("Se valida que solo haya '(.*)' sliders")
    public void CheckCantidadSliders(int qSliders) {
        HomeService.checksliders(qSliders);
    }

    @Then("Se valida que solo haya '(.*)' arrivals")
    public void CheckCantidadArrivals(int qArrivals) {
        HomeService.checkarrivals(qArrivals);
    }
}
