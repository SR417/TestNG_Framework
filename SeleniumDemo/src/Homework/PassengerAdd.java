package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassengerAdd {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		for(int i=0;i<4;i++) {
			a.click();
		}
		
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		driver.quit();
		
		
		
	}

}
