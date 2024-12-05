package demo.automationtesting;

import Utilities.Constants;
import Utilities.ExcelManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;


public class excelRead {

    public static void main(String[] args) throws IOException {
        ExcelManager.readExcelFile(Constants.excelFilePath, "Sheet1");
//        //open connection to excel file
//        String filePath = Constants.excelFilePath;  // file path
//        FileInputStream fis = new FileInputStream(filePath);
//
//        //connect to workbook
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//
//        //open connection to sheet page
//       XSSFSheet sheet = wb.getSheet("Sheet1");
//
//        for(Row row : sheet){
//            for(Cell cell : row) {
//                switch(cell.getCellType()){
//                    case BOOLEAN:
//                        System.out.println(cell.getBooleanCellValue() + "\t");
//                        break;
//                    case NUMERIC:
//                        System.out.println(cell.getNumericCellValue() + "\t");
//                        break;
//                    case STRING:
//                        System.out.println(cell.getStringCellValue() + "\t");
//                        break;
//                    case FORMULA:
//                        System.out.println(cell.getNumericCellValue() + "\t");
//                        break;
//                }
//                System.out.println();
//                wb.close();
//            }
//        }





    }
}
