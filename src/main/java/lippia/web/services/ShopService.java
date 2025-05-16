package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import static lippia.web.constants.ShopConstants.*;

public class ShopService {

    public static List <WebElement> defaultList;

    public static void clickOnCategory(String category) {
        WebActionManager.waitClickable(ShopConstants.PRODUCT_CATEGORY, category).click();
    }

    public static void validateCategoryProducts(String category) {
        List<WebElement> productList = WebActionManager.getElements(ShopConstants.FILTERED_PRODUCT_TITLE);
        for (WebElement product : productList) {
            if (category.contains("JavaScript") && product.getText().contains("JS")) {
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(product.getText().toLowerCase().contains(category.toLowerCase()));
            }
        }
    }
    public static void clickSortProductsDropDown (String sorted){
        defaultList = WebActionManager.getElements(ShopConstants.ITEM_CARDS);
        WebActionManager.waitClickable(ShopConstants.DROP_DOWN_SORT).click();
        WebActionManager.waitVisibility(ShopConstants.DROP_DOWN_OPTION, sorted).click();
    }

    public static void compareList (){
        List<WebElement> sortedList = WebActionManager.getElements(ShopConstants.ITEM_CARDS);
        Assert.assertNotEquals(defaultList, sortedList, "Las listas son identicas");
    }

    public static void clickProductOnSale() {
       WebActionManager.waitClickable(ShopConstants.ONSALE_MARK).click();
    }

    public static void validateScratchedPrize() {
        Assert.assertTrue(WebActionManager.isVisible(ACTUAL_SCRATCH_PRIZE));
        Assert.assertTrue(WebActionManager.isVisible(NEW_PRIZE));
    }
}
