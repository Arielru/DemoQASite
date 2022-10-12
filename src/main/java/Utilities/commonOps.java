package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import org.w3c.dom.Document;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class commonOps extends Base
{

    public static String getXMLData (String nodeName)
    {
        File fxmlFile;
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dBuilder;
        Document doc = null;
        try
        {
            fxmlFile = new File("./Configuration/DataConfig.xml");
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fxmlFile);
            doc.getDocumentElement().normalize();
        }
        catch(Exception e)
        {
            System.out.println("Error reading XML file:" + e);
        }
        finally
        {
            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

    public static void resizeBrowser(String resolution)
    {
        String res = resolution;
        String[] parts = res.split(",");
        String width = parts[0];
        String height = parts[1];
        int width_int = Integer.parseInt(width);
        int height_int = Integer.parseInt(height);
        Dimension d = new Dimension( width_int,height_int);
        // resize current window to the set dimension
        driver.manage().window().setSize(d);
    }

    private void initBrowser(String browserType)
    {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
        else if (browserType.equalsIgnoreCase("edge"))
            driver = initEdgeDriver();

        else
            throw new RuntimeException("Invalid platform stated");

        String resolution = getXMLData("Resolution");
        if (resolution.equalsIgnoreCase("maximize")) {
            ;
            driver.manage().window().maximize();
        }
        else {
            commonOps.resizeBrowser(resolution);
        }
        driver.get(getXMLData("url"));
        driver.manage().timeouts().implicitlyWait(Long.valueOf(getXMLData("timeout")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
    }

    private WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    private WebDriver initFirefoxDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    private WebDriver initEdgeDriver()
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        return driver;
    }


    private void initMobile()
    {

    }


    @BeforeClass
    public void startSession()
    {
        String plaform = (getXMLData("platformName"));
        if (plaform.equalsIgnoreCase("web"))
            initBrowser(getXMLData("browserName"));
        else if (plaform.equalsIgnoreCase("mobile"))
            initMobile();
        else
            throw new RuntimeException("Invalid platform name");

        managePages.init();
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.get(getXMLData("url"));
    }

    @AfterClass
    public void closeSession()
    {
        driver.quit();
    }
}

