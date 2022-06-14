
package Homework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\y8rurw\\\\Desktop\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
		Set<String> obj= driver.getWindowHandles();
		Iterator<String> it=obj.iterator();
		
		String FirstTab =it.next();
		String SecondTab=it.next();
		
		driver.switchTo().window(SecondTab);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(FirstTab);
		System.out.println(driver.getCurrentUrl());
		
		
	
		
	}

}
