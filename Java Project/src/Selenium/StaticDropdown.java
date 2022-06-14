package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
 public static void main(String[] args) {
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        WebElement a=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
       Select s=new Select(a);
       s.selectByIndex(0);
       s.selectByValue("AED");
       s.selectByVisibleText("USD");
        
        
        
 }

}