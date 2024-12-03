package Utilities;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {


  @Override
  public void onTestStart(ITestResult result) {
//    System.out.println(" New test Started " + result.getName());
    ExtentManager.createTest(result.getMethod().getMethodName(), "Performing " + result.getMethod().getMethodName());
  }

  @Override
  public void onTestSuccess(ITestResult result) {
      ExtentManager.getTest().pass("Test Passed");
  }

  @Override
  public void onTestFailure(ITestResult result) {
    ExtentManager.getTest().fail("Test Failed");
    try{
        ExtentManager.getTest().info("Screenshot of a failure page ").fail(MediaEntityBuilder.createScreenCaptureFromBase64String(commonMethods.takeScreenShot64(), "Screenshot of a failure page").build());
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  @Override
  public void onTestSkipped(ITestResult result) {
      ExtentManager.getTest().skip("Test Skipped");
  }

  @Override
  public void onStart(ITestContext context) {
    System.out.println(" on Start - " + context.getName());
  }

  @Override
  public void onFinish(ITestContext context) {
      ExtentManager.flushReports();
  }

}
