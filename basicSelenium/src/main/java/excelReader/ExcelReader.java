package excelReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {
	HSSFWorkbook wb;
    HSSFSheet Sheet1;

 

public void excelReader(String excelpath)
{
    try 
    {
    File src = new File(excelpath);
    FileInputStream fis = new FileInputStream(src);
    wb = new HSSFWorkbook(fis);
    } 
    catch (Exception e) 
    {
        System.out.println(e.getMessage());            
    }
}

 

public String getData(int sheetNumber, int row, int column)
{
    Sheet1 = wb.getSheetAt(sheetNumber);
    String data = Sheet1.getRow(row).getCell(column).getStringCellValue();
    return data;
}

 


public int getRowcount(int SheetIndex)
{
    int row = wb.getSheetAt(SheetIndex).getLastRowNum();
    row = row+1;
    return row;
}

}
