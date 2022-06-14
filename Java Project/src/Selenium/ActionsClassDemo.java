package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {
 public static void main(String[] args) {
  
  //action --interface
  //actions --class
 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    Actions obj=new Actions(driver);
    WebElement a=driver.findElement(By.xpath("//button[@id='openwindow']"));
    obj.contextClick(a).perform();  //To perform the right click
    obj.doubleClick(a).perform(); //To perform double click
    
    

  
 }
}