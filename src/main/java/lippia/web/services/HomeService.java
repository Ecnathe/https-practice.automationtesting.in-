package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import org.testng.Assert;
import static com.crowdar.core.actions.ActionManager.getText;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.HomeConstants.*;

public class HomeService {
    private static String ArrivalTitle;

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void checkSliders(int qSliders) {
        Assert.assertEquals(WebActionManager.getElements(HomeConstants.CONTAINER_SLIDERS).size(), qSliders, "La cantidad de Slider no coincide con la esperada");
    }

    public static void checkArrivals(int qArrivals) {
        Assert.assertEquals(WebActionManager.getElements(HomeConstants.CONTAINER_ARRIVALS).size(), qArrivals, "La cantidad de Arrivals no coincide con la esperada");
    }

    public static void selectArrivals(String imgPosition) {
        WebActionManager.click(String.format(ARRIVAL_IMAGE, imgPosition));
    }

    public static void getArrivalTitle(String imgTitlePosition) {
        ArrivalTitle = WebActionManager.getText(String.format(ARRIVAL_IMAGE_TITLE, imgTitlePosition));
    }

    public static void productPageTitleValidate() {
        Assert.assertEquals(getText(PRODUCT_TITLE),ArrivalTitle,"El titulo de la página no coincide con el producto seleccionado");
    }
}
