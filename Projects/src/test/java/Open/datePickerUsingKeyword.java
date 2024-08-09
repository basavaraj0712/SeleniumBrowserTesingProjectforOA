package Open;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class datePickerUsingKeyword {

	public static void main(String[] args) throws InterruptedException {
		String monthyear = "May 2027";
		String Date ="27";
		
		//ChromeOptions (Headless testing)and (Incognito)
		//Hadless
		  ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless=new");
		 //option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		//Login to the application
		driver.get("http://3.130.91.46/HVPN/OA/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sou = ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(System.getProperty("user.dir")+"\\screenshot\\Kseb.png");
		sou.renameTo(trg);
		
		//Opning links in multiple winfow
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("http://13.235.72.170/hes-kseb/index.php");

		WebElement untextfield1 = driver.findElement(By.cssSelector("#userId"));
		untextfield1.sendKeys("LVL1_AEE");
		Actions act =new Actions(driver);
		
		//KeyWord
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		WebElement ele = driver.findElement(By.xpath("//main[@class='MuiBox-root css-l3v5bq']"));
		File page1 = ele.getScreenshotAs(OutputType.FILE);
		File page2=new File(System.getProperty("user.dir")+"\\screenshot\\page.png");
		page1.renameTo(page2);
		
		//Mouse Hover
		//WebElement app=driver.findElement(By.xpath("//h6[text()='Application']"));
        //act.moveToElement(app).click().perform();
        JavascriptExecutor js =(JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeigh)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //WebElement sr = driver.findElement(By.xpath("//div[contains(@class,'css-1tsvksn')]/h6[text()='Reports']"));
        
        //js.executeScript("argument[0].scrollIntoView();",sr);
       // System.out.println(js.executeScript("reutn window.pageYOffset;"));
//		WebElement pswtextfield1 = driver.findElement(By.cssSelector("#-password-login"));
//		pswtextfield1.sendKeys("LVL1_AEE");
//		driver.findElement(By.xpath("//button[@tabindex=\"0\"]")).click();
		//Clickin on report
		driver.findElement(By.xpath("//a[3]//*[name()='svg']")).click();
		//driver.findElement(By.xpath("//a[3]//div[1]//*[name()='svg']")).click();
		WebElement page = driver.findElement(By.xpath("//h6[contains(text(),'Reports')]"));
		//js.executeAsyncScript("document.body.style.zoom='40%'");
		//System.out.println(page.getText());
		if(page.getText().equals("Reports"))
		{
			System.out.println("Reports page is displayed");
		}
		else
		{
			System.out.println("Reports page is not displayed");
		
		//input DOB
		;
		}
		 driver.findElement(By.xpath("//div[@class='MuiGrid-root css-rfnosa']//button[@aria-label='Choose date']//*[name()='svg']")).click();
		 while(true)
			 
		 {
			 
			 String my = driver.findElement(By.xpath("//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
				int result=monthyear.compareTo(my);
			 //System.out.println("my " +my);
		if(my.equals(monthyear))
		{
			System.out.println("mtye" +my);
		break;	
		}
		//click previous button
		driver.findElement(By.xpath("//button[@title='Next month']")).click();
		//clicking forword button
		//driver.findElement(By.xpath("//button[@title='Previous month']")).click();

		
		//div[@class='MuiGrid-root css-rfnosa']//button[@aria-label='Choose date']//*[name()='svg'] from
	   //div[@class='MuiGrid-root css-twpaqg']//button[@aria-label='Choose date']//*[name()='svg'] to

		}
		 List<WebElement> dates = driver.findElements(By.xpath("(//div[@role='row'])//button"));
			//System.out.println("size is " +dates.size());
		 for(WebElement date:dates)
			{
				if(date.getText().equals(Date))
				{
				
					date.click();
					System.out.println("dates " +date.getText());
					break;	
				}
					
				}
}
}
/*
Takes Screenshot
TakesScreenshot ts=(TakesScreenshot)driver;
File target=ts.getScreenshot(OutputType.FILE);
File source=new File(("user.dir"+"\\foldername\\pngname"));
target.renameTo(source);
*/

/*
 JavascriptExecutor
 JavascriptExecutor js=(JavascriptExecutor)driver;
 //scrolling intial to fixed position
 js.executeScript("window.scrollBy(0,1000)","");
 syso(js.executeScript("return window.pageYOffset;"))
 //scrolling at end
  js.executeScript("window.scrollBy(0,document.body.scrollHight)"));
  //scrolling where the element is present
   js.executeScript("argument[0].scrollIntoView();",element);
   
  //ZOOMING page
   js.executeScript("documt.body.style.zoom='60%'");
 */

