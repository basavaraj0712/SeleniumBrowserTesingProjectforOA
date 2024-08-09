package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().window().maximize();
     driver.get("http://13.235.72.170/mdm/index.php/");
     String currenttitle = driver.getTitle();
     System.out.println("Current title is " +currenttitle);
     if(currenttitle.equals("grid.reconnectenergy.com"))
     {
    	 System.out.println("title is matched");
    	 }
     else
     {
    	 System.out.println("Title is not matched ");
     }
     String Url = driver.getCurrentUrl();
     System.out.println("The current URL is" +Url);
     driver.findElement(By.id("username")).sendKeys("DVC2");
     driver.findElement(By.id("passowrd")).sendKeys("DVC2");
     driver.findElement(By.cssSelector("#btn_login")).click();
     driver.findElement(By.cssSelector(".fa")).click();
     Thread.sleep(5000);
     
    
     
     
     driver.quit();
  
	}

}
