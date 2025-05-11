package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeHomeConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void checksliders(int qSliders) {
        Assert.assertEquals(WebActionManager.getElements(PracticeHomeConstants.CONTAINER_SLIDERS).size(),qSliders,"La cantidad de Slider no coincide con la esperada");
    }
    public static void checkarrivals(int qArrivals) {
        Assert.assertEquals(WebActionManager.getElements(PracticeHomeConstants.CONTAINER_ARRIVALS).size(),qArrivals,"La cantidad de Arrivals no coincide con la esperada");
    }
}
