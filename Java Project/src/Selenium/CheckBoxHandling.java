package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CheckBoxHandling {
 
 public static void main(String[] args) {
  
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
    /*    WebElement a= driver.findElement(By.xpath("//input[@id='checkBoxOptionl']"));
        a.click(); 
        
        
        
        
        //now i want to click on all the checkboxes
        
        //find out the comman attribute and value in all checkboxes
        //put the elements in list of elements
        //use for each loop
        
        List<WebElement> b=driver.findElements(By.xpath("//input[@type='checkboxk']"));
        System.out.println(b.size());
        for(WebElement c:b) {
         
         c.click();
        }
        */
       //i want to select 10 checboxes from total 30 checkboxes
        
        List<WebElement> c=driver.findElements(By.xpath("//input[@type='checkbox']"));
      for(int i=0;i<2;i++) {
       c.get(i).click();
      }
        
       
        
        
        
//diffrence between findement and findElements
  
  //When we have single element we will use findlement----no such element: Unable to locate element: 
  //when we have multiple elements we will use findElements --this will return empty list
        
 
        
     //checkboxes methods--
      
      WebElement a= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
      a.click();
      System.out.println( a.isDisplayed()); //true
      System.out.println(a.isEnabled()); //true
      System.out.println(a.isSelected());//false
        
        
        
        
        
        
        

        
        
 }

}