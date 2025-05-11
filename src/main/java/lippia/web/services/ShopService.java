package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static java.sql.DriverManager.getDriver;

public class ShopService {


    private static final String FILTER_BY_PRICE_LABEL = "xpath://*[@id='woocommerce_price_filter-2']/h4";

    public static void verifyPage() {
        Assert.assertTrue(ActionManager.waitPresence(FILTER_BY_PRICE_LABEL).isDisplayed());
    }

    public static void adjustPrizeFilter() {
        WebActionManager.click(PRIZE_FILTER_BAR);
    }
}
