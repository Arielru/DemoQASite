package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class wishListPage {

    @FindBy(how = How.CSS, using = ".entry-title")
    public WebElement txt_Page_Name;
}
