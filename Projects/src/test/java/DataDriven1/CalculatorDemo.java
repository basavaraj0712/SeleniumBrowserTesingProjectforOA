package DataDriven1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String file = System.getProperty("user.dir")+"\\testdata\\datadri1.xlsx";
		int row = Excel.getRowCount(file , "sheet1");
		//System.out.println("==========="+row);
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
		
		for(int r=1;r<=row;r++)
		{
			//Reading data from Excel
			String pric=Excel.getCellData(file, "Sheet1",r,0);
			String rateofinterest=Excel.getCellData(file, "Sheet1",r,1);	
			String per1=Excel.getCellData(file, "Sheet1",r,2);
			String per2=Excel.getCellData(file, "Sheet1",r,3);
			String fre=Excel.getCellData(file, "Sheet1",r,4);
			String exp_mvalue=Excel.getCellData(file, "Sheet1",r,5);
			
			//Passing data into a Application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			Select perdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			
			Select fredrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByVisibleText(fre);
			//clicked on calculate
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); //clicked on calculate
			//validation
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test passed");
				Excel.setCellData(file, "sheet1", r, 7, "passed");
				Excel.fillGreenColor(file, "sheet1", r, 7);
			}
			else
			{
				System.out.println("Test failed");
				Excel.setCellData(file, "sheet1", r, 7, "failed");
				Excel.fillGreenColor(file, "sheet1", r, 7);
			}
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click(); // clicked on clear button
			
		} //ending of for loop
		
		driver.quit();

			



		}

	}



