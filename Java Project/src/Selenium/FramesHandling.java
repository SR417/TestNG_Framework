package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandling {
	
	public static void main(String[] args) {
		  
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://jqueryui.com/droppable/");
		    WebElement a=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		    driver.switchTo().frame(a);  //to take the control inside the frame
		    
		    Actions obj=new Actions(driver);
		    WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		    WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		    
		    obj.dragAndDrop(source,target).build().perform();
		    
		    driver.switchTo().defaultContent(); //switch back the control outside the frame
		    
		    
		   
		    
		 }

}
