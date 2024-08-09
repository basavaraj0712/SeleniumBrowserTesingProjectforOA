package OpenAccess;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDriven1.Excel;
import DataDriven1.ExcelUtils;

public class LoginPage {
	  public static void main(String[] args) throws IOException, InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set a reasonable timeout
	        // Login to the application
	        driver.get("http://3.21.193.9/KSEB/OA");
	        String Filepath = System.getProperty("user.dir") + "\\testdata\\caldata.xlsx";
	        
	        int totalrows = Excel.getRowCount(Filepath, "sheet1");
	        for (int i = 1; i <= totalrows; i++) {
	            // Reading excel data
	            String Username = Excel.getCellData(Filepath, "sheet1", i, 0);
	            String Password = Excel.getCellData(Filepath, "sheet1", i, 1);
	            String Validate = Excel.getCellData(Filepath, "sheet1", i, 2);
	           // System.out.println("The validate value -> " + Validate);
	            
	            // Passing data
	            WebElement userField = driver.findElement(By.cssSelector("#userId"));
	            WebElement passwordField = driver.findElement(By.cssSelector("#-password-login"));
	            userField.sendKeys(Username);
	            passwordField.sendKeys(Password);
	            
	            // Clicking login button
	            driver.findElement(By.xpath("//button[@tabindex='0']")).click();
//	            boolean isInvalidCred = false;
//	            try {
//	                String invalidCredText = driver.findElement(By.xpath("//span[text()='Invalid Credentials']")).getText();
//	                
//	                isInvalidCred = invalidCredText.equals("Invalid Credentials");
//	           
//	            
//	            } catch (NoSuchElementException e) {
//	                // No invalid credentials message found
//	            }
	//
//	            System.out.println("isInvalidCred: " + isInvalidCred);
//	            if (isInvalidCred !=true) {
//	            	
//	            	System.out.println("Logged in successfully");
//	              Excel.setCellData(Filepath, "sheet1", i, 5, "pass");
////	            String actual = driver.findElement(By.xpath("//li/h6[text()='Dashboard']")).getTagName();
	//
//	              
//	              driver.findElement(By.xpath("//button[@title='Logout']")).click();
//	            } else {
//	                System.out.println("Not Logged in");
//	                Excel.setCellData(Filepath, "sheet1", i, 5, "failed");
////	               
//	            }
//	        }
	            boolean Dashboard =false;
	            try
	            {
	            String actual = driver.findElement(By.xpath("//li/h6[text()='Dashboard']")).getTagName();
	            	Dashboard=actual.equals(Validate);
	            }
	            catch(Exception e) {}
	            if(Dashboard==true)
	            {
	            	System.out.println("Application is logged in");
	            	 Excel.setCellData(Filepath, "sheet1", i, 4, "pass");
	            	driver.findElement(By.xpath("//button[@title='Logout']")).click();
	            }
	            else
	            {
	            	System.out.println("Not able to login to the application ");
	            	 Excel.setCellData(Filepath, "sheet1", i, 4, "failed");
	            }
	        
	        
	    }
	        driver.quit();

	    }
	}
/* String  CoordinatorName=  ExcelUtils.getCellData(filepath, "Trader1", i, 18);
    	  String   CoordinatorDesignation=  ExcelUtils.getCellData(filepath, "Trader1", i, 19);
    	  String   CoordinatorMobileNumber= ExcelUtils.getCellData(filepath, "Trader1", i, 20);
    	  String   CoordinatorEmail=  ExcelUtils.getCellData(filepath, "Trader1", i, 21);
    	  
    	  String  TraderName = ExcelUtils.getCellData(filepath, "Trader1", i, 22);
    	  String  TypeofTrader=  ExcelUtils.getCellData(filepath, "Trader1", i, 23);
    	  String   HERCTradingLicenseNo=  ExcelUtils.getCellData(filepath, "Trader1", i, 24);
    	  String  HERCLicenseFrom=  ExcelUtils.getCellData(filepath, "Trader1", i, 25);
    	  String  HERCValidityTo=  ExcelUtils.getCellData(filepath, "Trader1", i, 26);
    	  String  UploadLicenseCopyHERC = ExcelUtils.getCellData(filepath, "Trader1", i, 27);
    	  String     CERCLicenseLevel=  ExcelUtils.getCellData(filepath, "Trader1", i, 28);
    	  String CERCTradingLicenseNo=  ExcelUtils.getCellData(filepath, "Trader1", i, 29);
    	  String  CERCLicensFrom=  ExcelUtils.getCellData(filepath, "Trader1", i, 30);
    	  String  CERCLicenseTo=  ExcelUtils.getCellData(filepath, "Trader1", i, 31);
    	  String UploadLicenseCopyCERC=  ExcelUtils.getCellData(filepath, "Trader1", i, 32);
    	  
    	  String   PaymentMode = ExcelUtils.getCellData(filepath, "Trader1", i, 33);
    	  String   UTRNumber=  ExcelUtils.getCellData(filepath, "Trader1", i, 34);
    	  String  BankName=  ExcelUtils.getCellData(filepath, "Trader1", i, 35);
    	  String  PANNumber=  ExcelUtils.getCellData(filepath, "Trader1", i, 36);
    	  String  GSTNumber=  ExcelUtils.getCellData(filepath, "Trader1", i, 37);
    	  String  TransactionMonthYear=  ExcelUtils.getCellData(filepath, "Trader1", i, 38); 
    	  String  SupportingDocuments=  ExcelUtils.getCellData(filepath, "Trader1", i, 39);  
    	  */
