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
    public static final String CLICK_ADD_COUPON = "xpath://div[@id='page-35']//a[@class='showcoupon']";
    public static final String CHECKOUTCOUPON = "xpath://form[@class='checkout_coupon']";
    public static final String PLACE_ORDER_BUTTON = "xpath://*[@id='place_order']";
    public static final String CASH_ON_DELIVERY = "xpath://*[@id='payment_method_cod']";
    public static final String ORDER_DETAIL_RECEIVED = "xpath://*[@id='page-35']//h2[text() = 'Order Details']";
    //Fromulario checkout
    public static final String FIRST_NAME = "xpath://*[@id='billing_first_name']";
    public static final String LAST_NAME = "xpath://*[@id='billing_last_name']";
    public static final String EMAIL = "xpath://*[@id='billing_email']";
    public static final String PHONE = "xpath://*[@id='billing_phone']";
    public static final String COUNTRY = "xpath://*[@id='select2-chosen-1']"; // Select2 wrapper
    public static final String ADDRESS_1 = "xpath://*[@id='billing_address_1']";
    public static final String CITY = "xpath://*[@id='billing_city']";
    public static final String STATE = "xpath://*[@id='s2id_billing_state']/a"; // Select2 wrapper
    public static final String POSTCODE = "xpath://*[@id='billing_postcode']";
    //Dropdown Formulario
    public static final String COUNTRY_INPUT = "xpath://*[@id='s2id_autogen1_search']";
    public static final String STATE_INPUT = "xpath://*[@id='s2id_autogen2_search']";

}