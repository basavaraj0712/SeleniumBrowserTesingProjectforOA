package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentForWebdriverMthods27 {

	public static void main(String[] args) throws Exception     {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://13.235.72.170/mdm/index.php/");
    Thread.sleep(5000);
    
    //isDisplayed method
    boolean header = driver.findElement(By.xpath("//*[@id='clienttext']")).isDisplayed();
    System.out.println("Header is diaplayed   "   +header);
    
    // isEnabled method with user and oparator in xpath
    boolean username = driver.findElement(By.xpath("//*[@name=\"username\" and @id=\"username\"]")).isEnabled();
    System.out.println("username text field is Enabled" +username);
     
   //Useing getWindowHandle method
    String CurrentWindowID = driver.getWindowHandle();
    System.out.println("CurrentWindowId is "  +CurrentWindowID);
     
    //Check for the DVC logo is displayed
    boolean dvclogo = driver.findElement(By.xpath("//div[@id=\"clientlogo\"]/img")).isDisplayed();
    System.out.println("dvc logo is displayed "+dvclogo);
    
    //Check for the DVC logo is Enabled
    boolean dvclogoenabled = driver.findElement(By.xpath("//div[@id=\"clientlogo\"]/img")).isEnabled();
    System.out.println("dvc logo is E "+dvclogoenabled);
    
    //Login to the application
    driver.findElement(By.xpath("//*[@name=\"username\" and @id=\"username\"]")).sendKeys("DVC2");
    driver.findElement(By.xpath("//input[@id=\"passowrd\"  and @name=\"password\"]")).sendKeys("DVC2");
    driver.findElement(By.cssSelector(" #btn_login")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[text()=\"Consumer\"]/..")).click();
    		Thread.sleep(1000);
    driver.close();
    }
	
	

}
