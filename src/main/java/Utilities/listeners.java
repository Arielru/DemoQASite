package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends commonOps implements ITestListener
{

    public void onTestStart(ITestResult test)
    {
        System.out.println("-------------------- Starting Test:" + test.getName() + "--------------------");
    }

    public void onTestSuccess(ITestResult test)
    {
        System.out.println("-------------------- Pass Test:" + test.getName() + "--------------------");
    }

    public void onTestFailure(ITestResult test)
    {
        System.out.println("-------------------- Fail Test:" + test.getName() + "--------------------");
        saveScreenshot();
    }

    public void onTestSkipped(ITestResult test)
    {
        System.out.println("-------------------- Skipping Test:" + test.getName() + "--------------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult)
    {
        // TODO Auto-generated method stub
    }

    public void onStart(ITestContext iTestContext)
    {
        System.out.println("-------------------- Starting Execution --------------------");
    }

    public void onFinish(ITestContext iTestContext)
    {
        System.out.println("-------------------- Ending Execution --------------------");
    }

    @Attachment(value = "Page Screenshot", type = "/image/png")
    public byte[] saveScreenshot()
    {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
