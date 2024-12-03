package AutomationFityOneTestCases;

import Pages.HomePage;
import Pages.ShopPage;
import Utilities.BaseClass;
import Utilities.ListenersTestNG;
import Utilities.commonMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.class)
public class myHomePageTest extends commonMethods{


  ShopPage sp = new ShopPage();
  HomePage hp = new HomePage();


    @Test(priority = 1)
    public void homePageWitheThreeSlidersOnly(){
      commonMethods.clickOnNav("Shop", hp.navBar);
      sp.homeButton.click();
      commonMethods.tinyWait();
      Assert.assertTrue(hp.sliders.size() == 3);
    }

    @Test(enabled = true, priority = 2)
    public void homePageWithThreeArrivalsOnly(){
      commonMethods.clickOnNav("Shop", hp.navBar);
      sp.homeButton.click();
      commonMethods.tinyWait();
      Assert.assertTrue(hp.arrivals.size() == 3);
    }



  }
