package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Action-Interface
		//Actions-Class
		Actions obj= new Actions(driver); //Default class for actions related to keybaord and mouse
		WebElement a=driver.findElement(By.xpath("//button[@id='openwindow']"));
		obj.contextClick(a).perform(); // to perform right click
		obj.doubleClick(a).perform();
		
		
		
		
	}
}
