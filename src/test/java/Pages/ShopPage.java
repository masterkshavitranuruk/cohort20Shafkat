package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShopPage {


  public ShopPage(){
    PageFactory.initElements(BaseClass.getDriver(), this);
  }

  @FindBy(xpath = "//a[text()='Home']")
  public WebElement homeButton;





}
