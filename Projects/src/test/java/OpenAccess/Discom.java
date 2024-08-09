package OpenAccess;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import DataDriven1.ExcelUtils;

public class Discom {
	public static String successText= "User Registration Submitted Successfully";

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito=new");
		 WebDriver driver = new ChromeDriver(option);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set a reasonable timeout
	        // Login to the application
	        driver.get("http://3.130.91.46/KSEB/OA");
	        
	        //clicking on new register? link
	        //driver.findElement(By.xpath("//a[text()='New Register?']")).click();
	        //file pathe
	       String filepath = System.getProperty("user.dir")+"\\testdata\\TRADER.xlsx";
	      int rows = ExcelUtils.getRowCount(filepath, "Trader1");
	      
	      for(int i=3;i<=rows;i++) {
	    	//clicking on new register? link
	          driver.findElement(By.xpath("//a[text()='New Register?']")).click();
				//1) read data from excel

	    	  String ApplicantType = ExcelUtils.getCellData(filepath, "Trader1", i, 0);
	    	  String ApplicantName = ExcelUtils.getCellData(filepath, "Trader1", i, 1);
	    	  String LoginName = ExcelUtils.getCellData(filepath, "Trader1", i, 2);
	    	  String Designation = ExcelUtils.getCellData(filepath, "Trader1", i, 3);
	    	  String CompanyName = ExcelUtils.getCellData(filepath, "Trader1", i, 4);
	    	  String  SelectTheSecurityTQuestion = ExcelUtils.getCellData(filepath, "Trader1", i, 5);
	    	  String Answer = ExcelUtils.getCellData(filepath, "Trader1", i, 6);
	    	  String   MobileNumber= ExcelUtils.getCellData(filepath, "Trader1", i, 7);
	    	  String   PhoneNumber=  ExcelUtils.getCellData(filepath, "Trader1", i, 8);
	    	  String   Address = ExcelUtils.getCellData(filepath, "Trader1", i, 9);
	    	  String  Email=  ExcelUtils.getCellData(filepath, "Trader1", i, 10);
	    	  String   Fax=  ExcelUtils.getCellData(filepath, "Trader1", i, 11);
	    	  String  ApplicanName=  ExcelUtils.getCellData(filepath, "Trader1", i, 12);
	    	  String   Designtion=  ExcelUtils.getCellData(filepath, "Trader1", i, 13);
	    	  String  MobileNumber2= ExcelUtils.getCellData(filepath, "Trader1", i, 14);
	    	  String  PhoneNumber2= ExcelUtils.getCellData(filepath, "Trader1", i, 15);
	    	  String   Fax2=  ExcelUtils.getCellData(filepath, "Trader1", i, 16);
	    	  String  Email2=  ExcelUtils.getCellData(filepath, "Trader1", i, 17);
	    	  
	    	  String  CoordinatorName=  ExcelUtils.getCellData(filepath, "Trader1", i, 18);
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
	    	  String  DiscomLicenseName=  ExcelUtils.getCellData(filepath, "Trader1", i, 40); 
	    	  String  DiscomLicenseNumber =  ExcelUtils.getCellData(filepath, "Trader1", i, 41); 
	    	  String  LicenseIssuingAuthority=  ExcelUtils.getCellData(filepath, "Trader1", i, 42); 
	    	  String  DiscomOfficerDesignation=  ExcelUtils.getCellData(filepath, "Trader1", i, 43); 
	    	  String  DiscomOfficerEmailId =  ExcelUtils.getCellData(filepath, "Trader1", i, 44);
	    	  String  DiscomOfficerMobileNumber=  ExcelUtils.getCellData(filepath, "Trader1", i, 45); 
	    	  
	    	  // passing data in to the fileds
	    	  //Applicant type manually sending
	    	  WebElement applicantType = driver.findElement(By.xpath("//span[text()='Discom']"));
		        applicantType.click();
		        WebElement loginname = driver.findElement(By.xpath(" //input[@id='userName']"));
			     loginname.sendKeys(LoginName);
			     WebElement ApplicantNames = driver.findElement(By.xpath( "//input[@id='applicantName']"));
			     ApplicantNames.sendKeys(ApplicantName);
			     WebElement Designations = driver.findElement(By.xpath("//input[@id='applicantDesignation']"));
			     Designations.sendKeys(Designation);
			     WebElement companyName = driver.findElement(By.xpath("//input[@id='companyName']"));
			     companyName.sendKeys(CompanyName);
			     JavascriptExecutor js =  (JavascriptExecutor)driver;
			    
			     driver.findElement(By.xpath("//div[@id='securityQuestion']")).click();
			     List<WebElement> securitydropdown = driver.findElements(By.xpath("//ul[contains(@class,'css-r8u8y9')]//li[@tabindex='-1']"));
			     System.out.println(securitydropdown.size());
			     for(WebElement allquastions:securitydropdown)
			     {
			    	 if(allquastions.getText().equals(SelectTheSecurityTQuestion))
			    	 {
			    		 allquastions.click();
			    		 break;
			    	 }
			     }
			     
			     WebElement securityAnswer = driver.findElement(By.xpath("//input[@id='securityAnswer']"));
			     securityAnswer.sendKeys(Answer);
			     WebElement applicantMobileNumber = driver.findElement(By.xpath("//input[@id='applicantMobileNumber']"));
			     applicantMobileNumber.sendKeys(MobileNumber);
			     WebElement applicantPhoneNumber = driver.findElement(By.xpath("//input[@id='applicantPhoneNumber']"));
			     applicantPhoneNumber.sendKeys(PhoneNumber);
			     WebElement applicantAddress= driver.findElement(By.xpath( "//input[@id='applicantAddress']"));
			     applicantAddress.sendKeys(Address);
			     WebElement  applicantEmailId=driver.findElement(By.xpath( "//input[@id='applicantEmailId']"));
			     applicantEmailId.sendKeys(Email);
			     WebElement  applicantFaxNumber=driver.findElement(By.xpath( "//input[@id='applicantFaxNumber']"));
			     applicantFaxNumber.sendKeys(Fax);
			     WebElement secondaryApplicantName=driver.findElement(By.xpath( "//input[@id='secondaryApplicantName']"));
			     secondaryApplicantName.sendKeys(ApplicanName);
			     WebElement  secondaryDesignation=driver.findElement(By.xpath( "//input[@id='secondaryDesignation']"));
			     secondaryDesignation.sendKeys(Designtion);
			     WebElement  secondaryMobileNumber= driver.findElement(By.xpath( "//input[@id='secondaryMobileNumber']"));
			     secondaryMobileNumber.sendKeys(MobileNumber2);
			     WebElement  secondaryPhoneNumber= driver.findElement(By.xpath( "//input[@id='secondaryPhoneNumber']"));
			     secondaryPhoneNumber.sendKeys(PhoneNumber2);
			     WebElement secondaryFaxNumber = driver.findElement(By.xpath("//input[@id='secondaryFaxNumber']"));
			     secondaryFaxNumber.sendKeys(Fax2);
			     WebElement secondaryEmailId = driver.findElement(By.xpath("//input[@id='secondaryEmailId']"));
			     secondaryEmailId.sendKeys(Email2);
			     WebElement NextButton = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
			     NextButton.click();
			   
			     //Coordinator Details
			     WebElement coordinatorName = driver.findElement(By.xpath("//input[@id='coordinatorName']"));
			     coordinatorName.sendKeys(CoordinatorName);
			     WebElement coordinatorDesignation = driver.findElement(By.xpath("//input[@id='coordinatorDesignation']"));
			     coordinatorDesignation.sendKeys(CoordinatorDesignation);
			     WebElement coordinatorMobileNumber = driver.findElement(By.xpath("//input[@id='coordinatorMobileNumber']"));
			     coordinatorMobileNumber.sendKeys(CoordinatorMobileNumber);
			     WebElement coordinatorEmailId = driver.findElement(By.xpath("//input[@id='coordinatorEmailId']"));
			     coordinatorEmailId.sendKeys(CoordinatorEmail);
			     WebElement NextButton1 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
			     NextButton1.click();
			     
			   //Discom Details
			     
			     WebElement discomname = driver.findElement(By.xpath("//input[@id='discomName']"));
			 	discomname.sendKeys(DiscomLicenseName);
			 	WebElement discomlicensenum = driver.findElement(By.xpath("//input[@id='licenseeNumber']"));
			 	discomlicensenum.sendKeys(DiscomLicenseNumber);
			 	WebElement licenseissueautority = driver.findElement(By.xpath("//input[@id='licenseeIssuingAuthority']"));
			 	licenseissueautority.sendKeys(LicenseIssuingAuthority);
			 	WebElement discomdesignation = driver.findElement(By.xpath("//input[@id='discomDesignation']"));
			 	discomdesignation.sendKeys(DiscomOfficerDesignation);
			 	WebElement discommail = driver.findElement(By.xpath("//input[@id='discomEmailId']"));
			 	discommail.sendKeys(DiscomOfficerEmailId);
			 	WebElement discommobile = driver.findElement(By.xpath("//input[@id='discomMobileNumber']"));
			 	discommobile.sendKeys(DiscomOfficerMobileNumber);
			 	
			 	WebElement nextbutton = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
			 	nextbutton.click();
			     
			   //Payment details
			 	
					js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

			     WebElement transdropdown = driver.findElement(By.cssSelector("button[title='Open'] svg"));
			    
			     transdropdown.click()
		;	     Thread.sleep(5000);

			     List<WebElement> PaymentModeList = driver.findElements(By.xpath("//ul[@id='transactionType-listbox']/li"));
			     for(WebElement typeOfMatment:PaymentModeList)
			     {
			    	if(typeOfMatment.getText().equals(PaymentMode))
			    			{
			    		typeOfMatment.click();
			    		break;
			    			}
			     }
			     WebElement bankName = driver.findElement(By.xpath("//input[@id='bankName']"));
			     bankName.sendKeys(BankName);
			     WebElement utrNumber = driver.findElement(By.xpath("//input[@id='utrNumber']"));
			     utrNumber.sendKeys(UTRNumber);
			     WebElement panNumber = driver.findElement(By.xpath("//input[@id='panNumber']"));
			     panNumber.sendKeys(PANNumber);
			     WebElement gstNumber = driver.findElement(By.xpath("//input[@id='gstNumber']"));
			     gstNumber.sendKeys(GSTNumber);
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

			     //PAYMENT DATE
			     WebElement Paymentdate = driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']"));
			     Paymentdate.click();
			     Paymentdate.sendKeys(TransactionMonthYear);
			     
			     WebElement file3 = driver.findElement(By.xpath("//input[@id='supportingDocuments']"));
			     file3.sendKeys(SupportingDocuments);
			     
			     WebElement next3 = driver.findElement(By.xpath("//button[text()='Next']"));
			    next3.click();
			     //Subsmitting the application
			     WebElement submitting = driver.findElement(By.xpath("//button[contains(@class,'css-18qgb0n')]"));
			     //submitting.click();
			     Thread.sleep(5000);
			     boolean loggedIn=false;
			     try
			     {
			    	 WebElement successful = driver.findElement(By.xpath("//div[@class='MuiAlert-message css-18mfsq4']"));
			    	 
			    	 System.out.println("text-?>>>>"+successful.getText());
			    	 loggedIn =successful.getText().equals(successText);
			    	 System.out.println("loggedIn"+loggedIn);
			     }
			     catch(Exception e) {
			    	 e.printStackTrace();
			     }
			     if(loggedIn==true)
			     {
			    	 System.out.println("New User is Registered successfully ");
			    	 ExcelUtils.setCellData(filepath, "Trader1", i, 50, "user is registered ");
			     }
			     else
			     {
			    	 System.out.println("New User is  Not Registered  ");
			    	 ExcelUtils.setCellData(filepath, "Trader1", i, 50, "user is Not registered ");

			     }
			    	 
			     
	      }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
/*
  WebElement discomname = driver.findElement(By.xpath("//input[@id='discomName']"));
	discomname.sendKeys("");
	WebElement discomlicensenum = driver.findElement(By.xpath("//input[@id='licenseeNumber']"));
	discomlicensenum.sendKeys("");
	WebElement licenseissueautority = driver.findElement(By.xpath("//input[@id='licenseeIssuingAuthority']"));
	licenseissueautority.sendKeys("");
	WebElement discomdesignation = driver.findElement(By.xpath("//input[@id='discomDesignation']"));
	discomdesignation.sendKeys("");
	WebElement discommail = driver.findElement(By.xpath("//input[@id='discomEmailId']"));
	discommail.sendKeys("");
	WebElement discommobile = driver.findElement(By.xpath("//input[@id='discomMobileNumber']"));
	discommobile.sendKeys("");
	WebElement nextbutton = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	nextbutton.sendKeys("");
// */