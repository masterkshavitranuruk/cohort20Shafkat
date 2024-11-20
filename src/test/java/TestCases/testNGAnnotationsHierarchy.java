package TestCases;

import org.testng.annotations.*;

public class testNGAnnotationsHierarchy {


  @Test(groups = {"SmokeTest", "Regression"})
  public void test1(){
   System.out.println("test1");
  }
  @Test(groups = {"SmokeTest", "Regression"})
  public void test2(){
    System.out.println("test2");
  }
  @Test(groups = {"Regression", "SmokeTest"})
  public void test3(){
    System.out.println("test3");

  }
  @BeforeMethod
  public void beforeMethod(){
    System.out.println("beforeMethod");

  }
  @AfterMethod
  public void afterMethod(){
    System.out.println("afterMethod");
  }
  @BeforeClass
  public void beforeClass(){
    System.out.println("beforeClass");
  }
  @AfterClass
  public void afterClass(){
    System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest(){
    System.out.println("beforeTest");

  }

  @AfterTest
  public void afterTest(){
    System.out.println("afterTest");
  }

  @BeforeSuite
  public void BeforeSuite(){
    System.out.println("BeforeSuite");

  }

  @AfterSuite
  public void AfterSuite(){
    System.out.println("AfterSuite");
  }



















}
