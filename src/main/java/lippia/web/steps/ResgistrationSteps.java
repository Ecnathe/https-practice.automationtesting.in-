package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.RegistrationConstants;
import lippia.web.services.RegistrationService;

public class ResgistrationSteps extends PageSteps {

    @And("En Username se ingresa el valor '(.*)' y en Password el valor '(.*)'$")
    public void completeUserAndPass(String user, String pass) {
        RegistrationService.completeLoginForm(user, pass);
    }

    @When("Se hace click en el boton Register")
    public void clickLoginButton() {
        WebActionManager.waitClickable(RegistrationConstants.REGISTER_BUTTON).click();
    }

    @Then("Se debe mostrar el mensaje de error del registro.")
    public void displayErrorMessage() {
        RegistrationService.showErrorMessage();
    }
}
