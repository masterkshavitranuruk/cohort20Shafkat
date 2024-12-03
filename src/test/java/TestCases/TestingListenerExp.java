package TestCases;

import Utilities.BaseClass;
import Utilities.ListenersTestNG;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestingListenerExp extends BaseClass {


  @Test
  public void test1() {
    System.out.println("Test 1 Method is executing.....");
    Assert.fail();
  }


  @Test
  public void test6() {
    System.out.println("Test 6 Method is executing.....");
  }


  @Test(dependsOnMethods = "test1")
  public void test2() {
    System.out.println("Test 2 Method is executing.....");
  }


  @Test
  public void test3() {
    System.out.println("Test 3 Method is executing.....");
  }

  @Test
  public void test4() {
    System.out.println("Test 4 Method is executing.....");
  }

  @Test
  public void test5() {
    System.out.println("Test 5 Method is executing.....");
  }


}
