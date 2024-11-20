package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplications {


  @Test
  @Parameters({"Number1","Number2", "My Name"})
  public void add(int a, int b, String fullName){
    int result = a + b;
    System.out.println(result);
    System.out.println("My name is " + fullName);
  }


}
