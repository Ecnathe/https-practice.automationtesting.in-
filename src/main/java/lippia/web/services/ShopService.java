package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static com.crowdar.core.actions.ActionManager.getText;
import static lippia.web.constants.ShopConstants.*;

public class ShopService {
    private static String ArrivalTitle;

    public static void getCategFilte(String imgTitlePosition) {
        ArrivalTitle = WebActionManager.getText(String.format(PRODUCT_CATEGORY, imgTitlePosition));
    }

    public static void selectCategory(String imgPosition) {
        WebActionManager.click(String.format(PRODUCT_CATEGORY, imgPosition));
    }

    public static void productPageTitleValidate() {
        Assert.assertEquals(getText(PRODUCT_CATEGORY), ArrivalTitle, "El titulo de la página no coincide con el producto seleccionado");
    }
}
