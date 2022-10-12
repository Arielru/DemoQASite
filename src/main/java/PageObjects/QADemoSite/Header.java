package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header
{
    @FindBy(how = How.XPATH, using = "//div[@class='header-wrapper']//a[.='Demo Site']")
    public WebElement link_header_name;

    @FindBy(how = How.XPATH, using = "//div[@class='header-wrapper']//p[@class='site-description']")
    public WebElement link_header_description;

    @FindBy(how = How.XPATH, using = "//a[.='Home']")
    public WebElement link_header_home;

    @FindBy(how = How.XPATH, using = "//a[.='Shop']")
    public WebElement link_header_shop;

    @FindBy(how = How.XPATH, using = "//a[.='Wishlist']")
    public WebElement link_header_whishlist;

    @FindBy(how = How.XPATH, using = "//a[.='Cart']")
    public WebElement link_header_cart;

    @FindBy(how = How.XPATH, using = "//a[.='Checkout']")
    public WebElement link_header_checkout;

    @FindBy(how = How.LINK_TEXT, using = "My Account")
    public WebElement link_header_my_account;

    @FindBy(how = How.XPATH, using = "//li[@class='page_item page-item-135']/a[.='About']")
    public WebElement link_header_about;

    @FindBy(how = How.CSS, using = ".header-search-icon")
    public WebElement link_header_search_icon;

    @FindBy(how = How.CSS, using = "[placeholder='Search …']")
    public WebElement link_header_search_field;

    @FindBy(how = How.CSS, using = ".search-submit")
    public WebElement link_header_search_field_submit;

}
