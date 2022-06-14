package Homework;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestiveDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='autosuggest']")));
        //wait.until(ExpectedConditions.alertIsPresent());
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("us");
		
		
		//Thread.sleep(3000);
        
        List<WebElement> obj=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        for (WebElement a:obj) {
               	if(a.getText().equalsIgnoreCase("Belarus")) {
        		a.click();
        		break;
        	}
               	
               	
        	
        	
        }
        
		
		
		
	}
	
	
   	}


