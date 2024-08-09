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
public class OpenAccesUserRegistrationAll {

	public static String successText = "User Registration Submitted Successfully";

	public static void main(String[] args) throws InterruptedException, IOException {
//
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--incognito=new");

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set a reasonable timeout
		// Login to the application
		driver.get("http://3.21.193.9/KSEB/OA");

		// clicking on new register? link
		// driver.findElement(By.xpath("//a[text()='New Register?']")).click();
		// file pathe
		String filepath = System.getProperty("user.dir") + "\\testdata\\TRADER.xlsx";
		int rows = ExcelUtils.getRowCount(filepath, "Trader1");
 JavascriptExecutor js1=(JavascriptExecutor)driver;
		for (int i =1; i <= rows; i++) {
			// clicking on new register? link
			driver.findElement(By.xpath("//a[text()='New Register?']")).click();
			// 1) read data from excel

			String ApplicantTypes = ExcelUtils.getCellData(filepath, "Trader1", i, 0);
			String ApplicantName = ExcelUtils.getCellData(filepath, "Trader1", i, 1);
			String LoginName = ExcelUtils.getCellData(filepath, "Trader1", i, 2);
			String Designation = ExcelUtils.getCellData(filepath, "Trader1", i, 3);
			String CompanyName = ExcelUtils.getCellData(filepath, "Trader1", i, 4);
			String SelectTheSecurityTQuestion = ExcelUtils.getCellData(filepath, "Trader1", i, 5);
			String Answer = ExcelUtils.getCellData(filepath, "Trader1", i, 6);
			String MobileNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 7);
			String PhoneNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 8);
			String Address = ExcelUtils.getCellData(filepath, "Trader1", i, 9);
			String Email = ExcelUtils.getCellData(filepath, "Trader1", i, 10);
			String Fax = ExcelUtils.getCellData(filepath, "Trader1", i, 11);
			String ApplicanName = ExcelUtils.getCellData(filepath, "Trader1", i, 12);
			String Designtion = ExcelUtils.getCellData(filepath, "Trader1", i, 13);
			String MobileNumber2 = ExcelUtils.getCellData(filepath, "Trader1", i, 14);
			String PhoneNumber2 = ExcelUtils.getCellData(filepath, "Trader1", i, 15);
			String Fax2 = ExcelUtils.getCellData(filepath, "Trader1", i, 16);
			String Email2 = ExcelUtils.getCellData(filepath, "Trader1", i, 17);

			String CoordinatorName = ExcelUtils.getCellData(filepath, "Trader1", i, 18);
			String CoordinatorDesignation = ExcelUtils.getCellData(filepath, "Trader1", i, 19);
			String CoordinatorMobileNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 20);
			String CoordinatorEmail = ExcelUtils.getCellData(filepath, "Trader1", i, 21);

			String TraderName = ExcelUtils.getCellData(filepath, "Trader1", i, 22);
			String TypeofTrader = ExcelUtils.getCellData(filepath, "Trader1", i, 23);
			String HERCTradingLicenseNo = ExcelUtils.getCellData(filepath, "Trader1", i, 24);
			String HERCLicenseFrom = ExcelUtils.getCellData(filepath, "Trader1", i, 25);
			String HERCValidityTo = ExcelUtils.getCellData(filepath, "Trader1", i, 26);
			String UploadLicenseCopyHERC = ExcelUtils.getCellData(filepath, "Trader1", i, 27);
			String CERCLicenseLevel = ExcelUtils.getCellData(filepath, "Trader1", i, 28);
			String CERCTradingLicenseNo = ExcelUtils.getCellData(filepath, "Trader1", i, 29);
			String CERCLicensFrom = ExcelUtils.getCellData(filepath, "Trader1", i, 30);
			String CERCLicenseTo = ExcelUtils.getCellData(filepath, "Trader1", i, 31);
			String UploadLicenseCopyCERC = ExcelUtils.getCellData(filepath, "Trader1", i, 32);

			String PaymentMode = ExcelUtils.getCellData(filepath, "Trader1", i, 33);
			String UTRNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 34);
			String BankName = ExcelUtils.getCellData(filepath, "Trader1", i, 35);
			String PANNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 36);
			String GSTNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 37);
			String TransactionMonthYear = ExcelUtils.getCellData(filepath, "Trader1", i, 38);
			String SupportingDocuments = ExcelUtils.getCellData(filepath, "Trader1", i, 39);
			//dis
			String DiscomLicenseName = ExcelUtils.getCellData(filepath, "Trader1", i, 40);
			String DiscomLicenseNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 41);
			String LicenseIssuingAuthority = ExcelUtils.getCellData(filepath, "Trader1", i, 42);
			String DiscomOfficerDesignation = ExcelUtils.getCellData(filepath, "Trader1", i, 43);
			String DiscomOfficerEmailId = ExcelUtils.getCellData(filepath, "Trader1", i, 44);
			String DiscomOfficerMobileNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 45);

			// SELLER GEN

			String subTypes = ExcelUtils.getCellData(filepath, "Trader1", i, 47);
			
			String GeneratorName = ExcelUtils.getCellData(filepath, "Trader1", i, 48);
			String TypeofGenerator = ExcelUtils.getCellData(filepath, "Trader1", i, 49);
			String FuelType = ExcelUtils.getCellData(filepath, "Trader1", i, 50);
			String UtilityinwhichEmbedded = ExcelUtils.getCellData(filepath, "Trader1", i, 51);
			String TotalInstalledCapacity = ExcelUtils.getCellData(filepath, "Trader1", i, 52);
			String SelectSIUnit = ExcelUtils.getCellData(filepath, "Trader1", i, 53);
			String PointofConnection = ExcelUtils.getCellData(filepath, "Trader1", i, 54);
			String SubstationName = ExcelUtils.getCellData(filepath, "Trader1", i, 55);
			String SubstationVoltageLevel = ExcelUtils.getCellData(filepath, "Trader1", i, 56);
			String STUGridConnectivityMW = ExcelUtils.getCellData(filepath, "Trader1", i, 57);
			String UploadSTUGridConnectivityDocument = ExcelUtils.getCellData(filepath, "Trader1", i, 58);
			String STUGridConnectivityDate = ExcelUtils.getCellData(filepath, "Trader1", i, 59);
			String SLDCSynchronizationPermissionNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 60);
			String SLDCSynchronizationDate = ExcelUtils.getCellData(filepath, "Trader1", i, 61);
			String SynchronisedOn = ExcelUtils.getCellData(filepath, "Trader1", i, 62);
			String UploadCommissioningReport = ExcelUtils.getCellData(filepath, "Trader1", i, 63);
			String CommissioningReportDate = ExcelUtils.getCellData(filepath, "Trader1", i, 64);
			String DateofCommissioning = ExcelUtils.getCellData(filepath, "Trader1", i, 65);
			String UploadSCADAVisibilityReport = ExcelUtils.getCellData(filepath, "Trader1", i, 66);
			String SCADAVisibilityReportDate = ExcelUtils.getCellData(filepath, "Trader1", i, 67);
			String AnnexureAupload = ExcelUtils.getCellData(filepath, "Trader1", i, 68);

			// sellr utility
			String UtilityName = ExcelUtils.getCellData(filepath, "Trader1", i, 69);
			String LicenseNumber = ExcelUtils.getCellData(filepath, "Trader1", i, 70);
			String IssuingAuthorit = ExcelUtils.getCellData(filepath, "Trader1", i, 71);
			String LicenseeValidityFromDate = ExcelUtils.getCellData(filepath, "Trader1", i, 72);
			String LicenseValidityToDate = ExcelUtils.getCellData(filepath, "Trader1", i, 73);
			String BaseTransmissionCapacityMW = ExcelUtils.getCellData(filepath, "Trader1", i, 74);
			String BTCRPeriodFromDate = ExcelUtils.getCellData(filepath, "Trader1", i, 75);
			String BTCRPeriodToDate = ExcelUtils.getCellData(filepath, "Trader1", i, 76);
			String UploadAuthorizationLetter = ExcelUtils.getCellData(filepath, "Trader1", i, 77);

			// foa
			String FOAUserName = ExcelUtils.getCellData(filepath, "Trader1", i, 78);
			String FOATypeFirst = ExcelUtils.getCellData(filepath, "Trader1", i, 79);
			String CapacityGrantedbySTUMW = ExcelUtils.getCellData(filepath, "Trader1", i, 80);
			String SubstationNames = ExcelUtils.getCellData(filepath, "Trader1", i, 81);
			String SubstationVoltageLevel1 = ExcelUtils.getCellData(filepath, "Trader1", i, 82);
			String DistributionicenseAreas = ExcelUtils.getCellData(filepath, "Trader1", i, 83);
			String District = ExcelUtils.getCellData(filepath, "Trader1", i, 84);
			String STUGridConnectivitys = ExcelUtils.getCellData(filepath, "Trader1", i, 85);
			String UploadSTUGridConnectivitys = ExcelUtils.getCellData(filepath, "Trader1", i, 86);
			String STUGridConnectivityDates = ExcelUtils.getCellData(filepath, "Trader1", i, 87);
			String BaseTCRRelatedinfos = ExcelUtils.getCellData(filepath, "Trader1", i, 88);
			String SLDCPermissonLetters = ExcelUtils.getCellData(filepath, "Trader1", i, 89);
			String SLDCPermissionDatess = ExcelUtils.getCellData(filepath, "Trader1", i, 90);
			String ConnectedLoadMWs = ExcelUtils.getCellData(filepath, "Trader1", i, 91);
			String ScreenShotWCRfile = ExcelUtils.getCellData(filepath, "Trader1", i, 92);
			String Screenshotdatess = ExcelUtils.getCellData(filepath, "Trader1", i, 93);
			String SupportingDocumentss = ExcelUtils.getCellData(filepath, "Trader1", i, 94);

			// passing data in to the fileds

//    	  WebElement applicantType = driver.findElement(By.xpath("//span[text()='Trader']"));
//	        applicantType.click();
			// based on excel
			List<WebElement> applicantType = driver
					.findElements(By.xpath("//div[contains(@class,'css-p58oka')]/label"));
			for (WebElement Applicants : applicantType) {
				String applicantTyp = Applicants.getText();
				// System.out.println(applicantTyp);
				if (applicantTyp.equals(ApplicantTypes)) {
					Applicants.click();
					break;
				}
			}

			if (ApplicantTypes.equals("Seller")) {
				List<WebElement> sellerTypeElement = driver
						.findElements(By.xpath("//div[contains(@class,'css-13sljp9')]//div[@id='sellerType']//label"));
				//System.out.println("seller type " + sellerTypeElement.size());
				for (WebElement seller : sellerTypeElement) {
				//	System.out.println("sellrt Text--->" + seller.getText());
					if (seller.getText().equals(subTypes)) {
						seller.click();
						break;
					}
				}
			}
			if (ApplicantTypes.equals("Buyer")) {
				List<WebElement> sellerTypeElement = driver
						.findElements(By.xpath("//div[contains(@class,'css-13sljp9')]//div[@id='buyerType']//label"));
				System.out.println("seller type " + sellerTypeElement.size());
				for (WebElement seller : sellerTypeElement) {
					System.out.println("sellrt Text--->" + seller.getText());
					if (seller.getText().equals(subTypes)) {
						seller.click();
						break;
					}
				}
			}

			Thread.sleep(5000);
			WebElement loginname = driver.findElement(By.xpath(" //input[@id='userName']"));
			loginname.sendKeys(LoginName);
			WebElement ApplicantNames = driver.findElement(By.xpath("//input[@id='applicantName']"));
			ApplicantNames.sendKeys(ApplicantName);
			WebElement Designations = driver.findElement(By.xpath("//input[@id='applicantDesignation']"));
			Designations.sendKeys(Designation);
			WebElement companyName = driver.findElement(By.xpath("//input[@id='companyName']"));
			companyName.sendKeys(CompanyName);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			driver.findElement(By.xpath("//div[@id='securityQuestion']")).click();
			List<WebElement> securitydropdown = driver
					.findElements(By.xpath("//ul[contains(@class,'css-r8u8y9')]//li[@tabindex='-1']"));
			System.out.println(securitydropdown.size());
			for (WebElement allquastions : securitydropdown) {
				if (allquastions.getText().equals(SelectTheSecurityTQuestion)) {
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
			WebElement applicantAddress = driver.findElement(By.xpath("//input[@id='applicantAddress']"));
			applicantAddress.sendKeys(Address);
			WebElement applicantEmailId = driver.findElement(By.xpath("//input[@id='applicantEmailId']"));
			applicantEmailId.sendKeys(Email);
			WebElement applicantFaxNumber = driver.findElement(By.xpath("//input[@id='applicantFaxNumber']"));
			applicantFaxNumber.sendKeys(Fax);
			WebElement secondaryApplicantName = driver.findElement(By.xpath("//input[@id='secondaryApplicantName']"));
			secondaryApplicantName.sendKeys(ApplicanName);
			WebElement secondaryDesignation = driver.findElement(By.xpath("//input[@id='secondaryDesignation']"));
			secondaryDesignation.sendKeys(Designtion);
			WebElement secondaryMobileNumber = driver.findElement(By.xpath("//input[@id='secondaryMobileNumber']"));
			secondaryMobileNumber.sendKeys(MobileNumber2);
			WebElement secondaryPhoneNumber = driver.findElement(By.xpath("//input[@id='secondaryPhoneNumber']"));
			secondaryPhoneNumber.sendKeys(PhoneNumber2);
			WebElement secondaryFaxNumber = driver.findElement(By.xpath("//input[@id='secondaryFaxNumber']"));
			secondaryFaxNumber.sendKeys(Fax2);
			WebElement secondaryEmailId = driver.findElement(By.xpath("//input[@id='secondaryEmailId']"));
			secondaryEmailId.sendKeys(Email2);
			WebElement NextButton = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
			NextButton.click();

			// Coordinator Details
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

			// String applicationSubType = "UTILITY";
			System.out.println("the sub type ->"+subTypes);
			
			switch (subTypes) {
			case "Trader": {
				// Trader Details
				WebElement traderName = driver.findElement(By.xpath("//input[@id='traderName']"));
				traderName.sendKeys(TraderName);
				driver.findElement(By.xpath(" //button[@title='Open']")).click();
				List<WebElement> traderType = driver.findElements(By.xpath("//ul[@id='traderType-listbox']/li"));
				for (WebElement tradertyps : traderType) {
					if (tradertyps.getText().endsWith(TypeofTrader)) {
						tradertyps.click();
						break;
					}
				}
				WebElement herctadinglicenseno = driver.findElement(By.xpath("//input[@id='hercTradingLicenseNo']"));
				herctadinglicenseno.sendKeys(HERCTradingLicenseNo);
				// KSERC License Validity From Date and to date
				WebElement KSERCLicenseFromdate = driver.findElement(By.xpath("//input[@id=':rp:']"));
				KSERCLicenseFromdate.click();
				KSERCLicenseFromdate.sendKeys(HERCLicenseFrom);

				WebElement KSERCLicenseTodate = driver.findElement(By.xpath("//input[@id=':rr:']"));
				KSERCLicenseTodate.click();
				KSERCLicenseTodate.sendKeys(HERCValidityTo);
				// file upload
				WebElement UploadKSERC = driver.findElement(By.xpath("//input[@id='hercLicenseCopy']"));
				UploadKSERC.sendKeys(UploadLicenseCopyHERC);

				WebElement cercLicenseLevel = driver.findElement(By.xpath("//input[@id='cercLicenseLevel']"));
				cercLicenseLevel.sendKeys(CERCLicenseLevel);

				WebElement cercTradingLicenseNo = driver.findElement(By.xpath("//input[@id='cercTradingLicenseNo']"));
				cercTradingLicenseNo.sendKeys(CERCTradingLicenseNo);

				// CERC License Validity From Date and to date
				WebElement CERCLicenseFromdate2 = driver.findElement(By.xpath("//input[@id=':rv:']"));
				CERCLicenseFromdate2.click();
				CERCLicenseFromdate2.sendKeys(CERCLicensFrom);

				WebElement CERCLicenseTodate2 = driver.findElement(By.xpath("//input[@id=':r11:']"));
				CERCLicenseTodate2.click();
				CERCLicenseTodate2.sendKeys(CERCLicenseTo);

				WebElement file2 = driver.findElement(By.xpath("//input[@id='cercLicenseCopy']"));
				file2.sendKeys(UploadLicenseCopyCERC);
				WebElement next = driver.findElement(By.xpath("//button[text()='Next']"));
				next.click();
				break;
			}
			case "Discom": {
				// Discom

				WebElement discomname = driver.findElement(By.xpath("//input[@id='discomName']"));
				discomname.sendKeys(DiscomLicenseName);
				WebElement discomlicensenum = driver.findElement(By.xpath("//input[@id='licenseeNumber']"));
				discomlicensenum.sendKeys(DiscomLicenseNumber);
				WebElement licenseissueautority = driver
						.findElement(By.xpath("//input[@id='licenseeIssuingAuthority']"));
				licenseissueautority.sendKeys(LicenseIssuingAuthority);
				WebElement discomdesignation = driver.findElement(By.xpath("//input[@id='discomDesignation']"));
				discomdesignation.sendKeys(DiscomOfficerDesignation);
				WebElement discommail = driver.findElement(By.xpath("//input[@id='discomEmailId']"));
				discommail.sendKeys(DiscomOfficerEmailId);
				WebElement discommobile = driver.findElement(By.xpath("//input[@id='discomMobileNumber']"));
				discommobile.sendKeys(DiscomOfficerMobileNumber);

				WebElement nextbutton = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
				nextbutton.click();
				break;
			}
			case "Generator": {
				WebElement generatorName = driver.findElement(By.id("generatorName"));
				generatorName.sendKeys(GeneratorName);
				WebElement generatorTypbutton = driver.findElement(By.xpath("//input[@id='generatorType']"));
				generatorTypbutton.click();
				List<WebElement> generatorTypeLists = driver
						.findElements(By.xpath("//ul[@id='generatorType-listbox']/li"));
				for (WebElement generatorLists : generatorTypeLists) {
					if (generatorLists.getText().equals(TypeofGenerator)) {
						generatorLists.click();
						break;
					}
				}
				driver.findElement(By.xpath("//input[@id='fuelType']")).click();
				List<WebElement> fuelTypeLists = driver.findElements(By.xpath("//ul[@id='fuelType-listbox']/li"));
				for (WebElement fuelLists : fuelTypeLists) {
					if (fuelLists.getText().equals(FuelType)) {
						fuelLists.click();
						break;
					}
				}
				driver.findElement(By.xpath("//input[@id='utilityEmbedded']")).click();
				List<WebElement> utilitTypeLists = driver
						.findElements(By.xpath("//ul[@id='utilityEmbedded-listbox']/li"));
				for (WebElement utilityLists : utilitTypeLists) {
					if (utilityLists.getText().equals(UtilityinwhichEmbedded)) {
						utilityLists.click();
						break;
					}
				}
				WebElement installedCapacityMw = driver
						.findElement(By.xpath("//input[@id='installedCapacityMw']"));
				installedCapacityMw.sendKeys(TotalInstalledCapacity);

				List<WebElement> siUnitRediobutton = driver.findElements(By.xpath("//div[@id='siUnit']/label"));
				for (WebElement siUnits : siUnitRediobutton) {
					if (siUnits.getText().equals(SelectSIUnit)) {
						siUnits.click();
						break;
					}
				}
				WebElement pointconnection = driver.findElement(By.xpath("//input[@id='connectionDetails']"));
				pointconnection.sendKeys(PointofConnection);
				WebElement substationname = driver.findElement(By.xpath("//input[@id='substationName']"));
				substationname.sendKeys(SubstationName);

				WebElement substationvoltage = driver.findElement(By.xpath("//input[@id='substationVoltageLevelKv']"));
				substationvoltage.click();
				List<WebElement> subVoltageLevelKv = driver
						.findElements(By.xpath("//ul[@id='substationVoltageLevelKv-listbox']/li"));
				for (WebElement subsVoltageLevelKv : subVoltageLevelKv) {
					if (subsVoltageLevelKv.getText().equals(SubstationVoltageLevel)) {
						subsVoltageLevelKv.click();
						break;
					}
				}

				WebElement stuGridMw = driver.findElement(By.xpath("//input[@id='stuGridConnectivityMw']"));
				stuGridMw.sendKeys(STUGridConnectivityMW);
				WebElement stuGridConnectivityDoc = driver
						.findElement(By.xpath("//input[@id='stuGridConnectivityDoc']"));// id-->name(not working
				stuGridConnectivityDoc.sendKeys(UploadSTUGridConnectivityDocument);

				WebElement STUGridDate = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[12]/div/div/input"));
				STUGridDate.click();
				STUGridDate.sendKeys(STUGridConnectivityDate);
				WebElement sldcSyncPermissionNum = driver
						.findElement(By.xpath("//input[@id='sldcSyncronizationPermissionNumber']"));
				sldcSyncPermissionNum.sendKeys(SLDCSynchronizationPermissionNumber);

				WebElement SldcSynchronizationDate = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[14]/div/div/input"));
				SldcSynchronizationDate.click();
				SldcSynchronizationDate.sendKeys(SLDCSynchronizationDate);

				WebElement SynchronizedOnDate = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[15]/div/div/input"));
				SynchronizedOnDate.click();
				SynchronizedOnDate.sendKeys(SynchronisedOn);

				WebElement UploadCommissioningfile = driver
						.findElement(By.xpath("//input[@id='uploadCommissioningReport']"));
				UploadCommissioningfile.sendKeys(UploadCommissioningReport);

				WebElement Commissioningdate = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[17]/div/div/input"));
				Commissioningdate.click();
				Commissioningdate.sendKeys(CommissioningReportDate);

				WebElement DateOfCommissioning = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[18]/div/div/input"));
				DateOfCommissioning.click();
				DateOfCommissioning.sendKeys(DateofCommissioning);

				WebElement SCADValidityFile = driver.findElement(By.xpath("//input[@id='scadaVisibilityReport']"));
				SCADValidityFile.sendKeys(UploadSCADAVisibilityReport);

				WebElement SCADValidityDate = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[20]/div/div/input"));
				SCADValidityDate.click();
				SCADValidityDate.sendKeys(SCADAVisibilityReportDate);

				WebElement reportAndAnnexureUpload = driver
						.findElement(By.xpath("//input[@id='reportAndAnnexureUpload']"));
				reportAndAnnexureUpload.sendKeys(AnnexureAupload);
				WebElement next = driver.findElement(By.xpath("//button[text()='Next']"));
				next.click();
				break;
			}
			case "Utility": {
				WebElement utilityName = driver.findElement(By.xpath("//input[@id='utilityName']"));
				utilityName.sendKeys(UtilityName);
				WebElement licenseeNumber = driver.findElement(By.xpath("//input[@id='licenseeNumber']"));
				licenseeNumber.sendKeys(LicenseNumber);
				WebElement issuingAuthoritys = driver.findElement(By.xpath("//input[@id='issuingAuthority']"));
				issuingAuthoritys.sendKeys(IssuingAuthorit);
				// driver.findElement(By.xpath("//input[@name='search' or
				// @placeholder='xyz']")).sendKeys("Tshirts");

				WebElement LicenseeFrom = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[4]/div/div/div/input"));
				LicenseeFrom.click();
				LicenseeFrom.sendKeys(LicenseeValidityFromDate);
				WebElement LicenseeTo = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[5]/div/div/div/input"));
				LicenseeTo.click();
				LicenseeTo.sendKeys(LicenseValidityToDate);

				WebElement baseTransmissionCapacityRight1 = driver
						.findElement(By.xpath("//input[@id='baseTransmissionCapacityRight']"));
				baseTransmissionCapacityRight1.sendKeys(BaseTransmissionCapacityMW);
				WebElement BTCRFrom = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[7]/div/div/div/input"));
				BTCRFrom.click();
				BTCRFrom.sendKeys(BTCRPeriodFromDate);
				WebElement BTCRTo = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[8]/div/div/div/input"));
				BTCRTo.click();
				BTCRTo.sendKeys(BTCRPeriodToDate);
				WebElement UploadAuthorizationFile = driver
						.findElement(By.xpath("//input[@id='supportingDocument']"));
				UploadAuthorizationFile.sendKeys(UploadAuthorizationLetter);
				WebElement Next1 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
				Next1.click();
				break;
			}
			case "Full Open Access": {
				WebElement foausername = driver.findElement(By.xpath("//input[@id='oaName']"));
				foausername.sendKeys(FOAUserName);

				driver.findElement(By.xpath("//input[@id='consumerType']")).click();
				List<WebElement> foatyp = driver.findElements(By.xpath("//ul[@id='consumerType-listbox']/li"));
				for (WebElement foatyps : foatyp) {
					if (foatyps.getText().equals(FOATypeFirst)) {
						foatyps.click();
						break;
					}
				}

				WebElement CapacityGrantedbySTUMWs = driver
						.findElement(By.xpath("//input[@id='contractDemandOrCapacityGrantedByStu']"));
				CapacityGrantedbySTUMWs.sendKeys(CapacityGrantedbySTUMW);

				WebElement foasub = driver.findElement(By.xpath("//input[@id='substationName']"));
				foasub.sendKeys(SubstationNames);

				driver.findElement(By.xpath("//input[@id='substationVoltageKv']")).click();
				List<WebElement> subvolttyp = driver
						.findElements(By.xpath("//ul[@id='substationVoltageKv-listbox']/li"));
				for (WebElement subvolttyps : subvolttyp) {
					if (subvolttyps.getText().equals(SubstationVoltageLevel1)) {
						subvolttyps.click();
						break;
					}
				}

				driver.findElement(By.xpath("//input[@id='distributionDetailsArea']")).click();
				List<WebElement> disarealist = driver
						.findElements(By.xpath("//ul[@id='distributionDetailsArea-listbox']/li"));
				for (WebElement disarealists : disarealist) {
					if (disarealists.getText().equals(DistributionicenseAreas)) {
						disarealists.click();
						break;
					}
				}

				driver.findElement(By.xpath("//input[@id='district']")).click();
				List<WebElement> disarealistbox = driver.findElements(By.xpath("//ul[@id='district-listbox']/li"));
				for (WebElement disarealistboxs : disarealistbox) {
					if (disarealistboxs.getText().equals(District)) {
						disarealistboxs.click();
						break;
					}
				}

				WebElement stuConnectivityMw = driver.findElement(By.xpath("//input[@id='stuGridConnectivityMw']"));
				stuConnectivityMw.sendKeys(STUGridConnectivitys);

				WebElement UploadSTUGriddocfile1 = driver
						.findElement(By.xpath("//input[@id='stuGridConnectivityMwDoc']"));
				UploadSTUGriddocfile1.sendKeys(UploadSTUGridConnectivitys);

				WebElement STUGriddate1 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[10]/div/div/input"));
				STUGriddate1.click();
				STUGriddate1.sendKeys(STUGridConnectivityDates);

				WebElement baseTcrInfoa = driver.findElement(By.xpath("//input[@id='baseTcrInfo']"));
				baseTcrInfoa.sendKeys(BaseTCRRelatedinfos);

				WebElement sldcPermissonLetterfile = driver.findElement(By.xpath("//input[@id='sldcPermissonLetter']"));
				sldcPermissonLetterfile.sendKeys(SLDCPermissonLetters);

				WebElement sldcPermissondates2 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[13]/div/div/input"));
				sldcPermissondates2.click();
				sldcPermissondates2.sendKeys(SLDCPermissionDatess);

				WebElement ConnectedMWLoad = driver.findElement(By.xpath("//input[@id='connectedLoadMw']"));
				ConnectedMWLoad.sendKeys(ConnectedLoadMWs);

				WebElement ScreenShotWCRfiless = driver.findElement(By.xpath("//input[@id='wcrScreenShot']"));
				ScreenShotWCRfiless.sendKeys(ScreenShotWCRfile);

				WebElement ScreenShotsdatess = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[16]/div/div/input"));
				ScreenShotsdatess.click();
				ScreenShotsdatess.sendKeys(Screenshotdatess);

				WebElement lastsuportdoc = driver.findElement(By.xpath("//input[@id='supportingDocument']"));
				lastsuportdoc.sendKeys(SupportingDocumentss);

			WebElement	checkbox=driver.findElement(By.xpath("//input[@name='realtimeVisibility']")); // check box
			checkbox.click();
				WebElement Next12 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
				Next12.click();
				break;

			}
			}

			// Payment details
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

			WebElement transdropdown = driver.findElement(By.id("transactionType"));

			transdropdown.click();
			Thread.sleep(5000);

			List<WebElement> PaymentModeList = driver.findElements(By.xpath("//ul[@id='transactionType-listbox']/li"));
			for (WebElement typeOfMatment : PaymentModeList) {
				if (typeOfMatment.getText().equals(PaymentMode)) {
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

			// PAYMENT DATE
			WebElement Paymentdate = driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']"));
			Paymentdate.click();
			Paymentdate.sendKeys(TransactionMonthYear);

			WebElement file3 = driver.findElement(By.xpath("//input[@id='supportingDocuments']"));
			file3.sendKeys(SupportingDocuments);

			WebElement next3 = driver.findElement(By.xpath("//button[text()='Next']"));
			//next3.click();
			// Subsmitting the application
			WebElement submitting = driver.findElement(By.xpath("//button[contains(@class,'css-18qgb0n')]"));
			submitting.click();
			Thread.sleep(5000);
			boolean loggedIn = false;
			try {
				WebElement successful = driver.findElement(By.xpath("//div[@class='MuiAlert-message css-18mfsq4']"));

				System.out.println("text-?>>>>" + successful.getText());
				loggedIn = successful.getText().equals(successText);
				System.out.println("loggedIn" + loggedIn);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (loggedIn == true) {
				System.out.println("New User is Registered successfully ");
				//ExcelUtils.setCellData(filepath, "Trader1", i, 46, "user is registered ");
			} else {
				System.out.println("New User is  Not Registered  ");
				//ExcelUtils.setCellData(filepath, "Trader1", i, 46, "user is Not registered ");

			}
			driver.navigate().refresh();

		}

		driver.quit();

	}
}