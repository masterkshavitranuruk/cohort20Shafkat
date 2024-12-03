package TestCases;

import Utilities.BaseClass;
import Utilities.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestingCommonMethods {


  @Test
  public void test1() {

  //  commonMethods.sendKeys(BaseClass.getDriver().findElement(By.id("username")), "hello world");

    commonMethods.wait(33);

    List<WebElement> radioButtons = BaseClass.getDriver().findElements(By.xpath(""));
    commonMethods.clickRadioOrCheckboxByValue(radioButtons, "ClickThis");

  commonMethods.switchToIFrameByIndex(0);

      commonMethods.sendKeys("hello", BaseClass.getDriver().findElement(By.id("")));

  }




}
