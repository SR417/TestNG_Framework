package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
 public static void main(String[] args) {
  
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    driver.findElement(By.xpath("//button[@id='openwindow']")).click();
    
    Set<String> obj=driver.getWindowHandles(); //This will give me the number of windows
                        //2 windows id
    
    Iterator<String> it= obj.iterator(); //To loop through collections
    String parent_window=it.next();  //parent window
    String child_Window=it.next(); //child window
  
    driver.switchTo().window(child_Window); //This will switch control to child window
    System.out.println(driver.getCurrentUrl());
    driver.close();
    
  
    driver.switchTo().window(parent_window);//This will switch control to parent window
    System.out.println(driver.getCurrentUrl()); 
    
    
    
  
 }
 
}