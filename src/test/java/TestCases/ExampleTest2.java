package TestCases;

import org.testng.annotations.Test;

public class ExampleTest2 {

  @Test(groups = {"SmokeTest", "Regression"})
  public void test5(){
    System.out.println("Coming from ExampleTest2 Class");
    System.out.println("Coming from test5 Method");
  }

  @Test(groups = "Regression")
  public void test6(){
    System.out.println("Coming from ExampleTest2 Class");
    System.out.println("Coming from test6 Method");
  }
}
