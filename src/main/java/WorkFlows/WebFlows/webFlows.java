package WorkFlows.WebFlows;

import Extentions.webActions;
import Extentions.verifications;
import Utilities.commonOps;
import org.testng.annotations.Test;

public class webFlows extends commonOps
{
    @Test(description = "validate that all of the header buttons work")
    public static void navigate_header()
    {
        webActions.click(siteHeader.link_header_shop);
        verifications.textInElement(siteHeader.link_header_shop, "Shop");
        webActions.click(siteHeader.link_header_whishlist);
        webActions.click(siteHeader.link_header_cart);
        webActions.click(siteHeader.link_header_checkout);
        webActions.click(siteHeader.link_header_my_account);
        webActions.click(siteHeader.link_header_about);
    }

    @Test(description = "Login to my Account with user")
    public static void login_to_my_account(String username, String password)
    {
        webActions.click(siteHeader.link_header_my_account);
        verifications.textInElement(siteAccountPage.txt_Page_Name, "My Account");
        webActions.updateText(siteAccountPage.field_usernameOrEmail, username);
        webActions.updateText(siteAccountPage.field_password, password);
        webActions.click(siteAccountPage.checkbox_rememberMe);
        webActions.click(siteAccountPage.btn_login);
    }

    @Test(description = "Login to my Account with user")
    public static void log_out_from_my_account()
    {
        webActions.click(siteHeader.link_header_my_account);
        verifications.textInElement(siteAccountPage.txt_Page_Name, "My Account");
        webActions.click(siteAccountPage.btn_login);
        webActions.click(siteAccountPage.link_logOut);
        webActions.click(siteAccountPage.link_logOutConfirm);
    }


}
