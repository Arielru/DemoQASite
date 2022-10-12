package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Bar
{
    @FindBy(how = How.CSS, using = ".categories-menu-first")
    public WebElement btn_TopCategories;

    @FindBy(how = How.CSS, using = "[placeholder='Search products...']")
    public WebElement field_BarSearch;

    @FindBy(how = How.CSS, using = ".header-search-button")
    public WebElement field_BarSearchSubmit;

    @FindBy(how = How.CSS, using = "//select[@name='product_cat']")
    public WebElement drpdwn_AllCategories;

    @FindBy(how = How.CSS, using = "[data-tooltip='My Account']")
    public WebElement link_header_my_account;

    @FindBy(how = How.CSS, using = "[data-tooltip='Wishlist']")
    public WebElement link_header_whishlist;

    @FindBy(how = How.CSS, using = ".search-submit")
    public WebElement link_header_search_field_submit;

    @FindBy(how = How.CSS, using = ".added")
    public WebElement link_header_compare;

    @FindBy(how = How.CSS, using = ".header-cart-inner")
    public WebElement link_header_cart;

    @FindBy(how = How.CSS, using = ".count")
    public WebElement txt_header_cart_Count;

    @FindBy(how = How.CSS, using = ".amount-cart")
    public WebElement txt_header_cart_amount;
}
