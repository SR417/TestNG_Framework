package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> obj=driver.getWindowHandles(); // for getting handles of all windows and store it in collection.
		Iterator<String> it= obj.iterator(); //iterators to loop through collections
		String Parent_window=it.next(); //To access first window
		String Child_window=it.next();  //To access first window
		
		driver.switchTo().window(Child_window); // to switch to child window.
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(Parent_window); // to switch to parent window.
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
