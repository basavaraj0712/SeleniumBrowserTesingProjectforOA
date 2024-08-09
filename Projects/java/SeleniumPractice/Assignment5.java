package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 {

public static void main(String[] args) throws InterruptedException {
		//brower launching
WebDriver driver = new ChromeDriver();
//maximize
driver.manage().window().maximize();
//wait method
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//passing the url
driver.get("https://testautomationpractice.blogspot.com");


//fetiching the title and matching
String title = driver.getTitle();
if(title.equals("Automation Testing Practice"))
{
System.out.println("Title is matched ");
}
else
{
	System.out.println("Title is not Matched ");
}
System.out.println(" And the Title is " +driver.getTitle());

//Checkin radio button is selected 
List<WebElement> rdo = driver.findElements(By.xpath("//input[@type=\"radio\" and @name=\"gender\"]"));
System.out.println("num of radio buttons are present "+rdo.size());

WebElement radioM = driver.findElement(By.xpath("//input[@id=\"male\"]"));
radioM.click();
WebElement radioF=driver.findElement(By.xpath("//input[@id=\"female\"]"));
radioF.click();
System.out.println("Radio button is selected "  +radioM.isSelected());
System.out.println("Radio button is selected "  +radioF.isSelected());
System.out.println("-------------------------------------------");
//Num of Check boxes
List<WebElement> chk = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
System.out.println("Number of Check boxes are available   " +chk.size());
Thread.sleep(3000);
 for(int i =0; i<chk.size();i++)
 {
	  chk.get(i).click();
 }

//2nd way
 Thread.sleep(3000);

for(WebElement selectcheck:chk)
{
	if(selectcheck.isSelected())
	{
	selectcheck.click();	
	}
}
Thread.sleep(3000);
// Selecting particular checkboxes
for(int i=0;i<chk.size();i++)
{
	if(i==1||i==5)
	{
	chk.get(i).click();
	}
}
System.out.println("-------------------------------------------");

//Checkboxes name's
 List<WebElement> name = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//div/label"));
 System.out.println("Name of Check boxes    " +name.size());

 for(WebElement lable:name)
 {
	 System.out.println("lables names " +lable.getText());
	 
 }
//Selecting the Checboxes

//checking field is enabled or not and printing that 
boolean search = driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).isEnabled();
System.out.println("search field is enabled "  +search);


// passing the data
driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("testing");
driver.findElement(By.cssSelector("input[type='submit']")).click();


//counting the number of links are there
List<WebElement> numlinks = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
System.out.println("number of links is "  +numlinks.size());//5


//printing the links and the click
for(WebElement print:numlinks)
{
	System.out.println("printing the links " +print.getText());
	print.click();
	
}
// capature the all windowIds
Set<String> windIds = driver.getWindowHandles();
System.out.println("Switching to each browser window and getting the titles........"); 
for(String WindId:windIds)
{
	
	String titles = driver.switchTo().window(WindId).getTitle();
	System.out.println(" Printed titles names are "  +titles);
	
	// Printing the current ULS
	String titlesURK = driver.switchTo().window(WindId).getCurrentUrl();
	System.out.println(" Printed URL names are "  +titlesURK);

	//Closeing the particular browser window
if(titles.equals("Test - Wikipedia")||titles.equals("Testing cosmetics on animals - Wikipedia"))
{
	driver.close();
}
if(titles.equals("Testing effect - Wikipedia")||titles.equals("Testing and inspection of diving cylinders - Wikipedia"))
{
	driver.close();
}
if(titles.equals("Testing (album) - Wikipedia"))
{
	driver.close();
}
	}
//WebDriverWait maywait=new WebDriverWait(driver,Duration.ofSeconds(15));



driver.quit();
	}

}
