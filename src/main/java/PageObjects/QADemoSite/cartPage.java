package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class cartPage {

    @FindBy(how = How.CSS, using = ".entry-title")
    public WebElement txt_Page_Name;

    @FindBy(how = How.XPATH, using = "//th[@class='product-name']")
    public WebElement txt_TableHeaderProduct;

    @FindBy(how = How.XPATH, using = "//th[@class='product-price']")
    public WebElement txt_TableHeaderPrice;

    @FindBy(how = How.XPATH, using = "//th[@class='product-quantity']")
    public WebElement txt_TableHeaderQuantity;

    @FindBy(how = How.XPATH, using = "//th[@class='product-subtotal']")
    public WebElement txt_TableHeaderSubtotal;

    @FindBy(how = How.CSS, using = ".remove")
    public WebElement btn_TableRemoveProduct;

    @FindBy(how = How.CLASS_NAME, using = "//td[@class='product-name']")
    public WebElement btn_TableProduct;

    @FindBy(how = How.CLASS_NAME, using = "//td[@class='product-price']//bdi[1]")
    public WebElement btn_TablePrice;

    @FindBy(how = How.CSS, using = ".qty")
    public WebElement btn_TableQuantity;

    @FindBy(how = How.CSS, using = "//td[@class='product-subtotal']//bdi[1]")
    public WebElement btn_TableSubTotal;

    @FindBy(how = How.ID, using = "coupon_code")
    public WebElement field_CouponCode;

    @FindBy(how = How.ID, using = "coupon_code")
    public WebElement btn_CouponApply;

    @FindBy(how = How.NAME, using = "update_cart")
    public WebElement btn_updateCart;

    @FindBy(how = How.XPATH, using = "//tr[@class='cart-subtotal']//bdi[1]")
    public WebElement txt_subTotal;

    @FindBy(how = How.XPATH, using = "//tr[@class='cart-subtotal']//bdi[1]")
    public WebElement txt_Cart_subTotal;

    @FindBy(how = How.XPATH, using = "//strong[1]//bdi[1]")
    public WebElement txt_Cart_Total;

    @FindBy(how = How.CSS, using = ".checkout-button")
    public WebElement btn_ProceedToCheckout;

    @FindBy(how = How.CSS, using = ".cart-empty")
    public WebElement txt_cartIsEmpty;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Return to shop')]")
    public WebElement btn_returnToShop;

    @FindBy(how = How.CSS, using = ".woocommerce-message")
    public WebElement txt_itemRemoved;
}
