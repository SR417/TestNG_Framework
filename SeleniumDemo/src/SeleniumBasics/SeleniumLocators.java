package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  
        driver.get("https://login.salesforce.com/");
        
        driver.findElement(By.id("username")).sendKeys("test1");
        driver.findElement(By.name("pw")).sendKeys("Satara@123");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.linkText("Forgot Your Password?")).click(); 
        driver.findElement(By.name("cancel")).click();
        driver.findElement(By.partialLinkText("Forgot Your")).click();  
        
        System.out.println(driver.findElement(By.tagName("a")).getSize());
        
        driver.close();
		
		
		
	}
	

}
