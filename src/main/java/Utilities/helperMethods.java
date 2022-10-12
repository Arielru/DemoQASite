package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import Utilities.commonOps;
import javax.imageio.ImageIO;
import java.io.File;

public class helperMethods extends commonOps
{
    public static void takeElementScreenShot(WebElement imageElement, String imagename)
    {
        wait.until(ExpectedConditions.visibilityOf(imageElement));
        imageScreenShot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement); //Win 10
        try
        {
            ImageIO.write(imageScreenShot.getImage(), "png", new File(("./ImageRepository/") + imagename + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error writing image file: " + e);
        }
    }

}
