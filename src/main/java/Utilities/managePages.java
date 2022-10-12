package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends Base {

    public static void init()
    {
        {
            siteHeader = PageFactory.initElements(driver, PageObjects.QADemoSite.Header.class);
            siteBar = PageFactory.initElements(driver, PageObjects.QADemoSite.Bar.class);
            siteHomePage = PageFactory.initElements(driver, PageObjects.QADemoSite.homePage.class);
            siteShopPage = PageFactory.initElements(driver, PageObjects.QADemoSite.shopPage.class);
            siteWishlistPage = PageFactory.initElements(driver, PageObjects.QADemoSite.wishListPage.class);
            siteCartPage = PageFactory.initElements(driver, PageObjects.QADemoSite.cartPage.class);
            siteCheckOutPage = PageFactory.initElements(driver, PageObjects.QADemoSite.checkOutPage.class);
            siteAccountPage = PageFactory.initElements(driver, PageObjects.QADemoSite.myAccountPage.class);
            siteAboutPage = PageFactory.initElements(driver, PageObjects.QADemoSite.aboutPage.class);
            siteBottomBar =  PageFactory.initElements(driver, PageObjects.QADemoSite.bottomBar.class);
        }
    }
}