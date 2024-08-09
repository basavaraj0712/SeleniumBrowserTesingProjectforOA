
package DataDriven1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
//            boolean isInvalidCred = false;
//            try {
//                String invalidCredText = driver.findElement(By.xpath("//span[text()='Invalid Credentials']")).getText();
//                
//                isInvalidCred = invalidCredText.equals("Invalid Credentials");
//           
//            
//            } catch (NoSuchElementException e) {
//                // No invalid credentials message found
//            }
//
//            System.out.println("isInvalidCred: " + isInvalidCred);
//            if (isInvalidCred !=true) {
//            	
//            	System.out.println("Logged in successfully");
//              Excel.setCellData(Filepath, "sheet1", i, 5, "pass");
////            String actual = driver.findElement(By.xpath("//li/h6[text()='Dashboard']")).getTagName();
//
//              
//              driver.findElement(By.xpath("//button[@title='Logout']")).click();
//            } else {
//                System.out.println("Not Logged in");
//                Excel.setCellData(Filepath, "sheet1", i, 5, "failed");
////               
//            }
//        }
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
/*
 
 */
