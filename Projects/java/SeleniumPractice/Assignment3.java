package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		//LinText
		 WebElement clicked =driver.findElement(By.linkText("Phones"));
		 clicked.click();
		 System.out.println("Clicked link text is "+clicked);
		System.out.println("size" +clicked.getSize());
		
		//PartialLink Text
		//driver.findElement(By.partialLinkText("nes")).click();
		
		//total num link
		List<WebElement> numheaders = driver.findElements(By.className("nav-item"));
		System.out.println("total headers links are "+numheaders.size());
		System.out.println(" names "+numheaders);
//		if(numheaders.equals("nav-link"))
//		{
//			System.out.println("obj is present ");
//		}
//		else
//		{
//			System.out.println("not present");
//		}
		List<WebElement> numlinks = driver.findElements(By.tagName("a"));
		System.out.println("total num links is "+ numlinks.size());
		
		List<WebElement> numimgs = driver.findElements(By.tagName("img"));
		System.out.println("total num imgs is "+ numimgs.size());
		
		
driver.quit();	}

}
