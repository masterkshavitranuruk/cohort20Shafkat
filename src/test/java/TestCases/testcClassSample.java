package TestCases;

import Utilities.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testcClassSample {

  @Test(retryAnalyzer = RetryAnalyzer.class)
  public void testingSomething(){
    Assert.fail();
  }






}
