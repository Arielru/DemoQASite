package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class shopPage {

    @FindBy(how = How.CSS, using = ".entry-title")
    public WebElement txt_Page_Name;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Showing 1–16 of 31 results')]")
    public WebElement txt_totalResults;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Denim')]")
    public WebElement btn_Filter_Denim;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Gray Jeans')]")
    public WebElement btn_Filter_GrayJeans;

    @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[1]/div[1]/div[1]/div[1]/aside[1]/section[2]/div[1]/a[3]")
    public WebElement btn_Filter_Jeans;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Jewellery')]")
    public WebElement btn_Filter_Jewellery;

    @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[1]/div[1]/div[1]/div[1]/aside[1]/section[2]/div[1]/a[5]")
    public WebElement btn_Filter_Men;

    @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[1]/div[1]/div[1]/div[1]/aside[1]/section[2]/div[1]/a[6]")
    public WebElement btn_Filter_Shoes;

    @FindBy(how = How.LINK_TEXT, using = "Add to cart")
    public WebElement btn_addToCart;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
    public WebElement txt_singleResult;

    @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
    public WebElement btn_Image_singleResult;

    @FindBy(how = How.XPATH, using = "//p[@class='price']//bdi[1]")
    public WebElement txt_ProductPrice;
}
