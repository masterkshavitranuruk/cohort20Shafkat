package TestCases;

import Utilities.BaseClass;
import Utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExampleTest1 {

  @Test(enabled = false)
  public void test3(){
    System.out.println("Coming from ExampleTest1 Class");
    System.out.println("Coming from test3 Method");
  }

  @Test
  public void test4(){
    System.out.println("Coming from ExampleTest1 Class");
    System.out.println("Coming from test4 Method");
  }

}
