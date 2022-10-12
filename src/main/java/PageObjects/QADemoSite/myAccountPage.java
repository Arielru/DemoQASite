package PageObjects.QADemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class myAccountPage
{
    @FindBy(how = How.CSS, using = ".entry-title")
    public WebElement txt_Page_Name;

    @FindBy(how = How.XPATH, using = "//h2[.='Login']")
    public WebElement txt_login_header;

    @FindBy(how = How.ID, using = "username")
    public WebElement field_usernameOrEmail;

    @FindBy(how = How.ID, using = "password")
    public WebElement field_password;

    @FindBy(how = How.NAME, using = "login")
    public WebElement btn_login;

    @FindBy(how = How.ID, using = "rememberme")
    public WebElement checkbox_rememberMe;

    @FindBy(how = How.XPATH, using = "//a[.='Lost your password?']")
    public WebElement link_lostPAssword;

    @FindBy(how = How.XPATH, using = "//strong[1]")
    public WebElement txt_currentUserLogged;

    @FindBy(how = How.LINK_TEXT, using = "Logout")
    public WebElement link_logOut;

    @FindBy(how = How.XPATH, using = "//a[.='Confirm and log out']")
    public WebElement link_logOutConfirm;

    @FindBy(how = How.LINK_TEXT, using = "Change Password")
    public WebElement link_changePasswordTab;

    @FindBy(how = How.XPATH, using = "//input[@id='password_current']")
    public WebElement field_CurrentPassword;

    @FindBy(how = How.ID, using = "password_1")
    public WebElement field_NewPassword_1;

    @FindBy(how = How.ID, using = "password_2")
    public WebElement field_NewPassword_2;

    @FindBy(how = How.ID, using = "save_change_password")
    public WebElement btn_saveChangePassowrd;

    @FindBy(how = How.CSS, using = ".user-registration-MyAccount-navigation-link.user-registration-MyAccount-navigation-link--dashboard > a")
    public WebElement link_dashboard;

    @FindBy(how = How.XPATH, using = "//div[@id='user-registration']//h2[1]")
    public WebElement txt_loggedUserWelcomeMessage;

    @FindBy(how = How.XPATH, using = "//header//h3")
    public WebElement txt_loggedUserNameMain;

    @FindBy(how = How.XPATH, using = "//header/span[1]")
    public WebElement txt_loggedUserNameSecondary;

    @FindBy(how = How.XPATH, using = "//a[.='Dashboard']")
    public WebElement btn_leftMenuDashboard;

    @FindBy(how = How.CSS, using = "//a[.='Orders']")
    public WebElement btn_leftMenuOrders;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'ERROR: Incorrect username or password.')]")
    public WebElement txt_ERROR_incorrect_usernamePassword;

    @FindBy(how = How.XPATH, using = "/li[.='(3 attempts remaining.)']")
    public WebElement txt_ERROR_attempts_left;

    @FindBy(how = How.CSS, using = ".woocommerce-error > li:nth-of-type(2) > strong")
    public WebElement txt_ERROR_Counter_left;

}
