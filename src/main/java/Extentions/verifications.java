package Extentions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class verifications extends commonOps
{
    @Step("Verify text in element")
    public static void textInElement(WebElement elem, String expectedValue)
    {
       wait.until(ExpectedConditions.visibilityOf(elem));
        Assert.assertEquals(elem.getText(), expectedValue);
    }

    @Step("Verify number of elements equals to X")
    public static void numberOfElements(List<WebElement> elems, int expectedValue)
    {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(), expectedValue);
    }

    @Step("verify element exists")
    public static void verifyElementExists(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.isDisplayed();
    }

    @Step("Verify Element visually")
    public static void visualElement (WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try
        {
            Thread.sleep(1000);
            expectedImage = ImageIO.read(new File(("./imageRepository/") + expectedImageName +".png"));

        }
        catch (Exception e)
        {
            System.out.println("Error reading image file: " + e);
        }
        //new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement)
        Screenshot imageScreenShot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement); //Win 10
        //Screenshot imageScreenShot = new AShot().takeScreenshot(driver, imageElement); //Win 7
        BufferedImage actualImage = imageScreenShot.getImage();
        imgDiff = new ImageDiffer();
        diff = imgDiff.makeDiff(actualImage, expectedImage);
        Assert.assertTrue(diff.hasDiff(), " Images are the same");
    }


//    public static void currentURL(String elems)
//    {
//        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
//        assertEquals(elems.size(), expectedValue);
//    }
}
