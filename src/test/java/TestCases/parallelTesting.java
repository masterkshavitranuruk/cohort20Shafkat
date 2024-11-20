package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class parallelTesting {
  WebDriver driver;

  @Test
  public void testingChrome(){
    System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
    driver = new ChromeDriver();
    driver.get("https://www.realmadrid.com/en-US");
    driver.manage().window().maximize();
    String madridPageTitle = driver.getTitle();
    System.out.println(madridPageTitle);
  }

  @Test
  public void testingSafari(){
    System.out.println("The thread ID for Safari is " + Thread.currentThread().getId());
    driver = new SafariDriver();
    driver.get("https://www.fcbarcelona.com/en/");
    driver.manage().window().maximize();
    String barcaPageTitle = driver.getTitle();
    System.out.println(barcaPageTitle);
  }


  @Test
  public void testingEdge(){
    System.out.println("The thread ID for Edge is " + Thread.currentThread().getId());
    driver = new EdgeDriver();
    driver.get("https://www.manutd.com/");
    driver.manage().window().maximize();
    String manUTitlePage = driver.getTitle();
    System.out.println(manUTitlePage);
  }

}
