package Extentions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class webActions extends commonOps
{
    @Step("clicking on element")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Update field element")
    public static void updateText(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step("get element text")
    public static void getText(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.getText();
    }

    @Step("select element from dropdown menu")
    public static void updateDropDown(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    @Step("Mouse hover a single element")
    public static void mouseHoverElement (WebElement elem1)
    {
        action.moveToElement(elem1).click().build().perform();
    }

    @Step("Mouse hover a two element")
    public static void mouseHoverElements (WebElement elem1, WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }
}
