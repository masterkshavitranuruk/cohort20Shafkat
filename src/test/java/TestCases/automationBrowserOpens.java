package TestCases;

import Utilities.BaseClass;
import Utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class automationBrowserOpens {



  @Test(groups= {"SmokeTest" , "Regression", "mobile"})
  public void test1(){
//    BaseClass.getDriver().findElement(By.xpath("//*[@id='menu-item-40']")).click();
//    System.out.println(ConfigurationReader.getProperty("username"));
//    System.out.println(ConfigurationReader.getProperty("password"));

    System.out.println("Coming from automationBrowserOpens Class");
    System.out.println("Coming from test1 Method");

  }

  @Test(groups={"Regression"})
  public void test2() {
//    BaseClass.getDriver().findElement(By.xpath("//*[@id='menu-item-224']")).click();
   // System.out.println(ConfigurationReader.getProperty("address"));
    System.out.println("Coming from automationBrowserOpens Class");
    System.out.println("Coming from test2 Method");
  }

  @Test(dependsOnGroups = {"SmokeTest"})
  public void cohort20Method(){
    System.out.println("This only executes when all of the regression suite tests are successfully executed");
  }




}
