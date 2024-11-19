package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ThisClassIsToReadPropertiesFiles {

  public static Properties prop;
  // public static WebDriver driver;


  //Properties
  //FileInputStream

  static {
    try{
      String filePath = "src/test/resources/configuration.properties";  // file path
      FileInputStream fis = new FileInputStream(filePath);  // opens connection to the file
      prop = new Properties();  // instantiating the object from line 8
      prop.load(fis); // using the openned connection (fis), we load all of the properties data, into prop
    }catch(Exception e){
      e.printStackTrace();
    }
  }


  public static String getProperty(String keyName){
    return prop.getProperty(keyName);
  }


}
