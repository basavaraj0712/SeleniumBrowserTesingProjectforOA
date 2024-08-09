package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods27 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will opens new browser window
		
		Thread.sleep(5000);
		//driver.close(); // close single browser window where ever the driver is focused
		driver.quit(); // close all the browser windows
		

	}

}
