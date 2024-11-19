package TestCases;

import Utilities.BaseClass;
import Utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class automationBrowserOpens {



  @Test
  public void test1(){
//    BaseClass.getDriver().findElement(By.xpath("//*[@id='menu-item-40']")).click();
//    System.out.println(ConfigurationReader.getProperty("username"));
//    System.out.println(ConfigurationReader.getProperty("password"));

    System.out.println("Coming from automationBrowserOpens Class");
    System.out.println("Coming from test1 Method");

  }

  @Test
  public void test2() {
//    BaseClass.getDriver().findElement(By.xpath("//*[@id='menu-item-224']")).click();
   // System.out.println(ConfigurationReader.getProperty("address"));
    System.out.println("Coming from automationBrowserOpens Class");
    System.out.println("Coming from test2 Method");

  }




}
