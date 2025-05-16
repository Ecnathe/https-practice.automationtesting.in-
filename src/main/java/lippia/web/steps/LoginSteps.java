package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.LoginConstants;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @And("Se clickea en MyAccount en la barra de navegacion superior")
    public void clickMyAccount() {
        WebActionManager.waitClickable(LoginConstants.MYACCOUNT_BUTTON).click();
    }

    @And("En el campo Username se ingresa el valor '(.*)' y en el campo Password el valor '(.*)'$")
    public void completeUserAndPass(String user, String pass) {
        LoginService.completeLoginForm(user, pass);
    }

    @When("Se hace click en el boton Login")
    public void clickLoginButton() {
        WebActionManager.waitClickable(LoginConstants.LOGIN_BUTTON).click();
    }

    @Then("Redirige al usuario al Dashboard")
    public void redirectToDashboard() {
        LoginService.redirectedToDashboard();
    }
}
