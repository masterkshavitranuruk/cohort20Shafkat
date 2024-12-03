package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethodsTests {

@Test(groups={"SmokeTest", "Regression"})
public void test1(){
  System.out.println("Inside test1 Method");
}

  @Test(dependsOnMethods = {"test1"} , groups = {"SmokeTest", "Regression"})
  public void test33(){
    System.out.println("inside test 33");
  }


  // TestNG Groups
          // include single group
  // Depends On Groups
  // Inlucde/exlude
  //Parameterization Test
  //dataProvider
  //TestNG ReRun failed Test cases
  //Parallel Execution
  //TestNG ListenersClass




//reporting

}
