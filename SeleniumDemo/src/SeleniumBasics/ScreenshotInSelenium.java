package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotInSelenium {
	
	public static void main(String[] args) throws IOException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\y8rurw\\\\Desktop\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		        
		        // taking screenshots
		   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src, new File("C:\\Sanket\\screenshot.png"));
		        
		  
		   ////Taking partial screenshot

		        WebElement b=driver.findElement(By.xpath("//input[@id='username']"));
		         
		        File src1 = b.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src1, new File("C:\\Sanket\\screenshot1.png"));
		   

		  
		  
		  
		 }
}