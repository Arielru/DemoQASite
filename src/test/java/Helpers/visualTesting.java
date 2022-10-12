package Helpers;

import Extentions.webActions;
import Utilities.commonOps;
import Utilities.helperMethods;
import org.testng.annotations.Test;

public class visualTesting extends commonOps
{
    @Test
    public void createScreenShotAboutMain()
    {
        webActions.click(siteHeader.link_header_about);
        helperMethods.takeElementScreenShot(siteAboutPage.img_MainAboutImage, "mainAboutImage");
    }
}
