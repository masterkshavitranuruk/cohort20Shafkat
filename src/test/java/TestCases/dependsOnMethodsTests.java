package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethodsTests {

@Test
public void test1(){
  System.out.println("Inside test1 Method");
  Assert.fail();
}

  @Test(dependsOnMethods = {"test1"} )
  public void test33(){
    System.out.println("inside test 33");
  }


  // TestNG Groups
  // Inlucde/exlude
  // Depends On Groups
  //Parameterization Test
  //Parallel Execution
  //TestNG ListenersClass
  //TestNG ReRun failed Test cases
//reporting

}
