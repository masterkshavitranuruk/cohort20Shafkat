package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public ProductPage(){
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    @FindBy(xpath="//img [@title='Selenium Ruby']")
    public WebElement seleniumRubyProduct;


    @FindBy(xpath = "//form[@class='cart']/button")
    public WebElement addToCartButton;
}
