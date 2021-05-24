package seleniumTech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_xls_file {

	public static void main(String[] args) throws Exception, IOException {
	
/*   //This code is to access .XLS file
     // We added 2 poi jar files to access .xls file 
      // poi 3.9 and poi 4.0.0
	
			File f = new File("/Users/Maham/Desktop/mydata.xls");
			HSSFWorkbook myexcel = new HSSFWorkbook (new FileInputStream(f));
 
			HSSFSheet sheet = myexcel.getSheetAt(0);
			
			
			HSSFRow row = sheet.getRow(1); // to get to row
			
			String Value = row.getCell(0).toString(); // to get specific cell in a uper selected row 
			System.out.println(Value);
			
			
//------------------------------------------//
		//This code is for xlsx file
		
		File file = new File("/Users/Maham/Desktop/mydata.xlsx");
		
		Workbook wb = new XSSFWorkbook (new FileInputStream(file));
		
		Sheet sh = wb.getSheet(0);

*/
	}

}
