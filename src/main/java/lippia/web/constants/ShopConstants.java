package lippia.web.constants;

public class ShopConstants {
    public static final String SHOP_BUTTON = "xpath://*[@id='menu-item-40']";
    public static final String PRODUCT_CATEGORY = "xpath://*[@id='woocommerce_product_categories-2']/ul//a[contains(text(),'%s')]";
    public static final String FILTERED_PRODUCT_TITLE = "xpath://a[@class='woocommerce-LoopProduct-link']/h3";
    public static final String DROP_DOWN_SORT = "xpath://select[@name='orderby']";
    public static final String DROP_DOWN_OPTION = "xpath://option[@value='%s']";
    public static final String ITEM_CARDS = "xpath:(//ul[@class='products masonry-done']/li)";
}