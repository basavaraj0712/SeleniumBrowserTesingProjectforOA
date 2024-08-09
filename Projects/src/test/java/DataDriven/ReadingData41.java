package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData41 {

	public static void main(String[] args) throws IOException {
		// ExcelFile -->Workbanch -->sheet ---> row -->cell
		// creating the excel file and stored the file location
FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\TRADER.xlsx");
//getting the workbench from the file 
XSSFWorkbook workbook=new XSSFWorkbook(file);
//with workbook going to the particular sheet
XSSFSheet sheet = workbook.getSheet("Trader1");
//sheet variable to getting total rows and cells
int totalrows = sheet.getLastRowNum();
int totalcells = sheet.getRow(1).getLastCellNum();
System.out.println("total rows" +totalrows);
System.out.println("total rows" +totalcells);

// reading the data from the rows and cells 
for(int r=0; r<=totalrows; r++)
{
	//getting all the rows in a sheet
	XSSFRow row = sheet.getRow(r);
	for(int c=0;c<totalcells; c++)
	{
		XSSFCell cell = row.getCell(c);
		System.out.print(cell.toString()+"\t");
	}
	System.out.println("");
}
workbook.close();
file.close();
	}

}
