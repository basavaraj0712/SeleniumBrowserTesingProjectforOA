package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PassingData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\TO_TRADER.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TRADER");
		Scanner sc = new Scanner(System.in);
		System.out.println("num of rows");
		int totalrows = sc.nextInt();
		System.out.println("num of cells");
		int totalcells = sc.nextInt();
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for(int c=0; c<totalcells;c++)
			{
				XSSFCell cell=row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();

		System.out.println("----" +totalrows);
		System.out.println("----" +totalcells);
		System.out.println("file is created successfully");
	}

}
