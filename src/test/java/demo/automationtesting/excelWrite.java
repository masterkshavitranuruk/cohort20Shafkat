package demo.automationtesting;

import Utilities.Constants;
import Utilities.ExcelManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class excelWrite {


    public static void main(String[] args) throws IOException {

        String [] values = {"Farm Credit", "Bank Of America", "Capital One", "Wells Fargo", "TD Bank", "Chase" , "Turan Bank", "Citi Bank"};
        ExcelManager.writeValuesToEndOfRow(Constants.excelFilePath, "Sheet1", values);





//
//        //opening connection to file
//        FileInputStream fis = new FileInputStream(Constants.excelFilePath);
//
//        //connection to workbook
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//
//        //connect sheet
//        XSSFSheet sheet = wb.getSheetAt(1);
//
//       int lastRowNum =  sheet.getLastRowNum();
//       System.out.println("Last row number is " + lastRowNum);
//        for (int i = 1; i <= lastRowNum; i++) {
//                Row row = sheet.getRow(i);
//                Cell cell = row.createCell(9);
//                cell.setCellValue("Capital One");
//        }
//
//        FileOutputStream fos = new FileOutputStream(Constants.excelNewFilePath);
//        wb.write(fos);
//        fos.close();
    }
}
