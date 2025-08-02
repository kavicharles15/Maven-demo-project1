package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcel {

	public static void main(String[] args) throws IOException {

	  //step 1- 	
	  FileInputStream fis = new FileInputStream("./src/test/resources/Excel.xlsx");
	
	  //step 2-
	  Workbook WB = WorkbookFactory.create(fis);
	  
	  //step 3-
	  Sheet sh = WB.getSheet("Sheet1");
		
	 //step 4-
	  Row row = sh.getRow(0);
	  
	  //step 5-
	  Cell cell = row.getCell(0);
	  
	  //step 6
	  String BROWSER = cell.getStringCellValue();
	  
	  //step 7-
	  WB.close();
		
		System.out.println(BROWSER);
		
		
		
		
		
		
	}

}
