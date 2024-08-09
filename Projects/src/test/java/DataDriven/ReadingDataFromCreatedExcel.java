package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromCreatedExcel {

	public static void main(String[] args) throws IOException {
FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\my1.xlsx");
XSSFWorkbook workbook= new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("basava");
int rows = sheet.getLastRowNum();
int cells = sheet.getRow(0).getLastCellNum();
for(int r=0;r<=rows;r++)
{
	XSSFRow row=sheet.getRow(r);
	for(int c=0; c<cells; c++)
	{
		XSSFCell cell=row.getCell(c);
		System.out.print(cell.toString()+"\t");
	}
	System.out.println();
}
workbook.close();
file.close();


	}

}
