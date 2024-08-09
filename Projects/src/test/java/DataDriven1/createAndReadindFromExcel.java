package DataDriven1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createAndReadindFromExcel {
	public static void main(String[] args) throws IOException {
		// CREATING THE NEW FILE AND PASSING DATA INTO THE ROWS AND CELLS
	FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\createsheet3.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet("create1");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num of Rows ");
	int totalrows = sc.nextInt();
	System.out.println("Enter num of cells ");
	int totalcells = sc.nextInt();
	// passing the data into rows and cells user forloop
	
		
	for(int r=0;r<=totalrows;r++)
	{
		//XSSFRow row=sheet.createRow(r);
		XSSFRow row = sheet.createRow(r);
	for(int c=0;c<totalcells;c++)
	{
		XSSFCell cell=row.createCell(c);
		cell.setCellValue(sc.next());
	}
	}
	
	workbook.write(file);
	
	// READING THE DATA FROM THE FILE 
	for(int r=0;r<=totalrows;r++)
	{
		XSSFRow row1=sheet.getRow(r);
		for(int c=0; c<totalcells;c++)
		{
			XSSFCell cell1=row1.getCell(c);
		System.out.print(cell1.toString()+"\t");
		}
		System.out.println();
	}
	
	workbook.close();
	file.close();
	System.out.println("successfully");
	}
}


