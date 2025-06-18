package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.RegistrationConstants;
import org.testng.Assert;

public class RegistrationService {

    public static void completeLoginForm(String user, String pass) {
        WebActionManager.waitClickable(RegistrationConstants.REGISTER_USERNAME_BOX).click();
        WebActionManager.setInput(RegistrationConstants.REGISTER_USERNAME_BOX, user);
        WebActionManager.waitClickable(RegistrationConstants.REGISTER_PASSWORD_BOX).click();
        WebActionManager.setInput(RegistrationConstants.REGISTER_PASSWORD_BOX, pass);
    }

    public static void showErrorMessage() {
        ActionManager.waitVisibilities(RegistrationConstants.REGISTER_ERROR_MESSAGE);
        String errorText = ActionManager.getText(RegistrationConstants.REGISTER_ERROR_MESSAGE);
        Assert.assertTrue(errorText.contains("Error"));
    }
}
