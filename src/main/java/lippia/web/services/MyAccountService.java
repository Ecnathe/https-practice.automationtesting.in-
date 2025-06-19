package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;


public class MyAccountService {
    public static void clickAccountDetails() {
        WebActionManager.click(MyAccountConstants.ACCOUNT_DETAIL);
    }

    public static void redirectAccountDetails() {
        String expectedUrl = "https://practice.automationtesting.in/my-account/edit-account/";
        String actualUrl = DriverManager.getDriverInstance().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public static void validateEditAccountDetailsSection() {
        Assert.assertTrue(WebActionManager.isVisible(MyAccountConstants.SAVE_CHANGES_BUTTON), "No se encuentra el botón 'SAVE CHANGES'");
    }
}
