package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

 public HomePage(){
   PageFactory.initElements(BaseClass.getDriver(), this);
 }

@FindBy(xpath = "//*[@id='main-nav']/li")
public List<WebElement> navBar;

@FindBy(xpath = "//div[@class='n2-ss-slider-3']/div")
public List<WebElement> sliders;

@FindBy(xpath = "//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div")
public List<WebElement> arrivals;





}
