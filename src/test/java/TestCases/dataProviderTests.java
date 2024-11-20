package TestCases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTests {


  @DataProvider(name ="anotherMonsterDP")
  public String[][] dpMethod2(){
    return new String[][]{{}};
  }

  @DataProvider(name ="cuteDataProvider")
  public String[][] dpMethod(){
    return new String[][]{{"Shafkat Ali"}, {"Catherine Mendy"}, {"Cindy R."}, {"Turan Hasanli"},{"Kawthar El-Khatib"}
    ,{"Maha Goosheh"}, {"MQ"}, {"Nadia Akosso"}, {"Warda Missana"}, {"Weilun Hai"}, {"Yancy Lou"}};
  }
  
  

  @Test(dataProvider = "cuteDataProvider")
  public void myNameTest(String name){
    System.out.println("My name is " + name);
  }

  
  
  
  

}
