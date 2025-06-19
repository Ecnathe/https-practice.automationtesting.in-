package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MyAccountService;

public class MyAccountSteps extends PageSteps {
    @When("Se clickea en Account Details")
    public void clickAccountDetails(){
        MyAccountService.clickAccountDetails();
    }

    @Then("Se pueden visualizar los detalles de la cuenta y la posibilidad de cambiar contraseña")
    public void validateDetails() {
        MyAccountService.redirectAccountDetails();
        MyAccountService.validateEditAccountDetailsSection();
    }
}
