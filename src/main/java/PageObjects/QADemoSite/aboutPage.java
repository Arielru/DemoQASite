package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class aboutPage {

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'A Few Words About Us')]")
    public WebElement txt_aFewWords;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Who We Are')]")
    public WebElement txt_whoAreWe;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'We are the Elite Force to have the best response t')]")
    public WebElement txt_whoAreWedescription;

    @FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]")
    public WebElement img_Ariel;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]")
    public WebElement img_Batman;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]")
    public WebElement img_Einstein;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Ariel Rudin')]")
    public WebElement txt_Ariel;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Founder - CCCP')]")
    public WebElement txt_ArielRole;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Batman')]")
    public WebElement txt_Batman;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'COO')]")
    public WebElement txt_BatmanRole;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Albert Einstein')]")
    public WebElement txt_Einstein;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Marketing Head')]")
    public WebElement txt_EinsteinRole;

    @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/img[1]")
    public WebElement img_MainAboutImage;

}

