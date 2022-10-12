package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage {

    @FindBy(how = How.CSS, using = ".entry-title")
    public WebElement txt_Page_Name;

    @FindBy(how = How.XPATH, using = "//div[@class='elementor-element elementor-element-de8ec46 elementor-widget elementor-widget-wp-widget-best_shop_product_attribute_widget']//img[@src='http://demo.arielrudin.net/wp-content/uploads/2017/12/product-bag3-300x300.jpg']")
    public WebElement img_BrightRedBag;

}
