package lippia.web.constants;

public class HomeConstants {

    public static final String CONTAINER_SLIDERS = "xpath://*[@class='n2-ss-slider-3']/div";
    public static final String CONTAINER_ARRIVALS = "xpath://*[contains(@class, 'themify_builder_sub_row')][2]/div";
    public static final String ARRIVAL_IMAGE = "xpath://*[contains(@class, 'themify_builder_sub_row')][2]/div[%s]//li//img";
    public static final String ARRIVAL_IMAGE_TITLE = "xpath://*[contains(@class, 'themify_builder_sub_row')][2]/div[%s]//li//h3";
    public static final String PRODUCT_TITLE = "xpath://h1";
    public static final String ADD_TO_BASKET = "xpath://div[@id='product-160']/div[2]/form/button";
    public static final String ADDED_PRODUCT_CONFIRMED = "xpath://div[@id='content']/div[1]";
    public static final String VIEW_BASKET_BUTTON = "xpath://div[@id='content']/div/a[text()='View Basket']";
    public static final String CHECKOUT_BUTTON = "xpath://a[contains(@class, 'checkout-button')]";
    public static final String YOUR_ORDER_TOTAL = "xpath://*[@class='order-total']//span[@class='woocommerce-Price-amount amount']";
    public static final String YOUR_ORDER_SUBTOTAL = "xpath://*[@class='cart-subtotal']//span[@class='woocommerce-Price-amount amount']";
}