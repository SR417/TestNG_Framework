package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandling {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement a= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(a);//Identify the frame: tag name will be iframe or MB3 reload frame option will be available
		
		Actions obj=new Actions(driver);
		WebElement Souce=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		obj.dragAndDrop(Souce, Target).build().perform();
		
		driver.switchTo().defaultContent();//Switch back control outside the frame
		
		
		
		
		
		
		
	}

}
