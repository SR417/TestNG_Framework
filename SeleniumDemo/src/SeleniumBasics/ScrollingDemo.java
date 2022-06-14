package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();  
    JavascriptExecutor js=(JavascriptExecutor)driver; //convert driver to JavascriptExecutor
    //to scroll down the page         X  Y pixel
    js.executeScript("window.scrollBy(0,600)");
    
    
    //to scroll up the page           X  Y pixel
    js.executeScript("window.scrollBy(0,-600)");
    
    //to scroll Left the page         X  Y pixel
    js.executeScript("window.scrollBy(-600,0)");
    
    //to scroll Right the page         X  Y pixel
    js.executeScript("window.scrollBy(600,0)");
    
    //This will scroll the page till the element is found.
    WebElement a=driver.findElement(By.xpath("xpath of element"));
    js.executeScript("arguments[0].scrollIntoView();",a);    
    a.click(); 
    
    js.executeScript("window.scrollBy(0,socument.body.scrillheight)");
    
   
    
    

}
}
