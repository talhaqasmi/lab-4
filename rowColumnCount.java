package ass4POMexcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class rowColumnCount {
	 public static void main(String args[]) throws Exception
	   {
	       FileInputStream fis = new FileInputStream("C:\\Users\\4407\\eclipse-workspace\\ass4\\excelfile\\Automation.xlsx");
	       XSSFWorkbook workbook = new XSSFWorkbook(fis);
	       XSSFSheet sheet = workbook.getSheet("Sheet");
	       XSSFRow row = sheet.getRow(0);
	       int colNum = row.getLastCellNum();
	       System.out.println("Total Number of Columns in the excel is : "+colNum);
	       int rowNum = sheet.getLastRowNum()+1;
	       System.out.println("Total Number of Rows in the excel is : "+rowNum);
	   }
}
