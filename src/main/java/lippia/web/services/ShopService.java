package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ShopService {

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
    public static void clickSortProductsDropDow (String sorted){
        WebActionManager.waitClickable(ShopConstants.DROP_DOWN_SORT).click();
        WebActionManager.waitVisibility(ShopConstants.DROP_DOWN_OPTION, sorted).click();
    }

    public static void filteredProducts (){

    }
}
