package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

public class LoginService {

    public static void completeLoginForm(String user, String pass) {
        WebActionManager.waitClickable(LoginConstants.LOGIN_USERNAME_BOX).click();
        WebActionManager.setInput(LoginConstants.LOGIN_USERNAME_BOX, user);
        WebActionManager.waitClickable(LoginConstants.LOGIN_PASSWORD_BOX).click();
        WebActionManager.setInput(LoginConstants.LOGIN_PASSWORD_BOX, pass);
    }

    public static void redirectedToDashboard() {
        String expectedUrl = "https://practice.automationtesting.in/my-account/";
        String actualUrl = DriverManager.getDriverInstance().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public static void showErrorMessage() {
        ActionManager.waitVisibilities(LoginConstants.LOGIN_ERROR_MESSAGE);
        String errorText = ActionManager.getText(LoginConstants.LOGIN_ERROR_MESSAGE);
        Assert.assertTrue(errorText.contains("Error"));
    }
}
