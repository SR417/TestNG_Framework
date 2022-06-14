package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium {
 //Selenium waits OR synchronization in selenium
 
 //Static -
 //Thread.sleep- java--Not recommonded
 
 //Dynamic--  
 //Implicit wait-- We will declare globally
 //Explicit wait- Applicable to the specific element
    //Webdriver wait
    //Fluent wait
    
 

 public static void main(String[] args) {
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     
     driver.findElement(By.id("username")).sendKeys("test1");  //5 seconds
        driver.findElement(By.name("pw")).sendKeys("test234");//15 seconds
        
        //Explcit wait--Webdriver wait
        WebDriverWait wait=new  WebDriverWait (driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("driver.findElement(By.id('Login'))")));
           
        
        driver.findElement(By.id("Login")).click(); // 15 seconds
    
       driver.findElement(By.linkText("Forgot Your Password?")).click();
        
        driver.findElement(By.partialLinkText("Forgot Your")).click();
        
     //Explicite wait-Fluent wait-
        
        FluentWait wait1 = new FluentWait(driver); 
     
     wait1.withTimeout(Duration.ofSeconds(30));   
    
     wait1.pollingEvery(Duration.ofSeconds(5));  
    
     wait1.ignoring(NoSuchElementException.class) ;  //Specify what exceptions to ignore
     
     wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='checkBoxOption1']")));
   //This is how we specify the condition to wait on. 
        
     
     
 }

}