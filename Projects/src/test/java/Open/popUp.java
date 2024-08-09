package Open;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("http://3.130.91.46/HVPN/OA/");
		driver.manage().window().maximize();
		WebElement untextfield1 = driver.findElement(By.cssSelector("#userId"));
		untextfield1.sendKeys("LVL1_AEE1");
		WebElement pswtextfield1 = driver.findElement(By.cssSelector("#-password-login"));
		pswtextfield1.sendKeys("LVL1_AEE1");
		driver.findElement(By.xpath("//button[@tabindex='0']")).click();
		String isInvalidCred = driver.findElement(By.xpath("//span[text()='Invalid Credentials']")).getText();
		System.out.println(isInvalidCred);
		String actual = driver.findElement(By.xpath("//li/h6[text()='Dashboard']")).getText();
		System.out.println(actual);
		if(actual.equals("Dashboard"))
		{
			System.out.println("logged in");
			driver.findElement(By.xpath("//button[@title='Logout']")).click();

		}
		else
		{
			System.out.println("not");
		}
	driver.quit();
	}

}
