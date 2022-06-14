package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConecpt {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Advantages:
		//1.Testing is happening behind the scenes. No browser is launched
		//2.Very fast: Performance improvement
		//Disadvantage: Not suitable for action class
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		
		

}
}
