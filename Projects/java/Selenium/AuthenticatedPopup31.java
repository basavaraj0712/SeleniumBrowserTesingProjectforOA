package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//syntax
		//http://username:password@the-internet.herokuapp.com/basic_auth
			
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
		driver.manage().window().maximize();


	}

}
