package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StaticData {

	public static void main(String[] args) throws IOException {
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\static.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("static1");
	XSSFRow row0 = sheet.createRow(0);
	row0.createCell(0).setCellValue("basava");
	row0.createCell(1).setCellValue(12);
	row0.createCell(2).setCellValue("rec");
	
	XSSFRow row1 = sheet.createRow(1);
	row1.createCell(0).setCellValue("raj");
	row1.createCell(1).setCellValue(13);
	row1.createCell(2).setCellValue("rec1");	
workbook.write(file);
workbook.close();
file.close();
	
	
	}

}
