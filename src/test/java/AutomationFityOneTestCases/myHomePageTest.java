package AutomationFityOneTestCases;

import Pages.HomePage;
import Pages.ProductPage;
import Pages.ShopPage;
import Utilities.BaseClass;
import Utilities.Constants;
import Utilities.ListenersTestNG;
import Utilities.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.class)
public class myHomePageTest extends commonMethods{

    @Test(priority = 1)
    public void homePageWitheThreeSlidersOnly(){
      commonMethods.clickOnNav(Constants.shopString, hp.navBar);
      sp.homeButton.click();
      commonMethods.tinyWait();
     // Assert.assertTrue(hp.sliders.size() == 3);
      Assert.assertEquals(hp.sliders.size(), 3);
    }

    @Test(enabled = true, priority = 2)
    public void homePageWithThreeArrivalsOnly(){
      commonMethods.clickOnNav(Constants.shopString, hp.navBar);
      sp.homeButton.click();
      commonMethods.tinyWait();
     // Assert.assertTrue(hp.arrivals.size() == 3);
      Assert.assertEquals(hp.arrivals.size(), 3);
    }

  @Test//5
  public void homePageArrivalsImageReviews() {
    pp.seleniumRubyProduct.click();
    commonMethods.tinyWait();
    pp.addToCartButton.click();
    commonMethods.tinyWait();
    WebElement element = BaseClass.getDriver().findElement(By.xpath("//div[@class='woocommerce-tabs wc-tabs-wrapper']/ul/li[2]"));
    ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    commonMethods.tinyWait();
    element.click();
    commonMethods.tinyWait();
    WebElement paragraphSection = BaseClass.getDriver().findElement(By.xpath("//div[@id='comments']/p"));
    Assert.assertTrue(paragraphSection.isDisplayed(),"The Paragraph section is missing");
  }

}
