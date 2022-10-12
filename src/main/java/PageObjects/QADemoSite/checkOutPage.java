package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class checkOutPage {


    //Empty Cart Behavior
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Cart')]")
    public WebElement txt_Page_Name;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Checkout is not available whilst your cart is empt')]")
    public WebElement txt_checkOUtNotAvailableCartEmpty;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Your cart is currently empty.')]")
    public WebElement txt_CartEmptyMessage;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Return to shop')]")
    public WebElement btn_ReturnToShop;

    //Full cart behavior
    @FindBy(how = How.XPATH, using = "//a[.='Click here to enter your code']")
    public WebElement link_HaveACoupoun;

    @FindBy(how = How.ID, using = "coupon_code")
    public WebElement field_coupounCode;

    @FindBy(how = How.NAME, using = "apply_coupon")
    public WebElement field_coupounCodeApply;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Please enter a coupon code.')]")
    public WebElement txt_coupounCodeApplyFailEmpty;

    @FindBy(how = How.CSS, using = ".checkout_coupon")
    public WebElement txt_coupounCodeApplyFailWrong;

    @FindBy(how = How.CSS, using = ".woocommerce-message")
    public WebElement txt_coupounCodeApplySuccess;

    @FindBy(how = How.ID, using = "billing_first_name")
    public WebElement field_FirstName;

    @FindBy(how = How.ID, using = "billing_last_name")
    public WebElement field_LastName;

    @FindBy(how = How.ID, using = "billing_company")
    public WebElement field_Company;

    @FindBy(how = How.ID, using = "select2-billing_country-container")
    public WebElement drpdwn_countries;

    @FindBy(how = How.ID, using = "billing_address_1")
    public WebElement field_StreetAddress1;

    @FindBy(how = How.ID, using = "billing_address_2")
    public WebElement field_StreetAddress2;

    @FindBy(how = How.ID, using = "billing_postcode")
    public WebElement field_PostCode;

    @FindBy(how = How.ID, using = "billing_city")
    public WebElement field_City;

    @FindBy(how = How.ID, using = "billing_phone")
    public WebElement field_Phone;

    @FindBy(how = How.ID, using = "billing_email")
    public WebElement field_Email;

    @FindBy(how = How.ID, using = "place_order")
    public WebElement btn_PlaceOrder;

    @FindBy(how = How.CSS, using = ".shop_table")
    public WebElement tbl_Order;

    @FindBy(how = How.XPATH, using = "//tr[@class='cart-subtotal']//bdi[1]")
    public WebElement tbl_OrderSubTotal;

    @FindBy(how = How.XPATH, using = "//tr[@class='order-total']//bdi[1]")
    public WebElement tbl_OrderTotal;

    @FindBy(how = How.XPATH, using = "//th[.='Coupon: 20off']")
    public WebElement tbl_CouponName;

    @FindBy(how = How.XPATH, using = "//tr[@class='cart-discount coupon-20off']//span[@class='woocommerce-Price-amount amount']")
    public WebElement tbl_CouponDiscountAmount;

    @FindBy(how = How.XPATH, using = ".woocommerce-remove-coupon")
    public WebElement tbl_CouponDiscountRemove;

    @FindBy(how = How.XPATH, using = ".woocommerce-remove-coupon")
    public WebElement link_PrivacyPolicy;
}
