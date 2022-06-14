package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\y8rurw\\\\Desktop\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> a= driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement b:a) {
			b.click();
		}
		
		driver.close();
		
		
		
		
	}

}
