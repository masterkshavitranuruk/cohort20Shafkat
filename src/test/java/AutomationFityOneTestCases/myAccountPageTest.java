package AutomationFityOneTestCases;


import Pages.HomePage;
import Pages.ShopPage;
import Utilities.ListenersTestNG;
import org.testng.annotations.Listeners;

@Listeners(ListenersTestNG.class)
public class myAccountPageTest {

  ShopPage sp = new ShopPage();
  HomePage hp = new HomePage();


}
