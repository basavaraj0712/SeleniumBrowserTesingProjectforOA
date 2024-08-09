package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelfile {

	public static void main(String[] args) throws IOException {
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\createdsheet12.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet sheet = workbook.getSheet("newsheet1");
Scanner sc = new Scanner(System.in);
System.out.println("num of rows");
int totalrows = sc.nextInt();
System.out.println("num of cells");
int totalcells = sc.nextInt();
workbook.write(file);
workbook.close();
file.close();

System.out.println("----" +totalrows);
System.out.println("----" +totalcells);
System.out.println("file is created successfully");
	}

}
