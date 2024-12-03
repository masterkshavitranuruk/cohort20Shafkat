package TestCases;

import Utilities.commonMethods;
import net.datafaker.Faker;

public class testingData {

  public static void main(String[] args) {

    Faker fakeData = new Faker();


   String fullName = fakeData.name().nameWithMiddle();
   String fullAddress =  fakeData.address().fullAddress();
   String randomCharacterhero = fakeData.ancient().hero();
   String randomGame = fakeData.videoGame().genre();

    System.out.println(fullName);
    System.out.println(fullAddress);
    System.out.println(randomCharacterhero);
    System.out.println(randomGame);


    /*
    Donn Jenkins Hilpert
    805 Arturo Unions, East Myronborough, TN 04442
    Hector
    Dungeon crawl
     */


    System.out.println(commonMethods.generateEmail());
    System.out.println(commonMethods.geneateAddress());
    System.out.println(commonMethods.chuckNorrisFact());

  }

}
