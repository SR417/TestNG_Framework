package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) {
  
 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
    System.out.println(driver.switchTo().alert().getText());// To print the alert text
 // driver.switchTo().alert().accept();//To accept the alert
    
    driver.switchTo().alert().dismiss(); //To dismiss the alert
  //  driver.switchTo().alert().sendKeys("test"); // to send input in alert box
    
  
    
 
    }
}