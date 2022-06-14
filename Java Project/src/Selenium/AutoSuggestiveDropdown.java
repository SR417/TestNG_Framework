package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		  // TODO Auto-generated method stub
		  
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		        
		        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		        Thread.sleep(5000);
		    //    Not a good approach
		    /*    driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
		        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
		        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ENTER);*/
		        
		        List<WebElement> obj=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		        for(WebElement k:obj) {
		         
		         if(k.getText().equalsIgnoreCase("India")) {
		          k.click();
		          break;
		         }
		         
		        }
		        
		        
		        
		        
		        

		 }

		}


