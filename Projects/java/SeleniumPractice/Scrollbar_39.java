package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrollbar_39 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless=new");
		//option.addArguments("--incognito");
WebDriver driver = new ChromeDriver(option);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
driver.get("https://demo.nopcommerce.com/");
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
Thread.sleep(3000);
//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
System.out.println(js.executeScript("return window.pageYOffset"));
js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
Thread.sleep(3000);

System.out.println(js.executeScript("return window.pageYOffset"));
js.executeAsyncScript("window.scrollBy(0,1500)", "");
Thread.sleep(3000);

System.out.println(js.executeScript("return window.pageYOffset"));
js.executeScript("document.body.style.zoom=30%");
driver.quit();

	}

}
