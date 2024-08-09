package Open;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

//	private static Object Reports;

	//private static final Object "" = null;
//	static Month convertMonth(String month1)
//	{
//	HashMap<String, Month> monthMap = new HashMap<String,Month>();
//	monthMap.put("", Month.JANUARY);
//	monthMap.put("", Month.FEBRUARY);
//	monthMap.put("", Month.MARCH);
//	monthMap.put("April", Month.APRIL);
//    monthMap.put("May", Month.MAY);
//    monthMap.put("June", Month.JUNE);
//    monthMap.put("July", Month.JULY);
//    monthMap.put("August", Month.AUGUST);
//    monthMap.put("September", Month.SEPTEMBER);
//    monthMap.put("October", Month.OCTOBER);
//    monthMap.put("November", Month.NOVEMBER);
//    monthMap.put("December", Month.DECEMBER);
//    Month newmonth=monthMap.get(month1);
//    if(newmonth==null)
//    {
//    	System.out.println("Month is not preseny");
//    }
//		return newmonth;
//	}
//	static void Dateselect(WebDriver driver,String year,String month,String date) throws InterruptedException
//	{
//		//Year selection > clicking on calender	 
//		 driver.findElement(By.xpath("//div[@class='MuiGrid-root css-rfnosa']//button[@aria-label='Choose date']//*[name()='svg']")).click();
//		 //Clicking on year dropdown
//		 driver.findElement(By.xpath("//button[contains(@class,'css-jmkkbb')]//*[name()='svg']")).click();
//		 Thread.sleep(5000);
//		 //Capture all the year and selecting the particular year
//		 List<WebElement> years = driver.findElements(By.xpath("//div[@class='MuiYearCalendar-root css-1flha1h']//div"));
//		 for(WebElement yer:years)
//		 {
//			 if(yer.getText().equals(year))
//			 {
//				 yer.click();
//			 }
//		 }
//		  
//		 
//		 //Month selection
//		 while(true)
//		 {
//			String Months = driver.findElement(By.xpath("/div[@id=':r1k:-grid-label']")).getText();
//		 //conveting req month & display month
//			Month expectedMonth=convertMonth(month);
//			Month CurrentMonth=convertMonth(year);
//			
//			//compare 
//			int result = expectedMonth.compareTo(CurrentMonth);
//			if(result<0)
//			{
//				driver.findElement(By.xpath("//button[@title=\"Previous month\"]")).click();
//			}
//			else if(result>0)
//			{
//				driver.findElement(By.xpath("//button[@title=\"Next month\"]")).click();
//			}
//			else {
//				break;
//			}
//		 
//		 
//		 }
//		 //div[@id=":r1k:-grid-label"]
//		 
//		//Dates selection
//			 List<WebElement> dates = driver.findElements(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']/div/button[@role='gridcell']"));
//			 for(WebElement Date :dates)
//			 {
//				if(Date.getText().equals(date));
//				Date.click();
//			 }
//		 
	//}
	 
	public static void main(String[] args) throws InterruptedException  {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
//Login to the application
driver.get("http://3.130.91.46/HVPN/OA/");
JavascriptExecutor js=(JavascriptExecutor)driver;

WebElement untextfield1 = driver.findElement(By.cssSelector("#userId"));
untextfield1.sendKeys("LVL1_AEE");
WebElement pswtextfield1 = driver.findElement(By.cssSelector("#-password-login"));
pswtextfield1.sendKeys("LVL1_AEE");
driver.findElement(By.xpath("//button[@tabindex='0']")).click();
System.out.println("title is "   +driver.getTitle());
//Clickin on report
//driver.findElement(By.xpath("//a[3]//*[name()='svg']")).click();
//driver.findElement(By.xpath("//a[3]//div[1]//*[name()='svg']")).click();


//js.executeScript("arguments[0].setAttribute('value','LVL3_SE')",untextfield1);
//js.executeScript("arguments[0].setAttribute('value','LVL3_SE')", pswtextfield1);
//js.executeScript("arguments[0].click()",click);
WebElement page = driver.findElement(By.xpath("//h6[contains(text(),'Reports')]"));
System.out.println(page.getText());
if(page.getText().equals("Reports"))
{
	System.out.println("Reports page is displayed");
}
else
{
	System.out.println("Reports page is not displayed");
}
// this xpath is only for that radio button
//List<WebElement> search = driver.findElements(By.xpath("//div[contains(@class,'css-p58oka')]//span[1]"));
//System.out.println(  +search.size());
//for( WebElement user:search)
//{
//	 System.out.println(user.getText());
//}
List<WebElement> search = driver.findElements(By.xpath("//div[contains(@class,'css-p58oka')]//label"));
 System.out.println(  +search.size());
 for( WebElement user:search)
 {
	 System.out.println(user.getText());
	 
	 if(user.getText().equals("Registration"))
	 {
		 user.click();
		
	 }
 }
	 List<WebElement> search1 = driver.findElements(By.xpath("//div[contains(@class,'css-19joo5k')]//label"));
	 System.out.println(  +search1.size());
	 for( WebElement user1:search1)
	 {
		 System.out.println(user1.getText());
		 
		 if(user1.getText().equals("Approved"))
		 {
			 user1.click();
		  
	 }
 }
	 String monthyear="April 2023";
	// String date="11";
	// Dateselect( driver, year, month, date) ;
	//Year selection > clicking on calender	 
	 driver.findElement(By.xpath("//div[@class='MuiGrid-root css-rfnosa']//button[@aria-label='Choose date']//*[name()='svg']")).click();

	 while(true)
		 
	 {
		 
	 
	String my = driver.findElement(By.xpath("//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
	if(my.equals(monthyear))
	{
	break;	
	}
	driver.findElement(By.xpath("//button[@title=\"Previous month\"]")).click();
//div[@class='MuiGrid-root css-rfnosa']//button[@aria-label='Choose date']//*[name()='svg'] from
//div[@class='MuiGrid-root css-twpaqg']//button[@aria-label='Choose date']//*[name()='svg'] to

	}
	}

	}
