package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class bottomBar
{
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Quick Links')]")
    public WebElement txt_quicklinks;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'For Her')]")
    public WebElement txt_For_Her;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'For_Him')]")
    public WebElement txt_for_Him;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Women Jeans')]")
    public WebElement link_For_Her_WomenJeans;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Tops and Shirts')]")
    public WebElement link_For_Her_TopsShirts;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Heels and Flats')]")
    public WebElement link_For_Her_HeelsFlats;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Women Accessories')]")
    public WebElement link_For_Her_WomanAccesories;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Men Jeans')]")
    public WebElement link_For_Him_ManJeans;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Men Shirts')]")
    public WebElement link_For_Him_ManShirts;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Men Shoes')]")
    public WebElement link_For_Him_ManShoes;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Men Accessories')]")
    public WebElement link_For_Him_ManAccesories;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Men Jackets')]")
    public WebElement link_For_Him_ManJackets;

    @FindBy(how = How.CSS, using = ".bi")
    public WebElement btn_arrowUp;
}
