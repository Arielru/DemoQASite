package SanityTests;

import Extentions.webActions;
import Utilities.commonOps;
import WorkFlows.WebFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import Extentions.verifications;



@org.testng.annotations.Listeners({Utilities.listeners.class})
public class demo_flow_1 extends commonOps
{

    @Test(description="Test01: Validate Header menu")
    @Description("Test description: Validate Header menu and page content")
    public void test01_validateHeaderMenu()
    {
        webFlows.navigate_header();
    }

    @Test(description="Test02: Logon to Account")
    @Description("Test description: login to account and verify all is OK.")
    public void test02_accountTest()
    {
        webFlows.login_to_my_account("user1", "password");
        verifications.textInElement(siteAccountPage.txt_loggedUserWelcomeMessage, "Welcome, 1 user");
        verifications.textInElement(siteAccountPage.txt_loggedUserNameMain, "1 User");
        verifications.textInElement(siteAccountPage.txt_loggedUserNameSecondary, "1 user");

    }

    @Test(description="Test03: Filter & Add a Product")
    @Description("Test description: Filter to a single product and add to cart")
    public void test03_addProductToCart()
    {
        webActions.click(siteHeader.link_header_shop);
        webActions.click(siteShopPage.btn_Filter_Shoes);
        webActions.click(siteShopPage.btn_addToCart);
        webActions.click(siteShopPage.btn_Image_singleResult);
        verifications.textInElement(siteShopPage.txt_ProductPrice, "150.00 ₪");
        verifications.textInElement(siteBar.txt_header_cart_amount, "150.00 ₪");
        verifications.textInElement(siteBar.txt_header_cart_Count, "1");
        webActions.click(siteBar.link_header_cart);
    }

    @Test(description="Test04: Filter & Add a Product")
    @Description("Test description: Filter to a single product and add to cart")
    public void test04_removeProductFromCart()
    {
        webActions.click(siteHeader.link_header_cart);
        webActions.click(siteCartPage.btn_TableRemoveProduct);
        webActions.click(siteHeader.link_header_cart);
        verifications.textInElement(siteBar.txt_header_cart_Count, "0");
        verifications.textInElement(siteBar.txt_header_cart_amount, "0.00 ₪");
        webActions.click(siteBar.link_header_cart);
        verifications.textInElement(siteCartPage.txt_cartIsEmpty, "Your cart is currently empty.");
    }

    @Test(description="Test05: Validate About Main Image")
    @Description("Test description: Check if the main image hasn't changed.")
    public void test05_verifyImageAbout()
    {
        webActions.click(siteHeader.link_header_about);
        verifications.visualElement(siteAboutPage.img_MainAboutImage, "mainAboutImage");
    }
}
