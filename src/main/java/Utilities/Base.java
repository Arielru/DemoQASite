package Utilities;

import PageObjects.QADemoSite.bottomBar;
import com.jcraft.jsch.JSch;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff;
    public static ImageDiff diff;
    public static DesiredCapabilities dc = new DesiredCapabilities();

    //Web
    public static PageObjects.QADemoSite.Header siteHeader;
    public static PageObjects.QADemoSite.Bar siteBar;
    public static PageObjects.QADemoSite.homePage siteHomePage;
    public static PageObjects.QADemoSite.shopPage siteShopPage;
    public static PageObjects.QADemoSite.wishListPage siteWishlistPage;
    public static PageObjects.QADemoSite.cartPage siteCartPage;
    public static PageObjects.QADemoSite.checkOutPage siteCheckOutPage;
    public static PageObjects.QADemoSite.myAccountPage siteAccountPage;
    public static PageObjects.QADemoSite.aboutPage siteAboutPage;
    public static PageObjects.QADemoSite.bottomBar siteBottomBar;

    //Rest API
    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams =  new JSONObject();
    public static JsonPath jp;

    //mySQL
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    //LinuxServer
    public static JSch linux = new JSch();
}

