package Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Constants {

    public static String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
// variable
final public static Integer implicitlyWaitTime = 30;
    final public static String configPropFilePath = "src/test/resources/configurationFolder/configuration.properties";
    final public static String sqlQuery = "Select * employeeID from Employer;";
    final public static String excelFilePath = "src/test/resources/excelFiles/ClassData.xlsx";
   final public static String  oracleEmployeeExcelFile = "src/test/resources/excelFiles/ClassData.xlsx";
    final public static String  oracleExecutiveExcelFile = "src/test/resources/excelFiles/ClassData.xlsx";
    final public static String excelNewFilePath = "src/test/resources/excelFiles/NewExcelFile_"+timestamp+".xlsx";
    final public static String expectedDescriptionParag = "";
    final public static String shopString = "Shop";
}
