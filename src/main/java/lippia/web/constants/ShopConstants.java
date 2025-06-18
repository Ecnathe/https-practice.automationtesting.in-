package lippia.web.constants;

public class ShopConstants {
    public static final String SHOP_BUTTON = "xpath://*[@id='menu-item-40']";
    public static final String PRODUCT_CATEGORY = "xpath://*[@id='woocommerce_product_categories-2']/ul//a[contains(text(),'%s')]";
    public static final String FILTERED_PRODUCT_TITLE = "xpath://a[@class='woocommerce-LoopProduct-link']/h3";
    public static final String DROP_DOWN_SORT = "xpath://select[@name='orderby']";
    public static final String DROP_DOWN_OPTION = "xpath://option[@value='%s']";
    public static final String ITEM_CARDS = "xpath:(//ul[@class='products masonry-done']/li)";
    public static final String ONSALE_MARK = "xpath://li/a/span[@class='onsale']";
    public static final String ACTUAL_SCRATCH_PRIZE = "xpath://*[@Class='summary entry-summary']/div/p/del";
    public static final String NEW_PRIZE = "xpath://*[@Class='summary entry-summary']/div/p/ins";
    public static final String ADD_FROM_SHOP = "xpath://ul[@class='products masonry-done']/li[1]//a[contains(text(), 'Add to basket')]";
    public static final String PRODUCT_TITLE_SHOP = "xpath://ul[contains(@class, 'products')]/li[1]//h3";
    public static final String PRODUCT_PRIZE_SHOP = "xpath://ul[contains(@class, 'products')]/li[1]//span[@class='price']//ins/span";
    public static final String PRODUCT_NAME_BASKET = "xpath://td[@class='product-name']";
    public static final String PRODUCT_PRICE_BASKET = "xpath://td[@class='product-price']";
    public static final String VIEW_CART = "xpath://li[@id='wpmenucartli']/a";
    public static final String TAX_AMOUNT = "xpath://tr[@class='tax-rate tax-rate-roaming-tax-1']/td";

            //;"//tr[@class='tax-rate tax-rate-in-tax-1']//span[@class='woocommerce-Price-amount amount']"

}