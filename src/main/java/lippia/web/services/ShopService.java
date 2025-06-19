package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static lippia.web.constants.ShopConstants.*;

public class ShopService {

    public static List<WebElement> defaultList;

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

    public static void clickSortProductsDropDown(String sorted) {
        defaultList = WebActionManager.getElements(ShopConstants.ITEM_CARDS);
        WebActionManager.waitClickable(ShopConstants.DROP_DOWN_SORT).click();
        WebActionManager.waitVisibility(ShopConstants.DROP_DOWN_OPTION, sorted).click();
    }

    public static void compareList() {
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

    private static String productName;
    private static String productPrice;

    public static void addFirstItemToBasketFromShop() {
        productName = WebActionManager.getText(ShopConstants.PRODUCT_TITLE_SHOP);
        productPrice = WebActionManager.getText(ShopConstants.PRODUCT_PRIZE_SHOP);
        WebActionManager.waitClickable(ShopConstants.ADD_FROM_SHOP).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Assert.assertTrue(WebActionManager.isPresent("xpath://a[contains(@class, 'added') and contains(@class, 'button')]"), "El botón con clase 'added button' no está visible tras agregar al carrito.");
    }

    public static void clickViewBasket() {
        WebActionManager.waitClickable(VIEW_CART).click();
        Assert.assertEquals(WebActionManager.getText(PRODUCT_NAME_BASKET), productName, "El nombre del producto no coincide con el del carrito.");
        Assert.assertEquals(WebActionManager.getText(PRODUCT_PRICE_BASKET), productPrice, "El precio del producto no coincide con el del carrito.");
    }

    public static void selectCountry(String Country) {
        WebActionManager.waitClickable(HomeConstants.COUNTRY).click();
        WebActionManager.getElement(HomeConstants.COUNTRY_INPUT).sendKeys(Country);
        if (Country.equals("India")) {
            WebActionManager.getElement(HomeConstants.COUNTRY_INPUT).sendKeys(Keys.ARROW_DOWN);
            WebActionManager.getElement(HomeConstants.COUNTRY_INPUT).sendKeys(Keys.ENTER);
        } else {
            WebActionManager.getElement(HomeConstants.COUNTRY_INPUT).sendKeys(Keys.ENTER);
        }
    }

    public static void validarImpuesto(String expectedTaxPercent) throws InterruptedException {
        Thread.sleep(3000);
        String taxText = WebActionManager.getText(ShopConstants.TAX_AMOUNT);
        System.out.println("Impuesto visible: " + taxText);

        double taxValueVisible = Double.parseDouble(taxText.replaceAll("[^\\d.]", ""));
        double priceValue = Double.parseDouble(productPrice.replaceAll("[^\\d.]", ""));

        double expectedPercentage = Double.parseDouble(expectedTaxPercent.replace("%", ""));
        double expectedTaxValue = Math.round(priceValue * expectedPercentage) / 100.0;

        // Imprimir para debug
        System.out.println("Precio base: " + priceValue);
        System.out.println("Impuesto esperado (" + expectedTaxPercent + "): " + expectedTaxValue);

        Assert.assertEquals(taxValueVisible, expectedTaxValue, 0.01, "El impuesto no coincide con lo esperado.");
    }

    public static void resetCart() {
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();
        List<WebElement> remove = WebActionManager.getElements(REMOVE_FROM_CART);
        for (WebElement item : remove) {
            item.click();
        }
    }

}
