package SeleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.annotation.AnnotationList.Explicit;

public class WaitsInSelenium {
	//Selenium waits or synchronization in selenium
	
	//Static: Thread.sleep:From Java,causes performance issue so not recomennded
	
	//Dynamic: Both from selenium
	//Implicit wait: declare globally
	//Explicit wait: to specific element
	          //WebDriver wait:
	          //Fluent wait
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("username")).sendKeys("test1"); // 5sec
        driver.findElement(By.name("pw")).sendKeys("Satara@123"); //15 sec
        
        //WebDriver Wait
      //If website is stable and 2-3 elements are failing then I will go with explicit wait.
        // If timeout is varying for most of the elements then I will go with Explicit.
        //If all the elements are require equal timeouts, I will go with implicit.
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath of login")));
        wait.until(ExpectedConditions.alertIsPresent());
        
        //Fluent Wait: 
        FluentWait wait1 =new FluentWait(driver);
        
        wait.withTimeout(Duration.ofSeconds(30));//total time
        
        wait.pollingEvery(Duration.ofSeconds(5));//Interval
        
        wait.ignoring(NoSuchElementException.class);
        
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath of login")));
        
        
        driver.findElement(By.id("Login")).click(); // 20 sec
        
        
        driver.findElement(By.linkText("Forgot Your Password?")).click(); 
        driver.findElement(By.name("cancel")).click();
        driver.findElement(By.partialLinkText("Forgot Your")).click();  
        
      
        		
        System.out.println(driver.findElement(By.tagName("a")).getSize());
        
        driver.close();
		
		
		
		
	}

}
